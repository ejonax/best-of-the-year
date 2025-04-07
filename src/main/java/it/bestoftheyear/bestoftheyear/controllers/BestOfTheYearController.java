package it.bestoftheyear.bestoftheyear.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class BestOfTheYearController {

    @GetMapping("/bestYear") 
    public String bestYear(Model model, @RequestParam (name="nome") String nomeMio, @RequestParam (name="cognome") String cognomeMio){
            model.addAttribute("nome",nomeMio);
            model.addAttribute("cognome",cognomeMio);
        
        return ("bestYear");

    }
    
}

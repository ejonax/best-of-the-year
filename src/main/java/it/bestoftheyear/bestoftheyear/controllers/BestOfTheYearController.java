package it.bestoftheyear.bestoftheyear.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.bestoftheyear.bestoftheyear.models.movie;
import it.bestoftheyear.bestoftheyear.models.song;


@Controller
@RequestMapping("/")
public class BestOfTheYearController {

    @GetMapping("/bestYear") 
    public String bestYear(Model model, @RequestParam (name="nome") String nomeMio, @RequestParam (name="cognome") String cognomeMio){
            model.addAttribute("nome",nomeMio);
            model.addAttribute("cognome",cognomeMio);
        
        return ("bestYear");

    }

    private List<movie> getBestMovies(){
        List<movie> listaFilm=new ArrayList<>();
        movie film1,film2,film3;

        film1=new movie(1, "La regina");
        film2=new movie(2, "Il manuale delle signorine");
        film3=new movie(3, "NCIS LA");

        listaFilm.add(film1);
        listaFilm.add(film2);
        listaFilm.add(film3);

        return listaFilm;
        
    }

    private List<song> getBestSongs(){

        List<song> listaCanzoni=new ArrayList<>();
        song canzone1,canzone2,canzone3;

        canzone1=new song("Luce", 1);
        canzone2=new song("Il senso della vita", 2);
        canzone3=new song("Balorda nostalgia", 3);

        listaCanzoni.add(canzone1);
        listaCanzoni.add(canzone2);
        listaCanzoni.add(canzone3);

        return listaCanzoni;
    }

    @GetMapping("/movies")
    public String bestMovies(Model model){
          
    String stringaLungaListaFilm="";
    List<movie> listaFilm=getBestMovies();

    for (int i = 0; i < listaFilm.size(); i++) {
    
        stringaLungaListaFilm = stringaLungaListaFilm + listaFilm.get(i).getNomeFilm();
        if (i<listaFilm.size()-1){
            stringaLungaListaFilm = stringaLungaListaFilm + ", ";
        } 
    }

    model.addAttribute("listaTitoliFilm", stringaLungaListaFilm);
    return ("movies");
    }

    @GetMapping("/songs")
    public String bestSongs(Model model){
        String stringaLungaListaCanzoni="";
        List<song> listaCanzoni=getBestSongs();

        for (int i=0; i<listaCanzoni.size(); i++) {
            stringaLungaListaCanzoni = stringaLungaListaCanzoni + listaCanzoni.get(i).getNomeCanzone();
            if (i< listaCanzoni.size()-1) {
                stringaLungaListaCanzoni = stringaLungaListaCanzoni + ", ";
                
            }
        }

        model.addAttribute("listaTitoliCanzoni", stringaLungaListaCanzoni);
        return ("songs");
    }


    @GetMapping("/movies/{id}")
    public String bestMovieID(Model model, @PathVariable int id){
          
    String stringaFilmID="";
    List<movie> listaFilm=getBestMovies();

    for (int i = 0; i < listaFilm.size(); i++) {
        if (listaFilm.get(i).getIdFilm()==id){
            stringaFilmID = listaFilm.get(i).getNomeFilm();
            break;
        } 
    }

    model.addAttribute("stringaFilmID", stringaFilmID);
    return ("sceltaFilm");
    }


    @GetMapping("/movies2")
    public String bestMovieID2(Model model, @RequestParam int id){
          
    String stringaFilmID2="";
    List<movie> listaFilm2=getBestMovies();

    for (int i = 0; i < listaFilm2.size(); i++) {
        if (listaFilm2.get(i).getIdFilm()==id){
            stringaFilmID2 = listaFilm2.get(i).getNomeFilm();
            break;
        } 
    }

    model.addAttribute("stringaFilmID2", stringaFilmID2);
    return ("sceltaFilm2");
    }
   

    @GetMapping("/songs/{id}")
    public String bestSongID(Model model, @PathVariable int id){
          
    String stringaSongID="";
    List<song> listaCanzoni=getBestSongs();

    for (int i = 0; i < listaCanzoni.size(); i++) {
        if (listaCanzoni.get(i).getIdCanzone()==id){
            stringaSongID = listaCanzoni.get(i).getNomeCanzone();
            break;
        } 
    }

    model.addAttribute("stringaCanzoneID", stringaSongID);
    return ("sceltaCanzone");
    }

    @GetMapping("/songs")
    public String bestSongID2(Model model, @RequestParam int id){
          
    String stringaSongID2="";
    List<song> listaCanzoni2=getBestSongs();

    for (int i = 0; i < listaCanzoni2.size(); i++) {
        if (listaCanzoni2.get(i).getIdCanzone()==id){
            stringaSongID2 = listaCanzoni2.get(i).getNomeCanzone();
            break;
        } 
    }

    model.addAttribute("stringaCanzoneID2", stringaSongID2);
    return ("sceltaCanzone2");
    }
}
    

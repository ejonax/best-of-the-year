package it.bestoftheyear.bestoftheyear.models;

public class movie {

    private String nomeFilm;
    private int idFilm;

    public movie(int idFilm, String nomeFilm){
      this.nomeFilm=nomeFilm;
      this.idFilm=idFilm;
    }

    public String getNomeFilm(){
        return nomeFilm;
    }

    public void setNomeFilm(String nomeFilm){
        this.nomeFilm=nomeFilm;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    
}

package it.bestoftheyear.bestoftheyear.models;

public class song {

    private String nomeCanzone;
    private int idCanzone;

    public song(String nomeCanzone,int idCanzone){
      this.nomeCanzone=nomeCanzone;
      this.idCanzone=idCanzone;
    }


    public String getNomeCanzone(){
        return nomeCanzone;
    }

    public void setNomeCanzone(String nomeCanzone){
      this.nomeCanzone=nomeCanzone;
    }

    public int getIdCanzone(){
       return idCanzone;
    }

    public void setIdCanzone(int idCanzone){
        this.idCanzone=idCanzone;
    }
}

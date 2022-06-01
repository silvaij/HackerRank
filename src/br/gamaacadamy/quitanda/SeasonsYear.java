package br.gamaacadamy.quitanda;

public enum SeasonsYear {
    OUTONO("Outono"),INVERNO("Inverno"),PRIMAVERA("Primavera"),VERAO("Verão");

    private String seasons;
    SeasonsYear(String seasons){
        this.seasons = seasons;
    }

    String getSeasons(){
        return seasons;
    }
}

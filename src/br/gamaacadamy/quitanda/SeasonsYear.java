package br.gamaacadamy.quitanda;

public enum SeasonsYear {
    OUTONO("Outono"),INVERNO("Inverno"),PRIMAVERA("Primavera"),VERAO("Ver�o");

    private String seasons;
    SeasonsYear(String seasons){
        this.seasons = seasons;
    }

    String getSeasons(){
        return seasons;
    }
}

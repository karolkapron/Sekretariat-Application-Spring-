package com.example.demo.Components;

public class Adres {
    private int id;
    private String miasto;
    private String ulica;
    private String kod_pocztowy;

    public Adres(int id, String miasto, String ulica, String kod_pocztowy) {
        this.id = id;
        this.miasto = miasto;
        this.ulica = ulica;
        this.kod_pocztowy = kod_pocztowy;
    }


    public int getId() {
        return id;
    }

    public String getMiasto() {
        return miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public String getKod_pocztowy() {
        return kod_pocztowy;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public void setKod_pocztowy(String kod_pocztowy) {
        this.kod_pocztowy = kod_pocztowy;
    }

    @Override
    public String toString(){
        return "Adres[id=" +id+", ulica="+ulica+", miasto=" +miasto+", kod pocztowy="+kod_pocztowy+"]";
    }
}

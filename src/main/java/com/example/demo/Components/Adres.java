package com.example.demo.Components;

public class Adres {
    private int ID_ADRES;
    private String MIASTO;
    private String ULICA;
    private String KOD_POCZTOWY;

    public Adres(int ID_ADRES, String MIASTO, String ULICA, String KOD_POCZTOWY) {
        this.ID_ADRES = ID_ADRES;
        this.MIASTO = MIASTO;
        this.ULICA = ULICA;
        this.KOD_POCZTOWY = KOD_POCZTOWY;
    }

    public Adres(){}

    public int getId_adres() {
        return ID_ADRES;
    }

    public String getMiasto() {
        return MIASTO;
    }

    public String getUlica() {
        return ULICA;
    }

    public String getKod_pocztowy() {
        return KOD_POCZTOWY;
    }

    public void setId_adres(int ID_ADRES) {this.ID_ADRES = ID_ADRES;}

    public void setMiasto(String MIASTO) {this.MIASTO = MIASTO;}

    public void setUlica(String ulica) {this.ULICA = ULICA;}

    public void setKod_pocztowy(String KOD_POCZTOWY) {this.KOD_POCZTOWY = KOD_POCZTOWY;}

    @Override
    public String toString(){
        return "Adres[id=" + ID_ADRES +", ulica="+ULICA+", miasto=" +MIASTO+", kod pocztowy="+KOD_POCZTOWY+"]";
    }
}

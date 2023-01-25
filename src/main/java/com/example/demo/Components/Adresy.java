package com.example.demo.Components;

public class Adresy {
    public int ID_ADRES;
    public String MIASTO;
    public String ULICA;
    public String KOD_POCZTOWY;

    public Adresy(int ID_ADRES, String MIASTO, String ULICA, String KOD_POCZTOWY) {
        this.ID_ADRES = ID_ADRES;
        this.MIASTO = MIASTO;
        this.ULICA = ULICA;
        this.KOD_POCZTOWY = KOD_POCZTOWY;
    }

    public Adresy(){}

    public int getID_ADRES() {
        return ID_ADRES;
    }

    public String getMIASTO() {
        return MIASTO;
    }

    public String getULICA() {
        return ULICA;
    }

    public String getKOD_POCZTOWY() {
        return KOD_POCZTOWY;
    }

    public void setID_ADRES(int ID_ADRES) {this.ID_ADRES = ID_ADRES;}

    public void setMIASTO(String MIASTO) {this.MIASTO = MIASTO;}

    public void setULICA(String ULICA) {this.ULICA = ULICA;}

    public void setKOD_POCZTOWY(String KOD_POCZTOWY) {this.KOD_POCZTOWY = KOD_POCZTOWY;}

    @Override
    public String toString(){
        return "Adresy{" +
                "ID_ADRES=" + ID_ADRES +
                ", MIASTO='" + MIASTO + '\'' +
                ", ULICA='" + ULICA + '\'' +
                ", KOD_POCZTOWY='" + KOD_POCZTOWY +
                '}';
    }
}

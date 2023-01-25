package com.example.demo.Components;

public class Sekretariat {
    public int ID_SEKRETARIATU;
    public String NAZWA_SZKOLY;

    public int ID_ADRES;

    public Sekretariat(){}

    public Sekretariat(int ID_SEKRETARIATU, String NAZWA_SZKOLY, int ID_ADRES) {
        this.ID_SEKRETARIATU = ID_SEKRETARIATU;
        this.NAZWA_SZKOLY = NAZWA_SZKOLY;
        this.ID_ADRES = ID_ADRES;
    }

    public int getID_SEKRETARIATU() {return ID_SEKRETARIATU;}

    public void setID_SEKRETARIATU(int ID_SEKRETARIATU) {this.ID_SEKRETARIATU = ID_SEKRETARIATU;}

    public String getNAZWA_SZKOLY() {return NAZWA_SZKOLY;}

    public void setNAZWA_SZKOLY(String NAZWA_SZKOLY) {this.NAZWA_SZKOLY = NAZWA_SZKOLY;}

    public int getID_ADRES() {return ID_ADRES ;}

    public void setID_ADRES(int ID_ADRES) {this.ID_ADRES = ID_ADRES;}

    @Override
    public String toString() {
        return "Sekretariat{" +
                "ID_SEKRETARIATU=" + ID_SEKRETARIATU +
                ", NAZWA_SZKOLY='" + NAZWA_SZKOLY + '\'' +
                ", ID_ADRES=" + ID_ADRES +
                '}';
    }
}

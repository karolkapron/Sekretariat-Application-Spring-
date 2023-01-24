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

    public int getId_sekretariatu() {return ID_SEKRETARIATU;}

    public void setId_sekretariatu(int ID_SEKRETARIATU) {this.ID_SEKRETARIATU = ID_SEKRETARIATU;}

    public String getNazwa() {return NAZWA_SZKOLY;}

    public void setNazwa(String NAZWA_SZKOLY) {this.NAZWA_SZKOLY = NAZWA_SZKOLY;}

    public int getId_adresu() {return ID_ADRES ;}

    public void setId_adresu(int ID_ADRES) {this.ID_ADRES = ID_ADRES;}

    @Override
    public String toString() {
        return "Sekretariat{" +
                "ID_SEKRETARIATU=" + ID_SEKRETARIATU +
                ", NAZWA_SZKOLY='" + NAZWA_SZKOLY + '\'' +
                ", ID_ADRES=" + ID_ADRES +
                '}';
    }
}

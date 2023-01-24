package com.example.demo.Components;

public class Sekretariat {

    public int ID_SEKRETARIATU;
    public String NAZWA_SZKOLY;
    public int ID_ADRES;


    public Sekretariat(){};

    public Sekretariat(int id_sekretariatu, String nazwa, int id_adresu) {
        this.ID_SEKRETARIATU = id_sekretariatu;
        this.NAZWA_SZKOLY = nazwa;
        this.ID_ADRES = id_adresu;
    }

    public int getId_sekretariatu() {return ID_SEKRETARIATU;}

    public void setId_sekretariatu(int id_sekretariatu) {this.ID_SEKRETARIATU = id_sekretariatu;}

    public String getNazwa() {return NAZWA_SZKOLY;}

    public void setNazwa(String nazwa) {this.NAZWA_SZKOLY = nazwa;}

    public int getId_adresu() {return ID_ADRES ;}

    public void setId_adresu(int id_adresu) {this.ID_ADRES = id_adresu;}

    @Override
    public String toString() {
        return "Sekretariat{" +
                "ID_SEKRETARIATU=" + ID_SEKRETARIATU +
                ", NAZWA_SZKOLY='" + NAZWA_SZKOLY + '\'' +
                ", ID_ADRES=" + ID_ADRES +
                '}';
    }
}

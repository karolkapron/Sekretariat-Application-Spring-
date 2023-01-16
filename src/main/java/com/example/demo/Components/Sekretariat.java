package com.example.demo.Components;

public class Sekretariat {


    public int id_sekretariatu;
    public String nazwa_szkoly;
    public int id_adres;



    public Sekretariat(){}

    public Sekretariat(int id_sekretariatu, String nazwa, int id_adresu) {
        this.id_sekretariatu = id_sekretariatu;
        this.nazwa_szkoly = nazwa;
        this.id_adres = id_adresu;
    }



    public int getId_sekretariatu() {return id_sekretariatu;}

    public void setId_sekretariatu(int id_sekretariatu) {this.id_sekretariatu = id_sekretariatu;}

    public String getNazwa() {return nazwa_szkoly;}

    public void setNazwa(String nazwa) {this.nazwa_szkoly = nazwa;}

    public int getId_adresu() {return id_adres;}

    public void setId_adresu(int id_adresu) {this.id_adres = id_adresu;}

    @Override
    public String toString() {
        return "Sekretariat{" +
                "id_sekretariatu=" + id_sekretariatu +
                ", nazwa_szkoly='" + nazwa_szkoly + '\'' +
                ", id_adres=" + id_adres +
                '}';
    }



}

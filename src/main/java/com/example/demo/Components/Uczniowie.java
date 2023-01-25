package com.example.demo.Components;

import java.util.Date;

public class Uczniowie {
    public int ID_UCZNIA;
    public String IMIE;
    public String NAZWISKO;
    public String PESEL;
    public Date DATA_URODZENIA;
    public String PLEC;
    public int ID_SEKRETARIATU;
    public int ID_ADRES;

    public Uczniowie(){}

    public Uczniowie(int ID_UCZNIA, String IMIE, String NAZWISKO, String PESEL, Date DATA_URODZENIA, String PLEC, int ID_SEKRETARIATU, int ID_ADRES) {
        this.ID_UCZNIA = ID_UCZNIA;
        this.IMIE = IMIE;
        this.NAZWISKO = NAZWISKO;
        this.PESEL = PESEL;
        this.DATA_URODZENIA = DATA_URODZENIA;
        this.PLEC = PLEC;
        this.ID_SEKRETARIATU = ID_SEKRETARIATU;
        this.ID_ADRES = ID_ADRES;
    }

    public int getID_UCZNIA() {
        return ID_UCZNIA;
    }

    public void setID_UCZNIA(int ID_UCZNIA) {
        this.ID_UCZNIA = ID_UCZNIA;
    }

    public String getIMIE() {
        return IMIE;
    }

    public void setIMIE(String IMIE) {
        this.IMIE = IMIE;
    }

    public String getNAZWISKO() {
        return NAZWISKO;
    }

    public void setNAZWISKO(String NAZWISKO) {
        this.NAZWISKO = NAZWISKO;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    public Date getDATA_URODZENIA() {
        return DATA_URODZENIA;
    }

    public void setDATA_URODZENIA(Date DATA_URODZENIA) {
        this.DATA_URODZENIA = DATA_URODZENIA;
    }

    public String getPLEC() {
        return PLEC;
    }

    public void setPLEC(String PLEC) {
        this.PLEC = PLEC;
    }

    public int getID_SEKRETARIATU() {
        return ID_SEKRETARIATU;
    }

    public void setID_SEKRETARIATU(int ID_SEKRETARIATU) {
        this.ID_SEKRETARIATU = ID_SEKRETARIATU;
    }

    public int getID_ADRES() {
        return ID_ADRES;
    }

    public void setID_ADRES(int ID_ADRES) {
        this.ID_ADRES = ID_ADRES;
    }
    @Override
    public String toString() {
        return "Uczniowie{" +
                "ID_UCZNIA=" + ID_UCZNIA +
                ", IMIE='" + IMIE + '\'' +
                ", NAZWISKO='" + NAZWISKO + '\'' +
                ", PESEL='" + PESEL + '\'' +
                ", DATA_URODZENIA=" + DATA_URODZENIA +
                ", PLEC='" + PLEC + '\'' +
                ", ID_SEKRETARIATU=" + ID_SEKRETARIATU +
                ", ID_ADRES=" + ID_ADRES +
                '}';
    }
}

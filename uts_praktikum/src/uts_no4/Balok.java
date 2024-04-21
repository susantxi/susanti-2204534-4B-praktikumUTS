package uts_no4;

public class Balok {
    int panjang;
    int lebar;
    int tinggi;

    public Balok() {
        panjang = 1;
        lebar = 1;
        tinggi = 1;
    }

    public Balok(int panjangBaru, int lebarBaru, int tinggiBaru) {
        panjang = panjangBaru;
        lebar = lebarBaru;
        tinggi = tinggiBaru;
    }

    public int getLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    public int getKeliling() {
        return 4 * (panjang + lebar + tinggi);
    }

    public int getVolume() {
        return panjang * lebar * tinggi;
    }

    public void setPanjang(int panjangBaru) {
        panjang = panjangBaru;
    }

    public void setLebar(int lebarBaru) {
        lebar = lebarBaru;
    }

    public void setTinggi(int tinggiBaru) {
        tinggi = tinggiBaru;
    }
}

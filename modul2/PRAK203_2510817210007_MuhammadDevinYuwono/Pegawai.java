package modul2.PRAK203_2510817210007_MuhammadDevinYuwono;


// Disini error karena nama public class Employee
// ga sama dengan nama file Pegawai.java.
// Di Main juga objek dibuat dari class Pegawai.

// public class Employee {

public class Pegawai {

    public String nama;


    // Error karena char cuma bisa nyimpan satu karakter.
    // Sedangkan nilai asal berisi teks "Kingdom of Orvel" yang punya banyak karakter.

    // public char asal;

    public String asal;


    public String jabatan;
    public int umur;


    public String getNama() {
        return nama;
    }


    public String getAsal() {
        return asal;
    }


    // Disini Error karena method setJabatan tidak memiliki parameter,padahal variabel j digunakan di dalam method.
    // Selain itu pada Main method dipanggilnya pakai setJabatan("Assasin").

    // public void setJabatan() {

    public void setJabatan(String j) {
        this.jabatan = j;
    }
}
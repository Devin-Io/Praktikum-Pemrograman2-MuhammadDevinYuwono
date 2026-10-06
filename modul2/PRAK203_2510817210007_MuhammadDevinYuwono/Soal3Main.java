package modul2.PRAK203_2510817210007_MuhammadDevinYuwono;

public class Soal3Main {

    public static void main(String[] args) {

        Pegawai p1 = new Pegawai();


        // Disini Error karena setiap statement Java harus diakhiri dengan tanda titik koma (;).

        // p1.nama = "Roi"

        p1.nama = "Roi";


        p1.asal = "Kingdom of Orvel";

        p1.setJabatan("Assasin");


        // Nilai umur harus diberikan agar output sesuai dengan soal, yaitu 17 tahun.
        // Kalo ga diberikan nilai, int bakal memiliki nilai awal 0.

        p1.umur = 17;


        // Output awal pakai tulisan "Nama Pegawai",
        // sedangkan output yang diminta itu "Nama".

        // System.out.println("Nama Pegawai: " + p1.getNama());

        System.out.println("Nama: " + p1.getNama());


        System.out.println("Asal: " + p1.getAsal());

        System.out.println("Jabatan: " + p1.jabatan);


        // Output awal itu cuma menampilkan angka umur,
        // sedangkan output soal itu meminta tambahan kata "tahun".

        // System.out.println("Umur: " + p1.umur);

        System.out.println("Umur: " + p1.umur + " tahun");
    }
}
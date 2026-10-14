
package modul3.soal2;

public class Negara {
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggal;
    private int bulan;
    private int tahun;

    
    public Negara(String nama, String jenisKepemimpinan,
                  String namaPemimpin, int tanggal,
                  int bulan, int tahun) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    
    public Negara(String nama, String jenisKepemimpinan,
                  String namaPemimpin) {
        this(nama, jenisKepemimpinan, namaPemimpin, 0, 0, 0);
    }

    public String getNama() {
        return nama;
    }

    public String getJenisKepemimpinan() {
        return jenisKepemimpinan;
    }

    public String getNamaPemimpin() {
        return namaPemimpin;
    }

    public int getTanggal() {
        return tanggal;
    }

    public int getBulan() {
        return bulan;
    }

    public int getTahun() {
        return tahun;
    }
}

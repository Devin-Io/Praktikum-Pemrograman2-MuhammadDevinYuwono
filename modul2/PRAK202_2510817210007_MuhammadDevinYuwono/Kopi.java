package modul2.PRAK202_2510817210007_MuhammadDevinYuwono;

public class Kopi {

    public String namaKopi;
    public String ukuran;
    public double harga;

    private String pembeli;

    public Kopi() {

    }

    public void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp. " + harga);
    }

    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }

    public String getPembeli() {
        return pembeli;
    }

    public double getPajak() {
        return harga * 0.11;
    }
}
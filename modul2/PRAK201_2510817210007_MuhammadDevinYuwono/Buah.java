package modul2.PRAK201_2510817210007_MuhammadDevinYuwono;

public class Buah {

    private String namaBuah;
    private double berat;
    private double harga;
    private double jumlahBeli;

    public Buah(String namaBuah, double berat, double harga, double jumlahBeli) {
        this.namaBuah = namaBuah;
        this.berat = berat;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
    }

    private double hitungHargaSebelumDiskon() {
        double jumlahBuah = jumlahBeli / berat;
        return jumlahBuah * harga;
    }

    private double hitungDiskon() {
        double totalDiskon = 0;
        double hargaPerKg = harga / berat;

        int jumlahPerulangan = (int) (jumlahBeli / 4);

        for (int i = 0; i < jumlahPerulangan; i++) {
            totalDiskon += (4 * hargaPerKg) * 0.02;
        }

        return totalDiskon;
    }

    public void tampilkanInfo() {

        double hargaSebelumDiskon = hitungHargaSebelumDiskon();
        double totalDiskon = hitungDiskon();
        double hargaSetelahDiskon = hargaSebelumDiskon - totalDiskon;

        System.out.println("Nama Buah: " + namaBuah);
        System.out.println("Berat: " + berat);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah Beli: " + jumlahBeli + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f%n", hargaSebelumDiskon);
        System.out.printf("Total Diskon: Rp%.2f%n", totalDiskon);
        System.out.printf("Harga Setelah Diskon: Rp%.2f%n", hargaSetelahDiskon);
        System.out.println();
    }
}
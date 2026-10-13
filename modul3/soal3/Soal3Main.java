
package modul3.soal3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Soal3Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftar = new ArrayList<>();
        HashMap<String, Mahasiswa> indeksNim = new HashMap<>();

        while (true) {
            System.out.println("\n=== MENU MAHASISWA ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("5. Update Nama Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            String pilihan = input.nextLine().trim();

            switch (pilihan) {
                case "1":
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = input.nextLine().trim();

                    System.out.print("Masukkan NIM (harus unik): ");
                    String nim = input.nextLine().trim();

                    if (nama.isEmpty() || nim.isEmpty()) {
                        System.out.println("Nama dan NIM tidak boleh kosong.");
                    } else if (indeksNim.containsKey(nim)) {
                        System.out.println("NIM sudah terdaftar.");
                    } else {
                        Mahasiswa mhs = new Mahasiswa(nama, nim);
                        daftar.add(mhs);
                        indeksNim.put(nim, mhs);
                        System.out.println("Mahasiswa " + nama + " ditambahkan.");
                    }
                    break;

                case "2":
                    System.out.print("Masukkan NIM yang akan dihapus: ");
                    String nimHapus = input.nextLine().trim();

                    Mahasiswa dihapus = indeksNim.remove(nimHapus);

                    if (dihapus == null) {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    } else {
                        daftar.remove(dihapus);
                        System.out.println("Mahasiswa dengan NIM "
                                + nimHapus + " dihapus.");
                    }
                    break;

                case "3":
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nimCari = input.nextLine().trim();

                    Mahasiswa ditemukan = indeksNim.get(nimCari);

                    if (ditemukan == null) {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    } else {
                        System.out.println("NIM: " + ditemukan.getNim()
                                + ", Nama: " + ditemukan.getNama());
                    }
                    break;

                case "4":
                    if (daftar.isEmpty()) {
                        System.out.println("Daftar mahasiswa masih kosong.");
                    } else {
                        System.out.println("Daftar Mahasiswa:");

                        for (Mahasiswa m : daftar) {
                            System.out.println("NIM: " + m.getNim()
                                    + ", Nama: " + m.getNama());
                        }
                    }
                    break;

                case "5":
                    System.out.print("Masukkan NIM yang akan diupdate: ");
                    String nimUpdate = input.nextLine().trim();

                    Mahasiswa diupdate = indeksNim.get(nimUpdate);

                    if (diupdate == null) {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    } else {
                        System.out.print("Masukkan nama baru: ");
                        String namaBaru = input.nextLine().trim();

                        if (namaBaru.isEmpty()) {
                            System.out.println("Nama tidak boleh kosong.");
                        } else {
                            diupdate.setNama(namaBaru);
                            System.out.println(
                                    "Nama mahasiswa berhasil diupdate.");
                        }
                    }
                    break;

                case "0":
                    daftar.clear();
                    indeksNim.clear();
                    System.out.println("Terima kasih!");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        }
    }
}

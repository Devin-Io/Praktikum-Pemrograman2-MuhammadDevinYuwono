
package modul3.soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Soal2Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Negara> daftarNegara = new LinkedList<>();
        HashMap<Integer, String> namaBulan = new HashMap<>();

        String[] bulan = {
                "Januari", "Februari", "Maret", "April",
                "Mei", "Juni", "Juli", "Agustus",
                "September", "Oktober", "November", "Desember"
        };

        for (int i = 0; i < bulan.length; i++) {
            namaBulan.put(i + 1, bulan[i]);
        }

        System.out.print("Masukkan jumlah negara: ");
        int jumlah = Integer.parseInt(input.nextLine());

        if (jumlah < 1) {
            System.out.println("Jumlah negara minimal 1.");
            return;
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nNegara ke-" + (i + 1));

            System.out.print("Nama negara: ");
            String nama = input.nextLine();

            System.out.print("Jenis kepemimpinan (presiden/monarki/perdana menteri): ");
            String jenis = input.nextLine().trim().toLowerCase();

            if (jenis.equals("perdana mentri")) {
                jenis = "perdana menteri";
            }

            if (!jenis.equals("presiden") &&
                    !jenis.equals("monarki") &&
                    !jenis.equals("perdana menteri")) {
                System.out.println("Jenis kepemimpinan tidak dikenal.");
                return;
            }

            System.out.print("Nama pemimpin: ");
            String pemimpin = input.nextLine();

            if (jenis.equals("monarki")) {
                daftarNegara.add(
                        new Negara(nama, jenis, pemimpin)
                );
            } else {
                System.out.print("Tanggal kemerdekaan: ");
                int tanggal = Integer.parseInt(input.nextLine());

                System.out.print("Bulan kemerdekaan (1-12): ");
                int nomorBulan = Integer.parseInt(input.nextLine());

                System.out.print("Tahun kemerdekaan: ");
                int tahun = Integer.parseInt(input.nextLine());

                if (tanggal < 1 || tanggal > 31 ||
                        !namaBulan.containsKey(nomorBulan)) {
                    System.out.println("Tanggal atau bulan tidak valid.");
                    return;
                }

                daftarNegara.add(
                        new Negara(nama, jenis, pemimpin,
                                tanggal, nomorBulan, tahun)
                );
            }
        }

        System.out.println("\n=== HASIL DATA NEGARA ===");

        for (Negara negara : daftarNegara) {
            String jenis = negara.getJenisKepemimpinan();
            String gelar;

            if (jenis.equals("monarki")) {
                gelar = "Raja";
            } else if (jenis.equals("presiden")) {
                gelar = "Presiden";
            } else {
                gelar = "Perdana Menteri";
            }

            System.out.println(
                    "Negara " + negara.getNama() +
                            " mempunyai " + gelar +
                            " bernama " + negara.getNamaPemimpin()
            );

            if (!jenis.equals("monarki")) {
                System.out.println(
                        "Deklarasi Kemerdekaan pada Tanggal " +
                                negara.getTanggal() + " " +
                                namaBulan.get(negara.getBulan()) + " " +
                                negara.getTahun()
                );
            }

            System.out.println();
        }

        input.close();
    }
}

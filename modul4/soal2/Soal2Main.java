
package modul4.soal2;

import java.util.Scanner;

public class Soal2Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = Integer.parseInt(input.nextLine());

        System.out.print("Nama hewan peliharaan: ");
        String nama = input.nextLine();

        System.out.print("Ras: ");
        String ras = input.nextLine();

        System.out.print("Warna Bulu: ");
        String warnaBulu = input.nextLine();

        if (pilihan == 1) {
            Kucing kucing = new Kucing(ras, nama, warnaBulu);
            kucing.displayDetailKucing();
        } else if (pilihan == 2) {
            System.out.print("Kemampuan : ");
            String[] kemampuan = input.nextLine().split(", ");

            Anjing anjing = new Anjing(nama, ras, warnaBulu, kemampuan);
            anjing.displayDetailAnjing();
        }

        input.close();
    }
}

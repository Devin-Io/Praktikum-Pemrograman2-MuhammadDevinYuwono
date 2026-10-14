
package modul3.soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Dadu> daftarDadu = new LinkedList<>();

        System.out.print("Masukkan jumlah dadu: ");
        int jumlah = Integer.parseInt(input.nextLine());

        if (jumlah < 1) {
            System.out.println("Jumlah dadu harus minimal 1.");
            return;
        }

        for (int i = 0; i < jumlah; i++) {
            daftarDadu.add(new Dadu());
        }

        int total = 0;

        for (int i = 0; i < daftarDadu.size(); i++) {
            int nilai = daftarDadu.get(i).getNilai();

            System.out.println("Dadu ke-" + (i + 1)
                    + " bernilai " + nilai);

            total += nilai;
        }

        System.out.println("Total nilai dadu keseluruhan " + total);
    }
}

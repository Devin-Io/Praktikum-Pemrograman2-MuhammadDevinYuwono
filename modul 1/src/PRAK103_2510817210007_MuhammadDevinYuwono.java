import java.util.Scanner;

public class PRAK103_2510817210007_MuhammadDevinYuwono {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan: ");
        int jumlah = input.nextInt();

        System.out.print("Masukkan angka awal: ");
        int angka = input.nextInt();

        int i = 0;

        do {
            if (angka % 2 == 0) {
                angka++;
            }

            System.out.print(angka);

            i++;

            if (i < jumlah) {
                System.out.print(", ");
            }

            angka += 2;

        } while (i < jumlah);

        input.close();
    }
}
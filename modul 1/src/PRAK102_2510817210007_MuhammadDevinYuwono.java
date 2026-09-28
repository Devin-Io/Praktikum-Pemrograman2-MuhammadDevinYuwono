import java.util.Scanner;

public class PRAK102_2510817210007_MuhammadDevinYuwono {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka awal: ");
        int angka = input.nextInt();

        int i = 1;

        while (i <= 11) {

            int hasil = angka;

            if (angka % 5 == 0) {
                hasil = angka / 5 - 1;
            }

            System.out.print(hasil);

            if (i < 11) {
                System.out.print(", ");
            }

            angka++;
            i++;
        }

        input.close();
    }
}
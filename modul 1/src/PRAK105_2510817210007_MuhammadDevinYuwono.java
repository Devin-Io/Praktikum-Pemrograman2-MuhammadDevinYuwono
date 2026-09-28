import java.util.Scanner;

public class PRAK105_2510817210007_MuhammadDevinYuwono {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double phi = 3.14;

        System.out.print("Masukkan jari-jari: ");
        double jari_jari = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();

        double volume = phi * jari_jari * jari_jari * tinggi;

        System.out.printf(
                "Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3",
                jari_jari, tinggi, volume
        );

        input.close();
    }
}
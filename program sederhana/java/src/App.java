import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Konversi suhu dari Reamur
        System.out.println("Masukkan suhu dalam Reamur:");
        double reamur = scanner.nextDouble();
        double celcius = konversiReamurKeCelcius(reamur);
        double fahrenheit = konversiReamurKeFahrenheit(reamur);
        double kelvin = konversiReamurKeKelvin(reamur);
        System.out.println("Suhu dalam Celcius: " + celcius);
        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);
        System.out.println("Suhu dalam Kelvin: " + kelvin);

        // Hitung Umur
        System.out.println("Masukkan tahun lahir Anda:");
        int tahunLahir = scanner.nextInt();
        int umur = hitungUmur(tahunLahir);
        System.out.println("Umur Anda adalah: " + umur);

        // Menghitung Luas dan Keliling Segitiga
        System.out.println("Masukkan panjang sisi pertama segitiga:");
        double sisi1 = scanner.nextDouble();
        System.out.println("Masukkan panjang sisi kedua segitiga:");
        double sisi2 = scanner.nextDouble();
        System.out.println("Masukkan panjang sisi ketiga segitiga:");
        double sisi3 = scanner.nextDouble();
        double luas = hitungLuasSegitiga(sisi1, sisi2, sisi3);
        double keliling = hitungKelilingSegitiga(sisi1, sisi2, sisi3);
        System.out.println("Luas segitiga adalah: " + luas);
        System.out.println("Keliling segitiga adalah: " + keliling);

        scanner.close();
    }

    public static double konversiReamurKeCelcius(double reamur) {
        return (5.0 / 4.0) * reamur;
    }

    public static double konversiReamurKeFahrenheit(double reamur) {
        return (9.0 / 4.0) * reamur + 32;
    }

    public static double konversiReamurKeKelvin(double reamur) {
        return (5.0 / 4.0) * reamur + 273.15;
    }

    public static int hitungUmur(int tahunLahir) {
        int tahunSekarang = 2024; // Tahun saat ini
        return tahunSekarang - tahunLahir;
    }

    public static double hitungLuasSegitiga(double sisi1, double sisi2, double sisi3) {
        double s = (sisi1 + sisi2 + sisi3) / 2.0;
        return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }

    public static double hitungKelilingSegitiga(double sisi1, double sisi2, double sisi3) {
        return sisi1 + sisi2 + sisi3;
    }
}

package mobil;

import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input data Mobil 1
        Mobil m1 = new Mobil();
        System.out.println("=== Input Data Mobil 1 ===");
        System.out.print("Masukkan Kecepatan: ");
        m1.setKecepatan(sc.nextInt());
        sc.nextLine();
        System.out.print("Masukkan Manufaktur: ");
        m1.setManufaktur(sc.nextLine());
        System.out.print("Masukkan Nomor Plat: ");
        m1.setNoPlat(sc.nextLine());
        System.out.print("Masukkan Warna: ");
        m1.setWarna(sc.nextLine());
        System.out.print("Masukkan Waktu (dalam jam): "); 
        m1.setWaktu(sc.nextDouble()); 
        System.out.println("===========================");
        m1.displayMessage();
        System.out.println("===========================");

        // Input data Mobil 2
        Mobil m2 = new Mobil();
        System.out.println("=== Input Data Mobil 2 ===");
        System.out.print("Masukkan Kecepatan: "); 
        m2.setKecepatan(sc.nextInt());
        sc.nextLine();
        System.out.print("Masukkan Manufaktur: "); 
        m2.setManufaktur(sc.nextLine());
        System.out.print("Masukkan Nomor Plat: "); 
        m2.setNoPlat(sc.nextLine());
        System.out.print("Masukkan Warna: "); 
        m2.setWarna(sc.nextLine());
        System.out.print("Masukkan Waktu (dalam jam): "); 
        m2.setWaktu(sc.nextDouble()); 
        System.out.println("===========================");
        m2.displayMessage();
        System.out.println("===========================");

        // Merubah warna dari objek m1
        System.out.println("Mobil pada objek m1 diubah menjadi warna hijau");
        m1.setWarna("Hijau");
        
        // Menampilkan hasil perubahan
        System.out.println("=== Hasil Perubahan ===");
        m1.displayMessage();
        System.out.println("===========================");

        sc.close();
    }
}
package com.Project.UAP;

import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    private static ArrayList<Tanaman> tanamans;
    private static ArrayList<Integer> lokasi;
    private static int masaTanam;

    public static void mulai() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan masa tanam (dalam bulan): ");
        int bulan = scanner.nextInt();
        int hari = bulan * 30;
        masaTanam = hari;

        System.out.println("Pilih tanaman untuk ditanam:");
        System.out.println("1. Tomat");
        System.out.println("2. Stroberi");
        System.out.println("3. Persik");

        tanamans = new ArrayList<>();
        lokasi = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Pilihan tanaman ke-" + (i + 1) + ": ");
            int pilihan = scanner.nextInt();
            menanam(pilihan);
        }

        for (int i = 1; i <= masaTanam; i++) {
            System.out.println("Hari ke-" + i);

            for (int j = 0; j < tanamans.size(); j++) {
                Tanaman tanaman = tanamans.get(j);

                if (!lokasi.contains(j)) {
                    tanaman.berkembang();
                    if (i % 90 == 0) {
                        treatment();
                    }
                } else {
                    continue;
                }

                if (tanaman.status().equals("Mati")) {
                    lokasi.add(j);
                    menanam(1);
                }
            }
        }
    }

    public static void menanam(int pilihan) {
        switch (pilihan) {
            case 1:
                tanamans.add(new Tomat());
                System.out.println("Berhasil menanam Tomat!");
                break;
            case 2:
                tanamans.add(new Stroberi());
                System.out.println("Berhasil menanam Stroberi!");
                break;
            case 3:
                tanamans.add(new Persik());
                System.out.println("Berhasil menanam Persik!");
                break;
            default:
                System.out.println("Pilihan tanaman tidak valid!");
                break;
        }
    }

    public static void info() {
        for (int i = 0; i < tanamans.size(); i++) {
            Tanaman tanaman = tanamans.get(i);
            System.out.println("Tanaman ke-" + (i + 1));
            System.out.println(tanaman.toString());
        }
    }
    private static void treatment() {
        for (Tanaman tanaman : tanamans) {
            if (!lokasi.contains(tanamans.indexOf(tanaman))) {
                if (tanaman instanceof Tomat) {
                    ((Tomat) tanaman).treatment();
                } else if (tanaman instanceof Stroberi) {
                    ((Stroberi) tanaman).treatment();
                } else if (tanaman instanceof Persik) {
                    ((Persik) tanaman).treatment();
                }
            }
        }
    }

}

package pratikumpertama1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KRS krs = new KRS();
        System.out.println("Silahkan memasukkan mata kuliah anda sebanyak 6 mata kuliah");
        System.out.println("Pada urutan ke-6, masukkan kata \"OK\" untuk mengakhiri proses input");
        System.out.println();
        for (int i = 1; i <= 6; i++) {
            System.out.print("Masukkan mata kuliah anda (ke-" + i + "): ");
            String input = sc.nextLine();
            if (i == 6 && !input.equalsIgnoreCase("OK")) {
                System.out.println("Error! Input tidak valid.");
                break;
            } else {
                krs.tambahMataKuliah(input);
                if (krs.getCondition()) {
                    break;
                }
            }
        }
        sc.close();
        krs.print();
    }
}
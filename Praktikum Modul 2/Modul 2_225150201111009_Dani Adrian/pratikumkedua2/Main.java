package pratikumkedua2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KRS krs = new KRS();
        System.out.println("Memasukan Mata Kuliah (5)");
        System.out.println("Ketik \"NULL\" jika selesai");
        System.out.println();
        while(krs.getCondition() == false)
        {
            System.out.print("Masukan Nama Mata Kuliah : ");
            String nama = sc.nextLine();
            if (nama.toUpperCase().equals("NULL"))
            {
                break;
            }
            System.out.print("Masukan Kode Mata Kuliah : ");
            String kode = sc.nextLine();

            krs.tambahMataKuliah(new MataKuliah(nama, kode));
        }
        sc.close();
        krs.print();
    }
}
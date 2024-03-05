package praktikumkeempat3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    KRS krs = new KRS();
    Mahasiswa m = new Mahasiswa();
    System.out.println("Masukan Data Mahasiswa : ");
    System.out.print("NIM	        : ");
    m.setNIM(sc.nextLine());
    System.out.print("Nama	        : ");
    m.setNama(sc.nextLine());
    System.out.print("Alamat	        : ");
    m.setAlamat(sc.nextLine());
    System.out.print("No Telp	        : ");
    m.setTelp(sc.nextLine());
    System.out.print("Jenis Kelamin	: ");
    m.setGender(sc.nextLine());
    System.out.print("Program Studi	: ");
    m.setProdi(sc.nextLine());
    
    System.out.println("Memasukan Mata Kuliah(5)");
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
    
    krs.tambahMataKuliah(new MataKuliah(nama,
    kode));
    }
    sc.close();
    krs.print(m);
    }
    }
        
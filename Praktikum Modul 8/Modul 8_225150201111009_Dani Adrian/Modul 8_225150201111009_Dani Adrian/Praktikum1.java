public class Praktikum1 {
public static void Penjumlahan(int a,int b) {
    int nilai = a+b;
    System.out.println("Hasil Penjumlahan : "+nilai);
    }
public static void Pengurangan(int a, int b){
    int nilai = a-b;
    System.out.println("Hasil Pengurangan : "+nilai);
    }
public void Perkalian(int a, int b){
    int nilai = a*b;
    System.out.println("Hasil Perkalian : "+nilai);
    }
public void Pembagian(double bagi, double bagi2) {
    System.out.println("Hasil Pembagian : "+bagi/bagi2);
}
public void Sederhana(int fpb1, int fpb2) {
    int FPB = searchforFPB(fpb1, fpb2);
    int a = fpb1/FPB;
    int b = fpb2/FPB;
    System.out.println("Hasil penyederhanaan : "+ a + "/" + b);
}
private int searchforFPB(int a, int b) {
    if (a%b == 0) {
    return b;
}
    return searchforFPB(a, a % b);
} 
}

public class LabKomdas {
final int jaketA, jaketB, jaketC;
public LabKomdas(int p, int q, int r) {
    jaketA = p > 100 ? 95000 : 100000;
    jaketB = q > 100 ? 100000 : 125000;
    jaketC = r > 100 ? 160000 : 175000;
        getJaket(jaketA, jaketB, jaketC);
    }
public void getJaket(int p, int q, int r) {
    System.out.println("Harga tetap jaket A : " + p);
    System.out.println("Harga tetap jaket B : " + q);
    System.out.println("Harga tetap jaket C : " + r);
    }
}

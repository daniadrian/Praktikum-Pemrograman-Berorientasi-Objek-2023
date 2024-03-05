import java.util.*;
public class MainPraktikumLabKomdas {
public static void main(String[] args) {
    Scanner newJaket = new Scanner(System.in);
    System.out.println("Masukan banyak");
    System.out.print("Jaket A : ");
        int jaketA = newJaket.nextInt();
    System.out.print("Jaket B : ");
        int jaketB = newJaket.nextInt();
    System.out.print("Jaket C : ");
        int jaketC = newJaket.nextInt();
    System.out.println();
    LabKomdas jaketbaru = new LabKomdas(jaketA, jaketB, jaketC);
    }
}

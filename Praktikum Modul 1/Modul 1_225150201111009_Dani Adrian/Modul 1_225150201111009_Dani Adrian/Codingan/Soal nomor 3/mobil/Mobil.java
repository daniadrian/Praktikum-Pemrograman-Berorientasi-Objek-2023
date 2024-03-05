package mobil;

public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public void setKecepatan(int i) {
        kecepatan = i;
    }

    public void displayMessage() {
        System.out.println("Mobil Anda adalah bermerek " + manufaktur);
        System.out.println("Memiliki nomor plat " + noPlat);
        System.out.println("Dengan warna " + warna);
        System.out.println("Dan mampu menempuh kecepatan " + kecepatan);
    }
}
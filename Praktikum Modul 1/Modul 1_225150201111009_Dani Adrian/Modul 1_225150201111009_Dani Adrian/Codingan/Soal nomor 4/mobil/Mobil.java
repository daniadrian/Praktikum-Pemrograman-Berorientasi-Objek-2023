package mobil;
public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu; // menambahkan variabel waktu

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
    
    public void setWaktu(double w) {
        waktu = w;
    }

    public void displayMessage() {
        System.out.println("Mobil Anda adalah bermerek " + manufaktur);
        System.out.println("Memiliki nomor plat " + noPlat);
        System.out.println("Dengan warna " + warna);
        System.out.println("Dan mampu menempuh kecepatan " + kecepatan);
        System.out.println("Dalam waktu " + waktu + " jam"); // menambahkan waktu ke dalam displayMessage
    }
}

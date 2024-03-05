package mobil;

public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan; 
    private double waktu;

    public void setWaktu(double w) {
        waktu = rubahSekon(w);
    }

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
        this.kecepatan = rubahKecepatan(i); 
    }

    private double rubahSekon(double w) {  
        return w * 60 * 60;       
    }

    private int rubahKecepatan(int i) { // rubah kecepatan dari km/jam ke m/detik
        return i * 10 / 36; 
    }

    public void displayMessage() {
        System.out.println("Mobil Anda adalah bermerek " + manufaktur);
        System.out.println("Memiliki nomor plat " + noPlat);
        System.out.println("Dengan warna " + warna);
        System.out.println("Dan mampu menempuh kecepatan " + kecepatan);
        System.out.println("Dalam waktu " + waktu + " detik");
    }
}

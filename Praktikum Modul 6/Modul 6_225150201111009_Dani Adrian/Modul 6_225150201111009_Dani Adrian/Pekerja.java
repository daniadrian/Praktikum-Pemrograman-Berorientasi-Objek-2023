import java.time.LocalDate;

public class Pekerja extends Manusia{
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String nik,
    boolean menikah, double gaji, int tahun, int bulan, int hari, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, hari);
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }
    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }
    public int getJumlahAnak() {
        return jumlahAnak;
    }
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus()
    {
        return (2023-tahunMasuk.getYear() <= 5) ? getGaji()/20 : 
        (2023-tahunMasuk.getYear() <= 10) ? getGaji()/10 : (3*getGaji())/20;
    }

    public double getTunjangan()
    {
        return super.getTunjangan()+(20*jumlahAnak);
    }

    public double getPendapatan()
    {
        return (getBonus()+getGaji()+getTunjangan());
    }

    public String toString()
    {
        String output =
        super.toString() +
        "Tahun Masuk    : " + getTahunMasuk() + "\n" +
        "Jumlah Anak    : " + getJumlahAnak() + "\n" +
        "Gaji           : " + getGaji() + "\n";

        return output;
    }


}

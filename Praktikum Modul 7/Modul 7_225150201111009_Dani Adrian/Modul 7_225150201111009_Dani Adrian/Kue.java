public abstract class Kue {
    private String nama;
    private double harga;

    Kue(String nama, double harga)
    {
        setNama(nama);
        setHarga(harga);
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }

    public abstract double hitungHarga();
    public String toString()
    {
        String output =
        "Nama           : " + getNama() + "\n" +
        "Harga          : " + getHarga() + "\n";

        return output;
    }
}

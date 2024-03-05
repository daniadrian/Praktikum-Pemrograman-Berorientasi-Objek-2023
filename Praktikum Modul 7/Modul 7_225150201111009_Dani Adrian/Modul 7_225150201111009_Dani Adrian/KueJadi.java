public class KueJadi extends Kue{
    private double jumlah;

    KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        setJumlah(jumlah);
    }

    @Override
    public double hitungHarga() {
        return getJumlah()*getHarga()*2;
    }

    @Override
    public String toString()
    {
        String output =
        super.toString() +
        "Jumlah         : " + getJumlah() + "\n" +
        "Jenis Kue      : Kue Jadi\n" +
        "Total Harga    : " + hitungHarga();

        return output;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }
    
}

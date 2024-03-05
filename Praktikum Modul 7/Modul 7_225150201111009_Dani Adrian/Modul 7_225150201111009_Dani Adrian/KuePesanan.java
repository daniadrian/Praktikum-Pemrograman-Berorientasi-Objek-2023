public class KuePesanan extends Kue{
    private double berat;

    KuePesanan(String nama, double harga, double berat)
    {
        super(nama, harga);
        setBerat(berat);
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    @Override
    public double hitungHarga()
    {
        return getHarga()*getBerat();
    }

    @Override
    public String toString()
    {
        String output =
        super.toString() +
        "Berat          : " + getBerat() + "\n" +
        "Jenis Kue      : Kue Pesanan\n" +
        "Total Harga    : " + hitungHarga() ;

        return output;
    }
}

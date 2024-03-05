public class Invoice implements Pembayaran {
    private String namaProduk;
    private int kuantitas;
    private int hargaPerItem;

    Invoice(String namaProduk, int kuantitas, int hargaPerItem) {
        this.namaProduk = namaProduk;
        this.kuantitas = kuantitas;
        this.hargaPerItem = hargaPerItem;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    public int getHargaPerItem() {
        return hargaPerItem;
    }

    public void setHargaPerItem(int hargaPerItem) {
        this.hargaPerItem = hargaPerItem;
    }

    public int getTotalPembayaran() {
        return getKuantitas() * getHargaPerItem();
    }

    public String print() {
    return "========================= BELANJA KARYAWAN=========================" + "\n" +  "Nama Produk : " + getNamaProduk() + "\n" + "Kuantitas : " + getKuantitas() + "\n" + "Harga per barang: " + getHargaPerItem() + "\n" + "Total harga : " + getTotalPembayaran() + "\n";
    }
}

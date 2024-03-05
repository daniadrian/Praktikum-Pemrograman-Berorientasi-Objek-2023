public class TokoKue {
    public static void main(String[] args) {
        Kue[] toko = new Kue[20];

        for (int i = 0; i < toko.length; i++) {
            if ((i+1)%5 == 0)
            {
                toko[i] = new KueJadi("Kue " + (i+1), i + 1 , i + 1);
            } else if ((i+1)%3 == 0)
            {
                toko[i] = new KueJadi("Kue " + (i+1), i + 1, i + 1);
            } else if ((i+1)%2 == 0)
            {
                toko[i] = new KuePesanan("Kue " + (i+1), i + 1, i + 1);
            } else 
            {
                toko[i] = new KuePesanan("Kue " + (i+1), i + 1, i + 1);
            }

            System.out.println(toko[i]);
        }

        double totalHargaSemuaJenis = 0;
        double totalHargaJadi = 0;
        double totalHargaPesanan = 0;
        double totalJumlah = 0;
        double totalBerat = 0;
        double hargaTerbesar = 0;

        for (int i = 0; i < toko.length; i++) {
            totalHargaSemuaJenis += toko[i].hitungHarga();
            hargaTerbesar = (toko[i].hitungHarga() > hargaTerbesar) ? toko[i].hitungHarga() : hargaTerbesar;
            if (toko[i] instanceof KueJadi)
            {
                totalHargaJadi += toko[i].hitungHarga();
                totalJumlah += ((KueJadi)toko[i]).getJumlah();
            }
            if (toko[i] instanceof KuePesanan)
            {
                totalHargaPesanan += toko[i].hitungHarga();
                totalBerat += ((KuePesanan)toko[i]).getBerat();
            }
        }

        System.out.println();
        System.out.println("Hasil : ");
        System.out.println("Total Harga Semua Jenis Kue : " + totalHargaSemuaJenis);
        System.out.println("Total Harga Kue Jadi        : " + totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi       : " + totalJumlah);
        System.out.println("Total Harga Kue Pesanan     : " + totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan     : " + totalBerat);
    }
}

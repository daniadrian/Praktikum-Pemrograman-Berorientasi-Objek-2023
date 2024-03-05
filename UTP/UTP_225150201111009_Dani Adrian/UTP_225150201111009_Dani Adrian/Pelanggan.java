public class Pelanggan {
    private String nama;
    private String nomorPelanggan;
    private Buku[] bukuPinjaman = new Buku[3];

    Pelanggan(String nama, String nomorPelanggan)
    {
        setNama(nama);
        setNomorPelanggan(nomorPelanggan);
    }


    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNomorPelanggan() {
        return nomorPelanggan;
    }
    public void setNomorPelanggan(String nomorPelanggan) {
        this.nomorPelanggan = nomorPelanggan;
    }

    public void tampilkanInfoPelanggan()
    {
        System.out.println("Nama                : " + getNama());
        System.out.println("Nomor Pelanggan     : " + getNomorPelanggan());
        System.out.print("Buku yang dipinjam  : ");

        if (bukuPinjaman[0] == null)
        {
            System.out.println("Tidak ada!");
            return;
        } else
        {
            for (int i = 0; i < bukuPinjaman.length; i++) {
                System.out.print(bukuPinjaman[i].getJudul());
                if (i == 2) break;
                if (bukuPinjaman[i+1] != null)
                {
                    System.out.print(", ");
                } else
                {
                    break;
                }
            }
        }
        System.out.println();

    }

    public void tambahBuku(Buku bukuPinjam)
    {
        if (bukuPinjaman[2] != null)
        {
            return;
        }

        for (int i = 0; i < bukuPinjaman.length; i++) {
            if (bukuPinjaman[i] == null) 
            {
                bukuPinjaman[i] = bukuPinjam; break;
            }
        }
    }

}
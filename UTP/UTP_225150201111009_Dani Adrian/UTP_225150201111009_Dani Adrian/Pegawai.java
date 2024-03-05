public class Pegawai{
    private String nama;
    private String nomorPegawai;

    Pegawai(String nama, String nomorPegawai)
    {
        setNama(nama);
        setNomorPegawai(nomorPegawai);
        System.out.println("Nama Pegawai    : " + getNama());
        System.out.println("Nomor Pegawai   : " + getNomorPegawai());
        System.out.println();
    }
    
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNomorPegawai() {
        return nomorPegawai;
    }
    public void setNomorPegawai(String nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
    }
    
    public void tampilkanInfoPegawai()
    {
        System.out.println("INFO PEGAWAI=========================");
        System.out.println("Nama            : " + getNama());
        System.out.println("Nomor Pegawai   : " + getNomorPegawai());
    }

    public void menambahPelanggan(String nama, String nomorPelanggan)
    {
        boolean temu = false;

        if (Perpustakaan.listPelanggan[Perpustakaan.listPelanggan.length-1] != null) return;

        if (Perpustakaan.listPelanggan[0] != null)
        {for (int i = 0; i < Perpustakaan.listPelanggan.length; i++) {
            if (Perpustakaan.listPelanggan[i].getNama() == nama)
            {
                temu = true;
                break;
            }
            if (Perpustakaan.listPelanggan[i+1] == null) break;
        }}

        if (temu)
        {
            return;
        }

        for (int i = 0; i < Perpustakaan.listPelanggan.length; i++) {
            if (Perpustakaan.listPelanggan[i] == null)
            {
                Perpustakaan.listPelanggan[i] = new Pelanggan(nama, nomorPelanggan);
                break;
            }
        }
    }

    public void menambahBuku(String judul, String penulis, int jumlah)
    {
        boolean temu = false;

        if (Perpustakaan.listBuku[Perpustakaan.listBuku.length-1] != null) return;

        if (Perpustakaan.listBuku[0] != null)
        {for (int i = 0; i < Perpustakaan.listBuku.length; i++) {
            if (Perpustakaan.listBuku[i].getJudul().equals(judul))
            {
                temu = true;
            }
            if (Perpustakaan.listBuku[i+1] == null) break;
        }}

        if (temu)
        {
            return;
        }

        for (int i = 0; i < Perpustakaan.listBuku.length; i++) {
            if (Perpustakaan.listBuku[i] == null)
            {
                Perpustakaan.listBuku[i] = new Buku(judul, penulis, jumlah);
                break;
            }   
        }
    }
}
public class Main {
    public static void main(String[] args) {
    //Silahkan mengubah nama&nomor Pegawai dengan nama & NIM masing-masing
    Pegawai peg = new Pegawai("Dani Adrian", "225150201111009");
    Perpustakaan perpus = new Perpustakaan(peg);

    peg.menambahPelanggan("Hayasaka", "99001110009");
    peg.menambahPelanggan("Miyuki", "99001100008");
    peg.menambahPelanggan("Kei", "990011110077");
    
    peg.menambahBuku("Heavens", "Tiancan", 3);
    peg.menambahBuku("Kaguya-sama", "Akasaka", 3);
    peg.menambahBuku("Solo Leveling", "Chugong", 1);


    perpus.pinjam("Hayasaka", "Overlord");
    perpus.pinjam("Miyuki", "Solo Leveling");
    perpus.pinjam("Kei", "Solo Leveling");
    perpus.pinjam("Hayasaka", "Kaguya-sama");

    peg.menambahBuku("Overlord", "Maruyama", 3);
    peg.menambahBuku("Kaguya-sama", "Akasaka", 3);
    peg.menambahBuku("Solo Leveling", "Chugong", 1);

    perpus.pinjam("Kei", "Heavens");
    perpus.pinjam("Miyuki", "Solo Leveling");
    perpus.pinjam("Kei", "Kaguya-sama");

    peg.menambahPelanggan("Shinomiya", "2");
    perpus.pinjam("Miyuki", "1");

    perpus.pinjam("Shinomiya", "Solo Leveling");
    perpus.pinjam("Shirogane", "Kaguya-sama");

    // peg.menambahBuku("Java", "Graita", 5);
    // peg.menambahBuku("Phyton", "Safir", 20);
    // peg.menambahBuku("Javascript", "Machsun", 2);
    // peg.menambahBuku("Javascript", "Machsun", 5);
    // peg.menambahBuku("Cara menjadi Kaya 7 turunan", "Nabila Kol", 10);
    // peg.menambahBuku("Seni Berkayu", "Hashiram Senju", 10);
    // peg.menambahBuku("Attack On Titan 139", "penulis Eren Iyega", 10);
    // peg.menambahBuku("Panduan Bermain Genshin Impact", "Cantika", 3);
    // peg.menambahBuku("Cara membuat toko online", "Pak Kalapak", 5);
    // peg.menambahBuku("Golang", "Cantika", 2);

    // peg.menambahPelanggan("Dilluc", "1");
    // peg.menambahPelanggan("Armin", "2");
    // peg.menambahPelanggan("Pak Steve", "3");

    // perpus.pinjam("Dilluc", "Golang");
    // perpus.pinjam("Dilluc", "Golang");
    // perpus.pinjam("Pak Steve", "Panduan Bermain Genshin Impact");
    // perpus.pinjam("Pak Steve", "Phytoc meminjam buku);");
    // perpus.pinjam("Armin", "Panduan Bermain Genshin Impact");
    // perpus.pinjam("Armin", "Javascript");
    // perpus.pinjam("Dilluc", "Golang");
    // perpus.pinjam("Armin", "Panduan Bermain Genshin Impact");
    // perpus.pinjam("Dilluc", "Golang");
    // perpus.pinjam("Pak Steve", "Golang");
    // perpus.pinjam("Pak Steve", "Cara membuat toko online");


    perpus.tampilkanInfoPerpustakaan();
    }
    }
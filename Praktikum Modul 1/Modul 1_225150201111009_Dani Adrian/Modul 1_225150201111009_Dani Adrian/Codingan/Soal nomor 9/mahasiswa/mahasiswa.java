package mahasiswa;

	public class mahasiswa {
	int lembar;
	int halaman;
	int kata;
	int kataTotal;
	int kataPerHalaman;
	
	int waktu;

	mahasiswa(int lembar, int kata) {
	this.lembar = lembar;
	this.kata = kata;
	}
	void hitungTime(){
	halaman = lembar*2;
	kataPerHalaman= kata*2;
	kataTotal = halaman * kataPerHalaman;
	waktu = kataTotal/100;
	System.out.println("Waktu yang dibutuhkan untuk menghabiskan buku adalah "+waktu);
	}
  }
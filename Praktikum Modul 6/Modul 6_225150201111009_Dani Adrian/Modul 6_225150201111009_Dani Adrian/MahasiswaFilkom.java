public class MahasiswaFilkom extends Manusia{
    private String nim;
    private double ipk;

    public MahasiswaFilkom(String nama, boolean jenisKelamin, 
    String nik, boolean menikah, String nim, double ipk) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public double getIpk() {
        return ipk;
    }
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getStatus()
    {
        String angaktan = getNim().substring(0, 2);
        String prodi = "";
        switch(getNim().charAt(6))
        {
            case '2' : 
                prodi = "Teknik Informatika"; break;
            case '3' : 
                prodi = "Teknik Komputer"; break;
            case '4' : 
                prodi = "Sistem Informasi"; break;
            case '6' : 
                prodi = "Pendidikan Teknologi Informasi"; break;
            case '7' : 
                prodi = "Teknologi Informasi"; break;
        }

        return prodi + ", " + angaktan;
    }

    public double getBeasiswa()
    {
        return (ipk >= 3 && ipk < 3.5) ? 50 : (ipk >= 3.5 && ipk <= 4) ? 75 : 0;
    }

    public String toString()
    {
        String jk =  isJenisKelamin()? "Laki-laki" : "Perempuan";
        String output =
        "Nama           : " + getNama() + "\n" +  
        "NIK            : " + getNik() + "\n" +
        "Jenis Kelamin  : " + jk + "\n" +
        "Pendapatan     : " + (getTunjangan()+getBeasiswa()) + "\n" +
        "NIM            : " + getNim() + "\n" +
        "IPK            : " + getIpk() + "\n" +
        "Status         : " + getStatus() + "\n";

        return output;
    }

}

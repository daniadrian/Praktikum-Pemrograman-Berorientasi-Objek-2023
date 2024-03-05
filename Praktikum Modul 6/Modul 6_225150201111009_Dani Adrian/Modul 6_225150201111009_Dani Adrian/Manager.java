public class Manager extends Pekerja{
    private String departemen;

    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, int tahun, int bulan,
            int hari, int jumlahAnak, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahun, bulan, hari, jumlahAnak);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public double getTunjangan()
    {
        return (.1*super.getGaji()+ super.getTunjangan());
    }

    
    public String toString()
    {
        String output =
        super.toString() +
        "Departemen     : " + getDepartemen() + "\n";

        return output;
    }
}

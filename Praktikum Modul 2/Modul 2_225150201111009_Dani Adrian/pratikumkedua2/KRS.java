package pratikumkedua2;
public class KRS {
    private MataKuliah[] mataKuliah;
    private int jumlahMataKuliah;
    private boolean selesai;
    
    KRS()
    {
        mataKuliah = new MataKuliah[5];
        this.jumlahMataKuliah = 0;
        this.selesai = false;
    }

    public void tambahMataKuliah(MataKuliah mataKuliah)
    {
        if(mataKuliah.getNama().toUpperCase().equals("NULL") || mataKuliah.getKode().toUpperCase().equals("NULL"))
        {
            selesai = true;
        }
        if (jumlahMataKuliah < 5 && selesai == false)
        {
            this.mataKuliah[jumlahMataKuliah] = mataKuliah;
            jumlahMataKuliah++;
        }
        else if (jumlahMataKuliah >= 5 && selesai == false)
        {
            System.out.println("Error! Maksimal 5");
            selesai = true;
        }
    }

    public int getMatkul()
    {
        return jumlahMataKuliah;
    }
    
    public boolean getCondition()
    {
        return selesai;
    }

    public void print()
    {
        System.out.println();
        System.out.println("Daftar Mata Kuliah/Kode:");
        for (int i = 0; i < jumlahMataKuliah; i++)
        {
            System.out.println((i+1)+". " + mataKuliah[i].getNama() + "/" + mataKuliah[i].getKode());
        }
    }
}

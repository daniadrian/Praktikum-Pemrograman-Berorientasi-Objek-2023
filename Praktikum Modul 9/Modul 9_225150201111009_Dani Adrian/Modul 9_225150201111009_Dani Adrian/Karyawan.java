public class Karyawan implements Pembayaran {
    private int id; 
    private int gaji;
    private String nama;
    private	Invoice[]	
    invoices = new Invoice[1000];
    private int invoiceCount = 0;
public Karyawan(int id, int gaji, String nama) {
    this.id = id;
    this.gaji = gaji;
    this.nama = nama; }
public int getTotalPembayaran() {
    int total = 0;
        for (int i = 0; i < invoiceCount; i++) {
        total += invoices[i].getTotalPembayaran();
    }
return total;
    }   
public Invoice[] getInvoices() {
    Invoice[]	result	=	new Invoice[invoiceCount];
        for (int i = 0; i < invoiceCount; i++)
    {
    result[i] = invoices[i];
    }
    return result;
    }    
public int getInvoiceCount() {
    return invoiceCount;
}
public int getId() {
    return id;
}        
public void setId(int id) {
    this.id = id;
}
public int getGaji() {
    return gaji;
}        
public void setGaji(int gaji) {
    this.gaji = gaji;
}        
public String getNama() {
    return nama;
}        
public void setNama(String nama) {
    this.nama = nama;
}        
    public int gajiFinal() {
    return	getGaji()	- getTotalPembayaran();
}        
public void addInvoice(Invoice invoice) {
    invoices[invoiceCount++] = invoice;
}        
public String print() {
    return	"============================= Karyawan ============================" + "\n" + "ID	Karyawan: " + getId() + "\n" + "Nama	Karyawan: " + getNama() + "\n" + "Gaji	Karyawan: " + getGaji() + "\n";
}
public String getDetailBelanja() {
return "==== Total gaji sebelum & setelah dipotong hutang total belanja di koperasi =====" + "\n" + "Total gaji : " + getGaji() + "\n" + "Total gaji Karyawan setelah di potong : " + gajiFinal();
}
}

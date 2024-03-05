public class MainPerusahaan {
public static void main(String[] args) {
    Invoice p1 = new Invoice("Ayam Goreng", 2, 1000);
    Karyawan q1 = new Karyawan(01, 10000000, "Upin");
    Invoice p2 = new Invoice("Sapi", 2, 5000);
    Karyawan q2 = new Karyawan(02, 12000000, "Ipin");
        q1.addInvoice(p1);
    System.out.println(q1.print());
        for	(Invoice	invoice	: q1.getInvoices()) {
    System.out.println(invoice.print());
}    
    System.out.println(q1.getDetailBelanja());
    System.out.println();
    System.out.println(); 
    q2.addInvoice(p2);
    System.out.println(q2.print());
    for	(Invoice	invoice	: q2.getInvoices()) {   
    System.out.println(invoice.print());
}    
    System.out.println(q2.getDetailBelanja());
    }
}
        
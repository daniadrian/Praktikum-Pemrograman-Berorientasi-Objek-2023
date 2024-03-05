import java.util.*;

class datasetFutsal {
    int[] DataTinggiBadanTimA = { 168, 170, 165, 168, 172, 170, 169, 165, 171, 166 };
    int[] dataBeratBadanTimA = { 50, 60, 56, 55, 60, 70, 66, 56, 72, 56 };
    int[] dataTinggiTimB = { 170, 167, 165, 166, 168, 175, 172, 171, 168, 169 };
    int[] dataBeratBadanTimB = { 66, 60, 59, 58, 58, 71, 68, 68, 65, 60 };

    public void pengurutantinggitimA() {
        Arrays.sort(DataTinggiBadanTimA);
    }

    public void pengurutanberatbadantimA() {
        Arrays.sort(dataBeratBadanTimA);
    }

    public void pengurutantinggitimB() {
        Arrays.sort(dataTinggiTimB);
    }

    public void pengurutanberatbadantimB() {
        Arrays.sort(dataBeratBadanTimB);
    }

    public void pengurutantinggibadandanberatbadangabungantimAdantimBAscending() {
        int[] dataTinggiGabungan = new int[DataTinggiBadanTimA.length + dataTinggiTimB.length];
        System.arraycopy(DataTinggiBadanTimA, 0, dataTinggiGabungan, 0, DataTinggiBadanTimA.length);
        System.arraycopy(dataTinggiTimB, 0, dataTinggiGabungan, DataTinggiBadanTimA.length, dataTinggiTimB.length);
    
        int[] dataBeratBadanGabungan = new int[dataBeratBadanTimA.length + dataBeratBadanTimB.length];
        System.arraycopy(dataBeratBadanTimA, 0, dataBeratBadanGabungan, 0, dataBeratBadanTimA.length);
        System.arraycopy(dataBeratBadanTimB, 0, dataBeratBadanGabungan, dataBeratBadanTimA.length, dataBeratBadanTimB.length);
    
        Integer[] combinedData = new Integer[dataTinggiGabungan.length];
        for (int i = 0; i < dataTinggiGabungan.length; i++) {
            combinedData[i] = i;
        }
    
        // Menambahkan pembanding untuk pengurutan
        Arrays.sort(combinedData, Comparator.comparingInt((Integer i) -> dataTinggiGabungan[i]).thenComparingInt(i -> dataBeratBadanGabungan[i]));
    
        System.out.println("Urutan Tinggi Badan dan Berat Badan Gabungan Tim A dan Tim B (Ascending) : ");
    
        System.out.println("Urutan Tinggi dan Berat Kedua Tim (Ascending):");
        for (int i = 0; i < combinedData.length; i++) {
            int index = combinedData[i];
            System.out.println("Tinggi: " + dataTinggiGabungan[index] + " | Berat: " + dataBeratBadanGabungan[index]);
        }
    }
    
    public void pengurutantinggibadandanberatbadangabungantimAdantimBDecending () {
    int[] dataTinggiGabungan = new int[DataTinggiBadanTimA.length + dataTinggiTimB.length];
    System.arraycopy(DataTinggiBadanTimA, 0, dataTinggiGabungan, 0, DataTinggiBadanTimA.length);
    System.arraycopy(dataTinggiTimB, 0, dataTinggiGabungan, DataTinggiBadanTimA.length, dataTinggiTimB.length);
    
    int[] dataBeratBadanGabungan = new int[dataBeratBadanTimA.length + dataBeratBadanTimB.length];
    System.arraycopy(dataBeratBadanTimA, 0, dataBeratBadanGabungan, 0, dataBeratBadanTimA.length);
    System.arraycopy(dataBeratBadanTimB, 0, dataBeratBadanGabungan, dataBeratBadanTimA.length, dataBeratBadanTimB.length);
    Integer[]	combinedData	=	new Integer[dataTinggiGabungan.length];
    for (int i = 0; i < dataTinggiGabungan.length; i++) {
        combinedData[i] = i;
    }

    
    Arrays.sort(combinedData, Comparator.comparingInt((Integer i) -> dataTinggiGabungan[i]).thenComparingInt(i -> dataBeratBadanGabungan[i]));
    Arrays.sort(combinedData, Collections.reverseOrder());
    System.out.println("Urutan Tinggi Badan dan Berat Badan Gabungan Tim A dan Tim B (Descending) : ");
    for (int i = 0; i < combinedData.length; i++) {
        int p = combinedData[i];
        System.out.println("Tinggi :  " + dataTinggiGabungan[p] + " Berat Badan : " + dataBeratBadanGabungan[p]);
    }
}

    public int tinggiTerkecilTimA() {
        return DataTinggiBadanTimA[0];
    }

    public int tinngiTerbesarTimA() {
        return DataTinggiBadanTimA[DataTinggiBadanTimA.length - 1];
    }

    public int beratBadanTerkecilTimA() {
        return dataBeratBadanTimA[0];
    }

    public int beratBadanTerbesarTimA() {
        return dataBeratBadanTimA[dataBeratBadanTimA.length - 1];
    }

    public int tinggiTerkecilTimB() {
        return dataTinggiTimB[0];
    }

    public int tinngiTerbesarTimB() {
        return dataTinggiTimB[dataTinggiTimB.length - 1];
    }

    public int beratBadanTerkecilTimB() {
        return dataBeratBadanTimB[0];
    }

    public int beratBadanTerbesarTimB() {
        return dataBeratBadanTimB[dataBeratBadanTimB.length - 1];
    }

    public int[] copyAnggotaTimB () {
    return	Arrays.copyOf(dataTinggiTimB, dataTinggiTimB.length);
    }
}

public class DataSetFutsal1 {
    public static void main(String[] args) {

        datasetFutsal data = new datasetFutsal();
        // Berdasarkan Tinggi Badan
        //TIM A Ascending
        data.pengurutantinggitimA();
        System.out.println("Tim A: ");
        System.out.println("Tinggi Badan Tim A (Ascending):	"	+ Arrays.toString(data.DataTinggiBadanTimA));

        //TIM A Descending
        Integer[] descendingTinggiTimA = Arrays.stream(data.DataTinggiBadanTimA).boxed().sorted(Comparator.reverseOrder())
        .toArray(Integer[]::new);
        System.out.println("Tinggi Badan Tim A (Descending): " + Arrays.toString(descendingTinggiTimA) + "\n");

        //TIM B Ascending
        data.pengurutantinggitimB();
        System.out.println("Tim B: ");
        System.out.println("Tinggi Badan Tim B (Ascending):	" + Arrays.toString(data.dataTinggiTimB));

        //TIM B Descending
        Integer[] descendingTinggiTimB = Arrays.stream(data.dataTinggiTimB).boxed().sorted(Comparator.reverseOrder())
        .toArray(Integer[]::new);
        System.out.println("Tinggi Badan Tim B (Descending): " + Arrays.toString(descendingTinggiTimB) + "\n");

        // Berdasarkan Berat Badan
        //TIM A Ascending
        data.pengurutanberatbadantimA();
        System.out.println("Tim A: ");
        System.out.println("Berat Badan Tim A (Ascending): " + Arrays.toString(data.dataBeratBadanTimA));

        //TIM A Descending
        Integer[] descendingBeratBadanTimA = Arrays.stream(data.dataBeratBadanTimA).boxed().sorted(Comparator.reverseOrder())
        .toArray(Integer[]::new);
        System.out.println("Berat Badan Tim A (Descending):	" + Arrays.toString(descendingBeratBadanTimA) + "\n");

        //TIM B Ascending
        data.pengurutanberatbadantimB();
        System.out.println("Tim B: ");
        System.out.println("Berat Badan Tim B (Ascending): " + Arrays.toString(data.dataBeratBadanTimB));

        //TIM B Descending
        Integer[] descendingBeratBadanTimB = Arrays.stream(data.dataBeratBadanTimB).boxed().sorted(Comparator.reverseOrder())
        .toArray(Integer[]::new);
        System.out.println("Berat Badan Tim B (Descending):	" + Arrays.toString(descendingBeratBadanTimB) + "\n");

        data.pengurutantinggibadandanberatbadangabungantimAdantimBAscending();
        System.out.println();
        data.pengurutantinggibadandanberatbadangabungantimAdantimBDecending();
        System.out.println();
    	
        // Nilai maksimum dan minimum Tinggi Badan dan Berat Badan untuk pemain
        // dari masing-masing tim.
        	// Tim A
                int	tinggiTerkecilTimA	= data.tinggiTerkecilTimA();
    	        int	tinggiTerbesarTimA	= data.tinngiTerbesarTimA();
        	    int beratBadanTerkecilTimA = data.beratBadanTerkecilTimA();
            	int beratBadanTerbesarTimA = data.beratBadanTerbesarTimA();
        	System.out.println("Tim A:");
        	System.out.println("Tinggi Terkecil Tim A: " + tinggiTerkecilTimA);
        	System.out.println("Tinggi Terbesar Tim A: " + tinggiTerbesarTimA);
        	System.out.println("Berat Terkecil Tim A: " + beratBadanTerkecilTimA);
        	System.out.println("Berat Terbesar Tim A: " + beratBadanTerbesarTimA + "\n");
        	
            // Tim B
        	    int	tinggiTerkecilTimB	= data.tinggiTerkecilTimB();
        	    int	tinggiTerbesarTimB	= data.tinngiTerbesarTimB();
	            int beratBadanTerkecilTimB = data.beratBadanTerkecilTimB();
	            int beratBadanTerbesarTimB = data.beratBadanTerbesarTimB();
	        System.out.println("Tim B:");
	        System.out.println("Tinggi Terkecil Tim B: " + tinggiTerkecilTimB);
	        System.out.println("Tinggi Terbesar Tim B: " + tinggiTerbesarTimB);
	        System.out.println("Berat Terkecil Tim B: " + beratBadanTerkecilTimB);
	        System.out.println("Berat Terbesar Tim B: " + beratBadanTerbesarTimB + "\n");
	
	        // d. Copy seluruh anggota Tim B ke Tim C yang baru dibentuk
	        System.out.println("Salinan	seluruh anggota Tim B ke Tim C:");
	            int[]	dataTinggiTimC	= data.copyAnggotaTimB();
	            int[]	dataBeratBadanTimC	= Arrays.copyOf(data.dataBeratBadanTimB, data.dataBeratBadanTimB.length);
	        System.out.println("Data Tinggi Tim C: " + Arrays.toString(dataTinggiTimC));
	        System.out.println("Data Berat Tim C: " + Arrays.toString(dataBeratBadanTimC));
	}
}

    

 

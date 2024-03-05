import java.util.*;

class DataSetFutsal1 {
    int[] dataTinggiTimA = { 168, 170, 165, 168, 172, 170, 169, 165, 171, 166 };
    int[] dataBeratBadanTimA = { 50, 60, 56, 55, 60, 70, 66, 56, 72, 56 };
    int[] dataTinggiTimB = { 170, 167, 165, 166, 168, 175, 172, 171, 168, 169 };
    int[] dataBeratBadanTimB = { 66, 60, 59, 58, 58, 71, 68, 68, 65, 60 };

    public void BeratBadanSama() {
        Set<Integer> BeratBadanSama = new HashSet<>();
        int i = 0;
        do {
            int j = 0;
            do {
                if (dataBeratBadanTimA[i] == dataBeratBadanTimB[j]) {
                    BeratBadanSama.add(dataBeratBadanTimA[i]);
                }
                j++;
            } while (j < dataBeratBadanTimB.length);
            i++;
        } while (i < dataBeratBadanTimA.length);
        System.out.println("Pemain	yang mempunyai berat badan sama ada " + BeratBadanSama.size() + ", yaitu:" + "\n"
                + BeratBadanSama);
    }

    public void TinggiSama() {
        Set<Integer> tinggiSama = new HashSet<>();
        int i = 0;
        do {
            int j = 0;
            do {
                if (dataTinggiTimA[i] == dataTinggiTimB[j] && !tinggiSama.contains(dataTinggiTimA[i])) {
                    tinggiSama.add(dataTinggiTimA[i]);
                }
                j++;
            } while (j < dataTinggiTimB.length);
            i++;
        } while (i < dataTinggiTimA.length);
        System.out.println("Pemain yang mempunyai tinggi badan yang sama ada " + tinggiSama.size() + ", yaitu:" + "\n"
                + tinggiSama);
    }

    public void rentangtinggibadan() {
        int i = 0;
        int mintinggibadan = Integer.MAX_VALUE;
        do {
            if (dataTinggiTimA[i] < mintinggibadan) {
                mintinggibadan = dataTinggiTimA[i];
            }
            i++;
        } while (i < dataTinggiTimA.length);
        i = 0;
        do {
            if (dataTinggiTimB[i] < mintinggibadan) {
                mintinggibadan = dataTinggiTimB[i];
            }
            i++;
        } while (i < dataTinggiTimB.length);
        i = 0;
        int maxTinggi = Integer.MIN_VALUE;
        do {
            if (dataTinggiTimA[i] > maxTinggi) {
                maxTinggi = dataTinggiTimA[i];
            }
            i++;
        } while (i < dataTinggiTimA.length);
        i = 0;
        do {
            if (dataTinggiTimB[i] > maxTinggi) {
                maxTinggi = dataTinggiTimB[i];
            }
            i++;
        } while (i < dataTinggiTimB.length);
        System.out.println("Rentang nilai tinggi badan kedua tim adalah " + mintinggibadan + " hingga " + maxTinggi);
    }

    public void rentangberatbadan() {
        int minBeratBadan = Integer.MAX_VALUE;
        int i = 0;
        do {
            if (dataBeratBadanTimA[i] < minBeratBadan) {
                minBeratBadan = dataBeratBadanTimA[i];
            }
            i++;
        } while (i < dataBeratBadanTimA.length);
        i = 0;
        do {
            if (dataBeratBadanTimB[i] < minBeratBadan) {
                minBeratBadan = dataBeratBadanTimB[i];
            }
            i++;
        } while (i < dataBeratBadanTimB.length);
        int maxBerat = Integer.MIN_VALUE;
        i = 0;
        do {
            if (dataBeratBadanTimA[i] > maxBerat) {
                maxBerat = dataBeratBadanTimA[i];
            }
            i++;
        } while (i < dataBeratBadanTimA.length);
        i = 0;
        do {
            if (dataBeratBadanTimB[i] > maxBerat) {
                maxBerat = dataBeratBadanTimB[i];
            }
            i++;
        } while (i < dataBeratBadanTimB.length);
        System.out.println("Rentang nilai berat badan kedua tim adalah " + minBeratBadan + " hingga " + maxBerat);
    }

public void BeratBadanTIMB_tidakAdaPada_BeratBadanTIMA() {
    Set<Integer>	p	=	new HashSet<Integer>();
    int i = 0;
        do 
        {
    boolean f = false;
        int j = 0;
        do  {
        if	(dataBeratBadanTimB[i]	== dataBeratBadanTimA[j]) {
    	f = true;
 	break;
}
 	j++;
} 
    while (j < dataBeratBadanTimA.length);
 	if (!f) {
 	p.add(dataBeratBadanTimB[i]);
}
 	i++;
} 
    while (i < dataBeratBadanTimB.length);
 	    System.out.println("Berat badan pada tim B yang tidak ada pada tim A ada " + p);
    }

public void TinggiBadanTIMA_tidakAdaPada_TinggiBadanTimB() {
    Set<Integer>	p	=	new HashSet<Integer>();
    int i = 0;
        do {
        boolean f = false;
    int j = 0;
        do {
        if	(dataTinggiTimA[i]	== dataTinggiTimB[j]) {
        f = true;
    break;
    
    }
    
        j++;
    
    }	
    while	(j	< dataTinggiTimB.length);
        if (!f) {
    
        p.add(dataTinggiTimA[i]);
    }
        i++;
        } 
            while (i < 	dataTinggiTimA.length);
                System.out.println("Tinggi badan pada tim A yang tidak ada pada tim B ada " + p);
        }

        public void SimpanDatauntukTimAdanTimB() {
            Map<Integer, Integer> timA = new HashMap<>();
            int i = 0;
            do {
            timA.put(dataTinggiTimA[i], dataBeratBadanTimA[i]);
            i++;

        } while (i < dataTinggiTimA.length);
   
Map<Integer, Integer> timB = new HashMap<>();
    int j = 0;
    do 
        {
            timB.put(dataTinggiTimB[j], dataBeratBadanTimB[j]);
                j++;
        } 
            while (j < dataTinggiTimB.length);
            System.out.println("Data tinggi dan berat badan Tim A: " + timA);
            System.out.println("Data tinggi berat badan Tim B: " + timB);
            
            timB.put(168, 66);
            System.out.println("Data Tim B setelah berhasil di update: " + timB);

            Map<Integer,	Integer>	x	=	new HashMap<>();
            Iterator<Map.Entry<Integer,	Integer>> iteratorA = timA.entrySet().iterator();
            do {
       
Map.Entry<Integer, Integer> entryA = iteratorA.next();
    int tinggi = entryA.getKey();
       
    if (timB.containsKey(tinggi)) {   
        x.put(tinggi, entryA.getValue());
    }
} 
    while (iteratorA.hasNext());
        System.out.println("Data tinggi dan berat badan dari tim A yang sama dengan tim B adalah " + x);
Map<Integer,	Integer>	y	=	new HashMap<>();
    Iterator<Map.Entry<Integer,	Integer>> iteratorB = timA.entrySet().iterator();
    do {
    Map.Entry<Integer, Integer> entryB = iteratorB.next();
        int tinggi = entryB.getKey();   
        if (tinggi >= 168) {
        y.put(tinggi, entryB.getValue());
        }
        } while (iteratorB.hasNext());
        System.out.println("Data Tim A setelah eliminasi tinggi badan kurang dari 168 adalah " + y);
        }
    }   

public class datasetfutsal {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        DataSetFutsal1 q = new DataSetFutsal1();
        // q.TinggiSama();
        // q.BeratBadanSama();
        // q.rentangtinggibadan();
        // q.rentangberatbadan();
        //q.TinggiBadanTIMA_tidakAdaPada_TinggiBadanTimB();
        // q.BeratBadanTIMB_tidakAdaPada_BeratBadanTIMA();
        q.SimpanDatauntukTimAdanTimB();
        p.close();
    }
}

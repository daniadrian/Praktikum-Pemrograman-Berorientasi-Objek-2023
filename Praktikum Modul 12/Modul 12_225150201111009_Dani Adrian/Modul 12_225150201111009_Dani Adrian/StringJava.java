import java.util.*;

public class StringJava {
    public static void main(String[] args) {
        String Kalimat = new String("Saya belajar bahasa Java.");
        String Kalimat2 = new String("Bahasa Java mempunyai kelas berupa String.");
        String Kalimat3 = new String("Belajar String Java itu mudah.");
        String Kalimat4 = new String("String Java juga sering diimplementasikan.");
        StringJoiner paragraf = new StringJoiner(" ");
        paragraf.add(Kalimat);
        paragraf.add(Kalimat2);
        paragraf.add(Kalimat3);
        paragraf.add(Kalimat4);

        Map<String, Integer> frequencyMap = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(paragraf.toString(), " .:(),");

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken().toLowerCase();
            frequencyMap.put(token, frequencyMap.getOrDefault(token, 0) + 1);
        }
        System.out.println("Paragraf:");
        System.out.println("\t"+paragraf.toString());
        System.out.println();
        System.out.println("Tabel Hitung Token:");
        System.out.println("===================================================");
        System.out.printf("|%20s%-10s%-4s%2s%-13s|\n","Token"," ","|","","Frekuensi");
        System.out.println("===================================================");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            String token = entry.getKey();
            int frequency = entry.getValue();
            System.out.printf("|%20s%-10s%-4s%5s%-10s|\n",token," ","|","",frequency);
            
        }
        System.out.println("===================================================");
    }  
}

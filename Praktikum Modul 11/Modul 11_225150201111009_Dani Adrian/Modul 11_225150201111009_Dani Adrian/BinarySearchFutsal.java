import java.util.*;
class DataSetFutsal2 {
    ArrayList<Integer> DataTinggiBadanTimA = new ArrayList<>();
    ArrayList<Integer> DataBeratBadanTimA = new ArrayList<>();
    ArrayList<Integer> dataTinggiTimB = new ArrayList<>();
    ArrayList<Integer> dataBBTimB = new ArrayList<>();
    public DataSetFutsal2() {
        // Data Tim A
        DataTinggiBadanTimA.add(168);
        DataTinggiBadanTimA.add(170);
        DataTinggiBadanTimA.add(165);
        DataTinggiBadanTimA.add(168);
        DataTinggiBadanTimA.add(172);
        DataTinggiBadanTimA.add(170);
        DataTinggiBadanTimA.add(169);
        DataTinggiBadanTimA.add(165);
        DataTinggiBadanTimA.add(171);
        DataTinggiBadanTimA.add(166);
        DataBeratBadanTimA.add(50);
        DataBeratBadanTimA.add(60);
        DataBeratBadanTimA.add(56);
        DataBeratBadanTimA.add(55);
        DataBeratBadanTimA.add(60);
        DataBeratBadanTimA.add(70);
        DataBeratBadanTimA.add(66);
        DataBeratBadanTimA.add(56);
        DataBeratBadanTimA.add(72);
        DataBeratBadanTimA.add(56);
        // Data Tim B
        dataTinggiTimB.add(170);
        dataTinggiTimB.add(167);
        dataTinggiTimB.add(165);
        dataTinggiTimB.add(166);
        dataTinggiTimB.add(168);
        dataTinggiTimB.add(175);
        dataTinggiTimB.add(172);
        dataTinggiTimB.add(171);
        dataTinggiTimB.add(168);
        dataTinggiTimB.add(169);
        dataBBTimB.add(66);
        dataBBTimB.add(60);
        dataBBTimB.add(59);
        dataBBTimB.add(58);
        dataBBTimB.add(58);
        dataBBTimB.add(71);
        dataBBTimB.add(68);
        dataBBTimB.add(68);
        dataBBTimB.add(65);
        dataBBTimB.add(60);
    }
    public int binarySearch(ArrayList<Integer> arr, int target) {
        int left = 0;
        int right = arr.size() - 1;
        do {
            int mid = left + (right - left)
                    / 2;
            int midValue = arr.get(mid);
            if (midValue == target) {
                return mid;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        } while (left <= right);
        return -1;
    }

    public int countPlayersWithHeight(ArrayList<Integer> arr, int height) {
        int count = 0;
        int i = 0;
        do {
            if (arr.get(i) == height) {
                count++;
            }
            i++;
        } while (i < arr.size());
        return count;
    }

    public int countPlayersWithWeight(ArrayList<Integer> arr, int weight) {
        int count = 0;
        int i = 0;
        do {
            if (arr.get(i) == weight) {
                count++;
            }
            i++;
        } while (i < arr.size());
        return count;
    }

    public boolean isSameHeightOrWeight() {
        int i = 0;
        do {
            int heightA = DataTinggiBadanTimA.get(i);
            int weightA = DataBeratBadanTimA.get(i);
            if (binarySearch(dataTinggiTimB, heightA) != -1 || binarySearch(dataBBTimB, weightA) != -1) {
                return true;
            }
            i++;
        } while (i < DataTinggiBadanTimA.size());
        return false;
    }
}
public class BinarySearchFutsal {
    public static void main(String[] args) {
        DataSetFutsal2 q = new DataSetFutsal2();
        // a) Data tim A dan tim B dalam ArrayList terpisah
        ArrayList<Integer> dataTimA = new ArrayList<>(q.DataTinggiBadanTimA);
        ArrayList<Integer> data_TimA = new ArrayList<>(q.DataBeratBadanTimA);
        ArrayList<Integer> dataTimB = new ArrayList<>(q.dataTinggiTimB);
        ArrayList<Integer> data_TimB = new ArrayList<>(q.dataBBTimB);
        System.out.println("Data tinggi tim a:");
        System.out.println(dataTimA);
        System.out.println("Data berat badan tim a:");
        System.out.println(data_TimA);
        System.out.println();
        System.out.println("Data tinggi tim b:");
        System.out.println(dataTimB);
        System.out.println("Data berat badan tim b:");
        System.out.println(data_TimB);
        System.out.println();
        // b) Jumlah pemain di tim B dengan tinggi 168 cm dan 160 cm
        int count168 = q.countPlayersWithHeight(dataTimB, 168);
        int count160 = q.countPlayersWithHeight(dataTimB, 160);
        System.out.println("Jumlah pemain di tim B dengan tinggi 168 cm: " + count168);
        System.out.println("Jumlah pemain di tim B dengan tinggi 160 cm: " + count160 + "\n");
        // c) Jumlah pemain di tim A dengan berat 56 kg dan 53 kg
        int count56 = q.countPlayersWithWeight(q.DataBeratBadanTimA, 56);
        int count53 = q.countPlayersWithWeight(q.DataBeratBadanTimA, 53);
        System.out.println("Jumlah pemain di tim A dengan berat 56 kg: " + count56);
        System.out.println("Jumlah pemain di tim A dengan berat 53 kg: " + count53 + "\n");

        // d) Apakah ada pemain di tim A dengan tinggi atau berat yang sama dengan
        // pemain di tim B
        boolean sameHeightOrWeight = q.isSameHeightOrWeight();
        if (sameHeightOrWeight == true) {
            System.out.println(
                    "Apakah ada pemain di tim A dengan tinggi atau berat yang sama dengan pemain di tim B: Ada ");
        } else {
            System.out.println(
                    "Apakah ada pemain di tim A dengan tinggi atau berat yang sama dengan pemain di tim B: Tidak ada ");
        }
    }
}

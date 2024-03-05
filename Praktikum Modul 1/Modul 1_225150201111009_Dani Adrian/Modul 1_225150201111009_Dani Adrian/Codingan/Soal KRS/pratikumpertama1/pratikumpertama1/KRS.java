package pratikumpertama1;

public class KRS {
    private String[] matkul;
    private int banyakmatkul;
    private boolean end;

    KRS() {
        matkul = new String[5];
        this.banyakmatkul = 0;
        this.end = false;
    }

    public void tambahMataKuliah(String matkul) {
        if (banyakmatkul < 5 && !matkul.equalsIgnoreCase("OK")) {
            this.matkul[banyakmatkul] = matkul;
            banyakmatkul++;
        } else if (banyakmatkul == 5 && matkul.equalsIgnoreCase("OK")) {
            end = true;
        } else if (banyakmatkul >= 5 && !matkul.equalsIgnoreCase("OK")) {
            System.out.println("Error! Jumlah input maksimal 5 mata kuliah.");
        }
    }

    public int getMatkul() {
        return banyakmatkul;
    }

    public boolean getCondition() {
        return end;
    }

    public void print() {
        System.out.println();
        System.out.println("Daftar mata kuliah Anda:");
        for (int p = 0; p < banyakmatkul; p++) {
            System.out.println((p + 1) + ". " + matkul[p]);
        }
    }
}

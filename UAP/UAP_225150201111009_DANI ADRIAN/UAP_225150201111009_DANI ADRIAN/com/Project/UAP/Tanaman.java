package com.Project.UAP;

public abstract class Tanaman {
    private int masaHidup;
    private int lamaHidup;
    private int berbuah;
    public int getBerbuah() {
        return berbuah;
    }
    public void setBerbuah(int berbuah) {
        this.berbuah = berbuah;
    }

    private int buah;
    public double getPerkembangan() {
        return perkembangan;
    }
    public void setPerkembangan(double perkembangan) {
        this.perkembangan = perkembangan;
    }

    private double perkembangan;
    private double prosesBerbuah;

    public Tanaman(int masaHidup, int berbuah, double perkembangan){
        this.masaHidup=masaHidup;
        this.lamaHidup=0;
        this.buah=0;
        this.prosesBerbuah=0;
        this.berbuah=berbuah;
        this.perkembangan=0;
    }
    public abstract void berkembang();

    public String status() {
        if (lamaHidup >= masaHidup) {
            return "Mati";
        } else {
            return "Hidup";
        }
    }

    @Override
    public String toString() {
        return "Masa Hidup: " + masaHidup + "\n" +
                "Lama Hidup: " + lamaHidup + "\n" +
                "Buah yang Dihasilkan: " + buah + this.getBuah()+ "\n" +
                "Status: " + status();
    }

    public void setMasaHidup(int masaHidup) {
        this.masaHidup = masaHidup;
    }

    public int getMasaHidup() {
        return masaHidup;
    }

    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public void setBuah(int buah) {
        this.buah = buah;
    }

    public int getBuah() {
        return buah;
    }

    public void setProsesBerbuah(Double prosesBerbuah) {
        this.prosesBerbuah = prosesBerbuah;
    }

    public double getProsesBerbuah() {
        return prosesBerbuah;
    }

}

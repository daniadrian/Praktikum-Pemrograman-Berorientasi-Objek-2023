package com.Project.UAP;

public class Persik extends Tanaman implements Perawatan{
    
    
    public Persik() {
        super(180, 250, 0.15);
    }

    @Override
    public void berkembang() {
        setLamaHidup(getLamaHidup() + 1);
        setProsesBerbuah(getProsesBerbuah() + 1);

        if (getProsesBerbuah() >= getBerbuah()) {
            setBuah(getBuah() + 1);
            setProsesBerbuah(getProsesBerbuah() % getBerbuah());
        }
    }

    @Override
    public String toString() {
        return "Masa Hidup: " + getMasaHidup() + "\n" +
                "Lama Hidup: " + getLamaHidup() + "\n" +
                "Buah yang Dihasilkan: " + getBuah() + "\n" +
                "Status: " + status();
    }

    @Override
    public void treatment() {
        setBuah((int) (getBuah() * 2.5));
    }
}

    


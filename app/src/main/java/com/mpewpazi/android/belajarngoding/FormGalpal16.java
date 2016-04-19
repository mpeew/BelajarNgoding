package com.mpewpazi.android.belajarngoding;

import android.support.v4.app.Fragment;

/**
 * Created by mpewpazi on 4/18/16.
 */
public class FormGalpal16 extends SingleForm {
    String namaLahanParkir;
    int luas;
    String dimensi;
    int kapasitas;
    String operasional;
    int jarakKeGalangan;

    @Override
    public String getNamaForm() {
        return "Organisasi Ruang Lahan Parkir";
    }

    @Override
    public Fragment getFragment() {
        return new FormGalpal19FragmentList();
    }

    public String getNamaLahanParkir() {
        return namaLahanParkir;
    }

    public void setNamaLahanParkir(String namaLahanParkir) {
        this.namaLahanParkir = namaLahanParkir;
    }

    public int getLuas() {
        return luas;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    public String getDimensi() {
        return dimensi;
    }

    public void setDimensi(String dimensi) {
        this.dimensi = dimensi;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getOperasional() {
        return operasional;
    }

    public void setOperasional(String operasional) {
        this.operasional = operasional;
    }

    public int getJarakKeGalangan() {
        return jarakKeGalangan;
    }

    public void setJarakKeGalangan(int jarakKeGalangan) {
        this.jarakKeGalangan = jarakKeGalangan;
    }
}

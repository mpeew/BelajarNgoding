package com.mpewpazi.android.belajarngoding;

import android.support.v4.app.Fragment;

/**
 * Created by mpewpazi on 4/15/16.
 */
public class FormGalpal19 extends SingleForm {

    String namaBengkel;
    int luas;
    String dimensi;
    int kapasitas;
    String status;
    int jarakKeDock;

    @Override
    public String getNamaForm() {
        return "Organisasi Ruang Bengkel";
    }

    @Override
    public Fragment getFragment() {
        return new FormGalpal19FragmentList();
    }

    public String getNamaBengkel() {
        return namaBengkel;
    }

    public void setNamaBengkel(String namaBengkel) {
        this.namaBengkel = namaBengkel;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getJarakKeDock() {
        return jarakKeDock;
    }

    public void setJarakKeDock(int jarakKeDock) {
        this.jarakKeDock = jarakKeDock;
    }
}

package com.mpewpazi.android.belajarngoding;

import android.support.v4.app.Fragment;

/**
 * Created by mpewpazi on 3/31/16.
 */
public class FormKompal2 extends SingleForm {

    private String bahanBaku;
    private String mesinSistemElektrikal;
    private String perlengkapanKapal;

    public String getBahanBaku() {
        return bahanBaku;
    }

    public void setBahanBaku(String bahanBaku) {
        this.bahanBaku = bahanBaku;
    }

    public String getMesinSistemElektrikal() {
        return mesinSistemElektrikal;
    }

    public void setMesinSistemElektrikal(String mesinSistemElektrikal) {
        this.mesinSistemElektrikal = mesinSistemElektrikal;
    }

    public String getPerlengkapanKapal() {
        return perlengkapanKapal;
    }

    public void setPerlengkapanKapal(String perlengkapanKapal) {
        this.perlengkapanKapal = perlengkapanKapal;
    }

    @Override
    public String getNamaForm() {
        return "Faktor-Faktor Produksi";
    }

    @Override
    public Fragment getFragment() {
        return new FormKompal2Fragment();
    }
}

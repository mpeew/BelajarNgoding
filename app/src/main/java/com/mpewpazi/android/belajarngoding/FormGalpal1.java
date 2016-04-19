package com.mpewpazi.android.belajarngoding;

import android.support.v4.app.Fragment;

/**
 * Created by mpewpazi on 3/31/16.
 */
public class FormGalpal1 extends SingleForm {


    private String namaPerusahaan;
    private String statusKepemilikanUsaha;
    private String nomorTelepon;
    private String fax;
    private String alamat;
    private String kelurahan;
    private String kecamatan;
    private String propinsi;
    private String kebupaten_kota;
    private String kodePos;
    private String anggotaAsosiasi;
    private String kategoriPerusahaan;
    private String contactPerson;
    private String nomorCp;
    private String jabatan;
    private String email;





    @Override
    public String getNamaForm() {
        return "Identitas Umum Perusahaan";
    }

    @Override
    public Fragment getFragment() {
        return new FormGalpal1Fragment();
    }

    public String getStatusKepemilikanUsaha() {
        return statusKepemilikanUsaha;
    }


    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }


    public void setStatusKepemilikanUsaha(String statusKepemilikanUsaha) {
        this.statusKepemilikanUsaha = statusKepemilikanUsaha;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getPropinsi() {
        return propinsi;
    }

    public void setPropinsi(String propinsi) {
        this.propinsi = propinsi;
    }

    public String getKebupaten_kota() {
        return kebupaten_kota;
    }

    public void setKebupaten_kota(String kebupaten_kota) {
        this.kebupaten_kota = kebupaten_kota;
    }

    public String getKodePos() {
        return kodePos;
    }

    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }

    public String getAnggotaAsosiasi() {
        return anggotaAsosiasi;
    }

    public void setAnggotaAsosiasi(String anggotaAsosiasi) {
        this.anggotaAsosiasi = anggotaAsosiasi;
    }

    public String getKategoriPerusahaan() {
        return kategoriPerusahaan;
    }

    public void setKategoriPerusahaan(String kategoriPerusahaan) {
        this.kategoriPerusahaan = kategoriPerusahaan;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getNomorCp() {
        return nomorCp;
    }

    public void setNomorCp(String nomorCp) {
        this.nomorCp = nomorCp;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

package com.mpewpazi.android.belajarngoding;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by mpewpazi on 3/28/16.
 */
public class Survey {


    private UUID mId;
    private String mNamaPerusahaan;
    private String mJenisObjekSurvey;
    private boolean mStatusLocked;
    private Date mDueDate;
    private int mProgress;



    FormGalpal1 mFormGalpal1;
    FormGalpal3 mFormGalpal3;
    List<FormGalpal16> mFormGalpal16s;


    FormKompal1 mFormKompal1;
    FormKompal2 mFormKompal2;




    public Survey() {
       mId = UUID.randomUUID();
    }

    public void createFormsGalpal(){
        mFormGalpal1= new FormGalpal1();
        mFormGalpal3=new FormGalpal3();
        mFormGalpal16s=new ArrayList<>();
    }


    public void createFormsKompal(){
        mFormKompal1= new FormKompal1();
        mFormKompal2= new FormKompal2();
    }

    public FormGalpal1 getFormGalpal1() {
        return mFormGalpal1;
    }

    public FormGalpal3 getFormGalpal3() {
        return mFormGalpal3;
    }

    public List<FormGalpal16> getFormGalpal16s() {
        return mFormGalpal16s;
    }

    public FormKompal1 getFormKompal1() {
        return mFormKompal1;
    }

    public FormKompal2 getFormKompal2() {
        return mFormKompal2;
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }


    public String getNamaPerusahaan() {
        return mNamaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        mNamaPerusahaan = namaPerusahaan;
    }

    public String getJenisObjekSurvey() {
        return mJenisObjekSurvey;
    }

    public void setJenisObjekSurvey(String jenisObjekSurvey) {
        mJenisObjekSurvey = jenisObjekSurvey;
    }

    public boolean isStatusLocked() {
        return mStatusLocked;
    }

    public void setStatusLocked(boolean status) {
        mStatusLocked = status;
    }

    public Date getDueDate() {
        return mDueDate;
    }

    public void setDueDate(Date dueDate) {
        mDueDate = dueDate;
    }

    public int getProgress() {
        return mProgress;
    }

    public void setProgress(int progress) {
        mProgress = progress;
    }



}
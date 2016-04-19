package com.mpewpazi.android.belajarngoding;

import android.content.Context;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.UUID;

/**
 * Created by mpewpazi on 3/28/16.
 */
public class SurveyAssignation {
    private Context mContext;
    private static final String STRING_GALPAL="Industri Galangan Kapal";
    private static final String STRING_KOMPAL="komponenkapal";

    private static SurveyAssignation sSurveyAssignation;
    private List<Survey> mSurveys;
    private List<SingleForm> mGalpalForms;
    private List<SingleForm> mKompalForms;

    private FormGalpal1 mFormGalpal1;
    private FormGalpal3 mFormGalpal3;
    private FormKompal1 mFormKompal1;
    private FormKompal2 mFormKompal2;

    public static SurveyAssignation get(Context context){
        if(sSurveyAssignation==null){
            sSurveyAssignation=new SurveyAssignation(context);
        }
        return sSurveyAssignation;
    }

    private SurveyAssignation(Context context){
        mContext=context.getApplicationContext();
        mSurveys=new ArrayList<>();

        Survey survey=new Survey();
        survey.setNamaPerusahaan("PT XYZ");
        survey.setStatusLocked(true);
        survey.setJenisObjekSurvey("Industri Galangan Kapal");
        Date date=new GregorianCalendar(2016,2,12).getTime();
        survey.setDueDate(date);
        //kedepannya dalam kalkulasi bro
        survey.setProgress(75);
        VerifyJenisObjectSurvey(survey,1,2);
        mSurveys.add(survey);



        Survey survey1=new Survey();
        survey1.setNamaPerusahaan("PT ANUGERAH SEJAHTERA");
        survey1.setStatusLocked(false);
        survey1.setJenisObjekSurvey("Industri Galangan Kapal");
        Date date1=new GregorianCalendar(2016,4,22).getTime();
        survey1.setDueDate(date1);
        survey1.setProgress(25);
        VerifyJenisObjectSurvey(survey1,11,22);

        mSurveys.add(survey1);

        Survey survey12=new Survey();
        survey12.setNamaPerusahaan("PT Syariah ");
        survey12.setStatusLocked(false);
        survey12.setJenisObjekSurvey("Industri Komponen Kapal");
        Date date12=new GregorianCalendar(2016,3,9).getTime();
        survey12.setDueDate(date12);
        survey12.setProgress(66);
        VerifyJenisObjectSurvey(survey12,111,222);
        mSurveys.add(survey12);
    }

    private void VerifyJenisObjectSurvey(Survey survey,int id1,int id2) {
        if(survey.getJenisObjekSurvey().equals(STRING_GALPAL)){
            survey.createFormsGalpal();
            mFormGalpal1=survey.getFormGalpal1();
            mFormGalpal1.setId(id1);
            mFormGalpal3=survey.getFormGalpal3();
            mFormGalpal3.setId(id1);
        }else{
            survey.createFormsKompal();
            mFormKompal1=survey.getFormKompal1();
            mFormKompal1.setId(id1);
            mFormKompal2=survey.getFormKompal2();
            mFormKompal2.setId(id2);

        }
    }

    public List<Survey> getSurveys(){
        return mSurveys;
    }

    public Survey getSurvey(UUID id){
        for(Survey survey:mSurveys){
            if(survey.getId().equals(id)){
                return survey;
            }
        }

        return null;
    }



}

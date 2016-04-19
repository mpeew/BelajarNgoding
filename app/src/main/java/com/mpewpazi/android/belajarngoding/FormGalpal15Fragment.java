package com.mpewpazi.android.belajarngoding;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by mpewpazi on 4/18/16.
 */
public class FormGalpal15Fragment extends Fragment {
    private EditText mJenisMesinEditText;
    private EditText mTahunPembuatanEditText;
    private EditText mMerekEditText;
    private EditText mKapasitasTerpasangEditText;
    private EditText mDimensiEditText;
    private EditText mJumlahEditText;
    private EditText mKondisiEditText;
    private EditText mLokasiEditText;
    private EditText mStatusEditText;
    private EditText mKapasitasTerpakaiEditText;

    private Button mSubmitButton;
    private FormGalpal15 mFormGalpal15;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //sementara
        mFormGalpal15=new FormGalpal15();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_form_galpal1, container, false);

        mJenisMesinEditText=(EditText)rootView.findViewById(R.id.galpal15_jenis_mesin);
        mTahunPembuatanEditText=(EditText)rootView.findViewById(R.id.galpal15_tahun_pembuatan);
        mMerekEditText=(EditText)rootView.findViewById(R.id.galpal15_merek);
        mKapasitasTerpasangEditText=(EditText)rootView.findViewById(R.id.galpal15_dimensi);
        mKapasitasTerpakaiEditText=(EditText)rootView.findViewById(R.id.galpal15_kapasitas_terpakai);
        mDimensiEditText=(EditText)rootView.findViewById(R.id.galpal15_dimensi);
        mJumlahEditText=(EditText)rootView.findViewById(R.id.galpal15_jumlah);
        mKondisiEditText=(EditText)rootView.findViewById(R.id.galpal15_kondisi);
        mLokasiEditText=(EditText)rootView.findViewById(R.id.galpal15_lokasi);
        mStatusEditText=(EditText)rootView.findViewById(R.id.galpal15_status);

        mSubmitButton=(Button)rootView.findViewById(R.id.galpal15_btn_submit);


        mJenisMesinEditText.setText(mFormGalpal15.getJenisMesin());
        mJenisMesinEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal15.setJenisMesin(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mTahunPembuatanEditText.setText(mFormGalpal15.getTahunPembuatan());
        mTahunPembuatanEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal15.setTahunPembuatan(11);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mMerekEditText.setText(mFormGalpal15.getMerek());
        mMerekEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal15.setMerek(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mKapasitasTerpasangEditText.setText(mFormGalpal15.getKapasitasTerpasang());
        mKapasitasTerpasangEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal15.setKapasitasTerpasang(11);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mDimensiEditText.setText(mFormGalpal15.getDimensi());
        mDimensiEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal15.setDimensi(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mJumlahEditText.setText(mFormGalpal15.getJumlah());
        mJumlahEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal15.setJumlah(11);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mKondisiEditText.setText(mFormGalpal15.getKondisi());
        mKondisiEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal15.setKondisi(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mLokasiEditText.setText(mFormGalpal15.getLokasi());
        mLokasiEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal15.setLokasi(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mStatusEditText.setText(mFormGalpal15.getStatus());
        mStatusEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal15.setStatus(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mKapasitasTerpakaiEditText.setText(mFormGalpal15.getKapasitasTerpakai());
        mKapasitasTerpakaiEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal15.setKapasitasTerpakai(11);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



        return rootView;
    }
}

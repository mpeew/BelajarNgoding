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
public class FormGalpal8Fragment extends Fragment {
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
    private FormGalpal8 mFormGalpal8;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //sementara
        mFormGalpal8=new FormGalpal8();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_form_galpal1, container, false);

        mJenisMesinEditText=(EditText)rootView.findViewById(R.id.galpal8_jenis_mesin);
        mTahunPembuatanEditText=(EditText)rootView.findViewById(R.id.galpal8_tahun_pembuatan);
        mMerekEditText=(EditText)rootView.findViewById(R.id.galpal8_merek);
        mKapasitasTerpasangEditText=(EditText)rootView.findViewById(R.id.galpal8_dimensi);
        mKapasitasTerpakaiEditText=(EditText)rootView.findViewById(R.id.galpal8_kapasitas_terpakai);
        mDimensiEditText=(EditText)rootView.findViewById(R.id.galpal8_dimensi);
        mJumlahEditText=(EditText)rootView.findViewById(R.id.galpal8_jumlah);
        mKondisiEditText=(EditText)rootView.findViewById(R.id.galpal8_kondisi);
        mLokasiEditText=(EditText)rootView.findViewById(R.id.galpal8_lokasi);
        mStatusEditText=(EditText)rootView.findViewById(R.id.galpal8_status);

        mSubmitButton=(Button)rootView.findViewById(R.id.galpal8_btn_submit);


        mJenisMesinEditText.setText(mFormGalpal8.getJenisMesin());
        mJenisMesinEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal8.setJenisMesin(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mTahunPembuatanEditText.setText(mFormGalpal8.getTahunPembuatan());
        mTahunPembuatanEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal8.setTahunPembuatan(11);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mMerekEditText.setText(mFormGalpal8.getMerek());
        mMerekEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal8.setMerek(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mKapasitasTerpasangEditText.setText(mFormGalpal8.getKapasitasTerpasang());
        mKapasitasTerpasangEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal8.setKapasitasTerpasang(11);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mDimensiEditText.setText(mFormGalpal8.getDimensi());
        mDimensiEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal8.setDimensi(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mJumlahEditText.setText(mFormGalpal8.getJumlah());
        mJumlahEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal8.setJumlah(11);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mKondisiEditText.setText(mFormGalpal8.getKondisi());
        mKondisiEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal8.setKondisi(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mLokasiEditText.setText(mFormGalpal8.getLokasi());
        mLokasiEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal8.setLokasi(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mStatusEditText.setText(mFormGalpal8.getStatus());
        mStatusEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal8.setStatus(s.toString());
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

        mKapasitasTerpakaiEditText.setText(mFormGalpal8.getKapasitasTerpakai());
        mKapasitasTerpakaiEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal8.setKapasitasTerpakai(11);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });



        return rootView;
    }
}

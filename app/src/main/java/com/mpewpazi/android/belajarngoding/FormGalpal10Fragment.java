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
public class FormGalpal10Fragment extends Fragment {
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
    private FormGalpal10 mFormGalpal10;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //sementara
        mFormGalpal10=new FormGalpal10();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_form_galpal1, container, false);

        mJenisMesinEditText=(EditText)rootView.findViewById(R.id.galpal10_jenis_mesin);
        mTahunPembuatanEditText=(EditText)rootView.findViewById(R.id.galpal10_tahun_pembuatan);
        mMerekEditText=(EditText)rootView.findViewById(R.id.galpal10_merek);
        mKapasitasTerpasangEditText=(EditText)rootView.findViewById(R.id.galpal10_dimensi);
        mKapasitasTerpakaiEditText=(EditText)rootView.findViewById(R.id.galpal10_kapasitas_terpakai);
        mDimensiEditText=(EditText)rootView.findViewById(R.id.galpal10_dimensi);
        mJumlahEditText=(EditText)rootView.findViewById(R.id.galpal10_jumlah);
        mKondisiEditText=(EditText)rootView.findViewById(R.id.galpal10_kondisi);
        mLokasiEditText=(EditText)rootView.findViewById(R.id.galpal10_lokasi);
        mStatusEditText=(EditText)rootView.findViewById(R.id.galpal10_status);

        mSubmitButton=(Button)rootView.findViewById(R.id.galpal10_btn_submit);


        mJenisMesinEditText.setText(mFormGalpal10.getJenisMesin());
        mJenisMesinEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal10.setJenisMesin(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mTahunPembuatanEditText.setText(mFormGalpal10.getTahunPembuatan());
        mTahunPembuatanEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal10.setTahunPembuatan(11);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mMerekEditText.setText(mFormGalpal10.getMerek());
        mMerekEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal10.setMerek(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mKapasitasTerpasangEditText.setText(mFormGalpal10.getKapasitasTerpasang());
        mKapasitasTerpasangEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal10.setKapasitasTerpasang(11);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mDimensiEditText.setText(mFormGalpal10.getDimensi());
        mDimensiEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal10.setDimensi(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mJumlahEditText.setText(mFormGalpal10.getJumlah());
        mJumlahEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal10.setJumlah(11);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mKondisiEditText.setText(mFormGalpal10.getKondisi());
        mKondisiEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal10.setKondisi(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mLokasiEditText.setText(mFormGalpal10.getLokasi());
        mLokasiEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal10.setLokasi(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mStatusEditText.setText(mFormGalpal10.getStatus());
        mStatusEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal10.setStatus(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mKapasitasTerpakaiEditText.setText(mFormGalpal10.getKapasitasTerpakai());
        mKapasitasTerpakaiEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal10.setKapasitasTerpakai(11);
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

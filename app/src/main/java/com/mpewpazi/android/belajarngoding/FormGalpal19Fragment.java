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
import android.widget.Spinner;

/**
 * Created by mpewpazi on 4/18/16.
 */
public class FormGalpal19Fragment extends Fragment {
    private EditText mNamaBengkelEditText;
    private EditText mLuasEditText;
    private EditText mDimensiEditText;
    private EditText mKapasitasEditText;
    private Spinner mStatusSpinner;
    private EditText mJarakKeDock;

    private Button mSubmitButton;

    private FormGalpal19 mFormGalpal19;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Sementara diinisiasi dulu kepedanya harus di code
        mFormGalpal19=new FormGalpal19();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_form_galpal19, container, false);

        mNamaBengkelEditText=(EditText)rootView.findViewById(R.id.galpal19_nama_bengkel);
        mLuasEditText=(EditText)rootView.findViewById(R.id.galpal19_luas);
        mDimensiEditText=(EditText)rootView.findViewById(R.id.galpal19_dimensi);
        mKapasitasEditText=(EditText)rootView.findViewById(R.id.galpal19_kapasitas);
        mStatusSpinner=(Spinner)rootView.findViewById(R.id.galpal19_status_spinner);
        mJarakKeDock=(EditText)rootView.findViewById(R.id.galpal19_jarak_ke_dock);
        mSubmitButton=(Button)rootView.findViewById(R.id.galpal19_btn_submit);

        mNamaBengkelEditText.setText(mFormGalpal19.getNamaBengkel());
        mNamaBengkelEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal19.setNamaBengkel(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mLuasEditText.setText(mFormGalpal19.getLuas());
        mLuasEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal19.setLuas(1);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mDimensiEditText.setText(mFormGalpal19.getDimensi());
        mDimensiEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal19.setDimensi(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mKapasitasEditText.setText(mFormGalpal19.getKapasitas());
        mKapasitasEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal19.setKapasitas(1);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mJarakKeDock.setText(mFormGalpal19.getJarakKeDock());
        mJarakKeDock.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal19.setJarakKeDock(1);
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

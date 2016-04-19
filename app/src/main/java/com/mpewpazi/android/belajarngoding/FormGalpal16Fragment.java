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
public class FormGalpal16Fragment extends Fragment {
    private EditText mNamaLahanParkirEditText;
    private EditText mLuasEditText;
    private EditText mDimensiEditText;
    private EditText mKapasitasEditText;
    private EditText mOperasionalEditText;
    private EditText mJarakKeGalangan;

    private Button mSubmitButton;

    private FormGalpal16 mFormGalpal16;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Sementara diinisiasi dulu kepedanya harus di code
        mFormGalpal16=new FormGalpal16();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_form_galpal16, container, false);

        mNamaLahanParkirEditText=(EditText)rootView.findViewById(R.id.galpal16_nama_lahan_parkir);
        mLuasEditText=(EditText)rootView.findViewById(R.id.galpal16_luas);
        mDimensiEditText=(EditText)rootView.findViewById(R.id.galpal16_dimensi);
        mKapasitasEditText=(EditText)rootView.findViewById(R.id.galpal16_kapasitas);
        mOperasionalEditText=(EditText)rootView.findViewById(R.id.galpal16_operasional);
        mJarakKeGalangan=(EditText)rootView.findViewById(R.id.galpal16_jarak_ke_galangan);
        mSubmitButton=(Button)rootView.findViewById(R.id.galpal16_btn_submit);

        mNamaLahanParkirEditText.setText(mFormGalpal16.getNamaLahanParkir());
        mNamaLahanParkirEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal16.setNamaLahanParkir(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mLuasEditText.setText(mFormGalpal16.getLuas());
        mLuasEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal16.setLuas(1);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mDimensiEditText.setText(mFormGalpal16.getDimensi());
        mDimensiEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal16.setDimensi(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mKapasitasEditText.setText(mFormGalpal16.getKapasitas());
        mKapasitasEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal16.setKapasitas(1);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mJarakKeGalangan.setText(mFormGalpal16.getJarakKeGalangan());
        mJarakKeGalangan.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormGalpal16.setJarakKeGalangan(1);
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

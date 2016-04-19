package com.mpewpazi.android.belajarngoding;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mpewpazi.android.belajarngoding.database.BaseDBHelper;
import com.mpewpazi.android.belajarngoding.database.FormKompalDBHelper;

import java.util.List;

/**
 * Created by mpewpazi on 3/27/16.
 */
public class FormKompal2Fragment extends Fragment {

    private static final String NAMA_FORM="Faktor-Faktor Produksi";

    private EditText mBahanBakuEditText;
    private EditText mMesinElektrikalEditText;
    private EditText mPerlengkapanKapalEditText;
    private Button mSubmitButton;

    private Survey mSurvey;
    private List<SingleForm> mForms;
    private FormKompal2 mFormKompal2;

    private FormKompalDBHelper dbHelper;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        mSurvey=SurveyAssignation.get(getActivity()).getSurvey(DrawerFormActivity.surveyId);
        mFormKompal2=mSurvey.getFormKompal2();



        dbHelper=new FormKompalDBHelper(getActivity());

        if(dbHelper.checkIsDataAlreadyInDBorNot(mFormKompal2.getId(),BaseDBHelper.FORM_KOMPAL2_TABLE_NAME)) {
            Cursor cursor = dbHelper.getDataForm(mFormKompal2.getId(), BaseDBHelper.FORM_KOMPAL2_TABLE_NAME);

            cursor.moveToNext();
            //mFormGalpal1.setId(cursor.getInt(cursor.getColumnIndex(BaseDBHelper.FORM_GALPAL1_COLUMN_ID)));

            mFormKompal2.setBahanBaku(cursor.getString(cursor.getColumnIndex(BaseDBHelper.FORM_KOMPAL2_COLUMN_BAHAN_BAKU)));
            mFormKompal2.setMesinSistemElektrikal(cursor.getString(cursor.getColumnIndex(BaseDBHelper.FORM_KOMPAL2_COLUMN_MESIN_SISTEM_ELEKTRIKAL)));
            mFormKompal2.setPerlengkapanKapal(cursor.getString(cursor.getColumnIndex(BaseDBHelper.FORM_KOMPAL2_COLUMN_PERLENGKAPAN_KAPAL)));
            cursor.close();


        }



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_form_kompal2, container, false);

        mBahanBakuEditText=(EditText)rootView.findViewById(R.id.bahan_baku5);
        mMesinElektrikalEditText=(EditText)rootView.findViewById(R.id.mesin_sistem5);
        mPerlengkapanKapalEditText=(EditText)rootView.findViewById(R.id.perlengkapan_kapal5);
        mSubmitButton=(Button)rootView.findViewById(R.id.kompal2_btn_submit);

        mBahanBakuEditText.setText(mFormKompal2.getBahanBaku());
        mBahanBakuEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormKompal2.setBahanBaku(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mMesinElektrikalEditText.setText(mFormKompal2.getMesinSistemElektrikal());
        mMesinElektrikalEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormKompal2.setMesinSistemElektrikal(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mPerlengkapanKapalEditText.setText(mFormKompal2.getPerlengkapanKapal());
        mPerlengkapanKapalEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mFormKompal2.setPerlengkapanKapal(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });





        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dbHelper.checkIsDataAlreadyInDBorNot(mFormKompal2.getId(), BaseDBHelper.FORM_KOMPAL2_TABLE_NAME)) {
                    dbHelper.updateFormKompal2(mFormKompal2.getId(), mFormKompal2.getBahanBaku(), mFormKompal2.getMesinSistemElektrikal(),
                            mFormKompal2.getPerlengkapanKapal());
                }else{
                    dbHelper.insertFormKompal2(mFormKompal2.getId(), mFormKompal2.getBahanBaku(), mFormKompal2.getMesinSistemElektrikal(),
                            mFormKompal2.getPerlengkapanKapal());
                }

                Toast.makeText(getContext(), "Berhasil ", Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }
}

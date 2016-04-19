package com.mpewpazi.android.belajarngoding;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mpewpazi on 4/15/16.
 */
public class FormGalpal19FragmentList extends Fragment {
    private RecyclerView mFormGalpal19RecyclerView;
    //private FormGalpal19Adapter mAdapter;

    private static final String NAMA_FORM = "Organisasi Ruang Bengkel";

    private Survey mSurvey;
    private List<SingleForm> mForms;
    private FormGalpal19 mFormGalpal19;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_formgalpal19_list, container, false);

        mFormGalpal19RecyclerView = (RecyclerView) view.findViewById(R.id.formgalpal19_recycler_view);

        //recycler view butuh layoutmanager untuk mempossionig item di screen
        //ada banyak macam layout manager, kalau linear itu untuk vertikal posisioningnya
        //kedepanya ada gridLayoutManager
        mFormGalpal19RecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateUI();

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        updateUI();
    }

    private void updateUI() {
        mSurvey = SurveyAssignation.get(getActivity()).getSurvey(DrawerFormActivity.surveyId);

        //mForms = mSurvey.getGalpalForms();
        for (int x = 0; x < mForms.size(); x++) {
            if (mForms.get(x).getNamaForm().equals(NAMA_FORM)) {
                mFormGalpal19 = (FormGalpal19) mForms.get(x);
            }
        }


      /* // CrimeLab crimeLab = CrimeLab.get(getActivity());
        //List<Crime> crimes = crimeLab.getCrimes();

        if(mAdapter==null) {
            mAdapter = new FormGalpal19Adapter(crimes);
            mFormGalpal19RecyclerView.setAdapter(mAdapter);
        }else{

            //reload all the item in he list
            mAdapter.notifyDataSetChanged();
        }
    }*/


        class FormGalpal19Holder extends RecyclerView.ViewHolder implements View.OnClickListener {

            private static final String EXTRA_ID_FORMGALPAL19 = "test";

            private TextView mNo;
            private TextView mNamaBengkelTextView;

            private FormGalpal19 mFormGalpal19;
            public FormGalpal19 formGalpal19;

            public FormGalpal19Holder(View itemView) {
                super(itemView);
                itemView.setOnClickListener(this);

                mNo = (TextView) itemView.findViewById(R.id.list_item_bengkel_no);
                mNamaBengkelTextView = (TextView) itemView.findViewById(R.id.list_item_bengkel_nama_bengkel);

            }

            public void bindSurvey(FormGalpal19 formGalpal19) {
                mFormGalpal19 = formGalpal19;
                mNo.setText(mFormGalpal19.getNamaBengkel());
                mNamaBengkelTextView.setText("");

            }

            @Override
            public void onClick(View v) {
                // extranya id formGalpal19 yang di klik
                // Intent intent=new Intent(HomePageActivity.this,DrawerFormActivity.class);
                // intent.putExtra(EXTRA_ID_FORMGALPAL19, formGalpal19.getId());
                // startActivity(intent);
            }
        }

        class FormGalpal19Adapter extends RecyclerView.Adapter<FormGalpal19Holder> {
            private List<FormGalpal19> mFormGalpal19s;

            public FormGalpal19Adapter(List<FormGalpal19> formGalpal19s) {
                mFormGalpal19s = formGalpal19s;
            }

            @Override
            public FormGalpal19Holder onCreateViewHolder(ViewGroup parent, int viewType) {
                LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
                View view = layoutInflater.inflate(R.layout.list_item_organisasi_ruang_bengkel, parent, false);
                return new FormGalpal19Holder(view);
            }

            @Override
            public void onBindViewHolder(FormGalpal19Holder holder, int position) {
                holder.formGalpal19 = mFormGalpal19s.get(position);
                holder.bindSurvey(holder.formGalpal19);

            }

            @Override
            public int getItemCount() {
                return mFormGalpal19s.size();
            }
        }
    }
}
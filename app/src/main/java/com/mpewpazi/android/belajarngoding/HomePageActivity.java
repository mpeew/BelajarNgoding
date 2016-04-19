package com.mpewpazi.android.belajarngoding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class HomePageActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private SurveyAdapter mSurveyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        mRecyclerView=(RecyclerView)findViewById(R.id.surveyy_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        updateUI();
    }

    private void updateUI(){
        SurveyAssignation surveyAssignation=SurveyAssignation.get(this);
        List<Survey> surveys=surveyAssignation.getSurveys();
        mSurveyAdapter=new SurveyAdapter(surveys);
        mRecyclerView.setAdapter(mSurveyAdapter);
    }

    private class SurveyHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private static final String EXTRA_ID_SURVEY="test";

        private TextView mNamaPerusahaanTextView;
        private TextView mDueDateTextView;
        private TextView mJenisObjekTextView;
        private TextView mProgressTextView;
        private ImageView mImageViewGembok;

        private Survey mSurvey;
        public Survey survey;

        public SurveyHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            mNamaPerusahaanTextView=(TextView)itemView.findViewById(R.id.survey_nama_perusahaan);
            mDueDateTextView=(TextView)itemView.findViewById(R.id.survey_due_date);
            mJenisObjekTextView=(TextView)itemView.findViewById(R.id.survey_jenis_objek_survey);
            mProgressTextView=(TextView)itemView.findViewById(R.id.survey_progres_persen);
            mImageViewGembok=(ImageView)itemView.findViewById(R.id.survey_gembok_image);
        }

        public void bindSurvey(Survey survey) {
            mSurvey = survey;
            mNamaPerusahaanTextView.setText(mSurvey.getNamaPerusahaan());
            mJenisObjekTextView.setText(mSurvey.getJenisObjekSurvey());
            //tanggalnya masih di hardcode
            mDueDateTextView.setText("20 Juni 2016");
            mProgressTextView.setText(mSurvey.getProgress() + "%");

            if (mSurvey.isStatusLocked()) {
                mImageViewGembok.setImageResource(R.drawable.lock);
            }else{
                mImageViewGembok.setImageResource(R.drawable.lock_open);
            }
        }

        @Override
        public void onClick(View v) {
           // extranya id survey yang di klik
            Intent intent=new Intent(HomePageActivity.this,DrawerFormActivity.class);
            intent.putExtra(EXTRA_ID_SURVEY,survey.getId());
            startActivity(intent);
        }
    }

    private class SurveyAdapter extends RecyclerView.Adapter<SurveyHolder>{
        private List<Survey> mSurveys;

        public SurveyAdapter(List<Survey> surveys){
            mSurveys=surveys;
        }

        @Override
        public SurveyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater=LayoutInflater.from(HomePageActivity.this);
            View view=layoutInflater.inflate(R.layout.list_item_survey,parent,false);
            return new SurveyHolder(view);
        }

        @Override
        public void onBindViewHolder(SurveyHolder holder, int position) {
            holder.survey=mSurveys.get(position);
            holder.bindSurvey(holder.survey);

        }

        @Override
        public int getItemCount() {
            return mSurveys.size();
        }
    }
}

package com.mpewpazi.android.belajarngoding;

import android.support.v4.app.Fragment;

/**
 * Created by mpewpazi on 3/31/16.
 */
public class SingleForm {
    protected String mNamaForm;
    protected Fragment mFragment;
    protected int mId;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getNamaForm() {
        return mNamaForm;
    }

    public Fragment getFragment() {
        return mFragment;
    }
}

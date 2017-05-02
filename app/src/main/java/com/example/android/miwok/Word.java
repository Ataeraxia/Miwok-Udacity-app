package com.example.android.miwok;

/***
 * Created by Ataeraxia on 2017-05-01.
 */

public class Word {

    private String mMiwokTranslation;

    private String mDefaultTranslation;

    public Word(String defaultTranslation,
                String miwokTranslation) {
        mMiwokTranslation = defaultTranslation;
        mDefaultTranslation = miwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}

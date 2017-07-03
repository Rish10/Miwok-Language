package com.example.android.miwok;

/**
 * Created by rishabh on 23/6/17.
 */

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private static final int   NO_IMAGE_PROVIDED = -1;

    private int mAudioResoureId;



    public Word(String defaultTranslation , String miwokTranslation , int audioResoureId){
        mDefaultTranslation = defaultTranslation;
        mAudioResoureId = audioResoureId;
        mMiwokTranslation = miwokTranslation;
    }
    public Word(String defaultTranslation , String miwokTranslation , int imageResourceID , int audioResoureId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        mAudioResoureId = audioResoureId ;
    }


    /*
    *Get the Default translarion of the word
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /*
    *Get the Miwok translarion of the word
     */
    public int getImageResourceID(){

        return mImageResourceID;
    }
    /*
    *Get the Miwok translarion of the word
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public boolean hasIamge(){
        return mImageResourceID!=NO_IMAGE_PROVIDED;
    }

    public int getAudioResoureId(){
        return  mAudioResoureId;
    }
}

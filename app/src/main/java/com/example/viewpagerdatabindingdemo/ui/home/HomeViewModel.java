package com.example.viewpagerdatabindingdemo.ui.home;

import android.util.Log;

import androidx.databinding.ObservableField;

public class HomeViewModel{

    private ObservableField<String> mText;
    private int count = 0;

    public HomeViewModel() {
        mText = new ObservableField<>();
        mText.set("This is home fragment");
    }

    public void changeText(String old) {
        Log.e("EEE", "change Text:" + old);
        mText.set(old + ++count);
    }

    public String getText() {
        return mText.get();
    }
}
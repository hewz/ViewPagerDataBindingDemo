package com.example.viewpagerdatabindingdemo;

import android.util.Log;

import androidx.databinding.ObservableField;

public class ViewModel {
    private int currentPage = 0;
    private int offscreenPageLimit = 0;

    private ObservableField<String> text;

    public ViewModel(){
        this.text = new ObservableField<>();
        this.text.set("You're at page ");
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getOffscreenPageLimit() {
        return offscreenPageLimit;
    }

    public void setOffscreenPageLimit(int offscreenPageLimit) {
        this.offscreenPageLimit = offscreenPageLimit;
    }

    public void pageSelected(int currentPage) {
        Log.e("EEE", "pageSelected:" + currentPage);
        this.text.set("You're at page " + currentPage);
    }

    public ObservableField<String> getText(){
        return text;
    }
}

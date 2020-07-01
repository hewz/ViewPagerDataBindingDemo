package com.example.viewpagerdatabindingdemo;

import android.util.Log;

import androidx.databinding.ObservableField;

public class ViewModel {
    private int currentPage = 0;
    private int offscreenPageLimit = 0;

    private ObservableField<String> name;

    public ViewModel(){
        this.name = new ObservableField<>();
        this.name.set("VM");
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
        this.name.set("VM" + currentPage);
    }

    public String getName(){
        return name.get();
    }
}

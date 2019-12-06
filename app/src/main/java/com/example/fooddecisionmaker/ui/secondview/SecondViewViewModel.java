package com.example.fooddecisionmaker.ui.secondview;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SecondViewViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SecondViewViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Second View");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
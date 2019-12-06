package com.example.fooddecisionmaker.ui.firstview;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FirstViewViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FirstViewViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Decision Rullet");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
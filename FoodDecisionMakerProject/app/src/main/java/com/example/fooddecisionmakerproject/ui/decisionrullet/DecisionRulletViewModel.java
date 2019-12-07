package com.example.fooddecisionmakerproject.ui.decisionrullet;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DecisionRulletViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DecisionRulletViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Decision Rullet");
    }

    public LiveData<String> getText() {return mText; }
}

package com.example.fooddecisionmakerproject.ui.decisionnavigator;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DecisionNavigatorViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DecisionNavigatorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Decision Navigator");
    }

    public LiveData<String> getText() {return mText; }
}

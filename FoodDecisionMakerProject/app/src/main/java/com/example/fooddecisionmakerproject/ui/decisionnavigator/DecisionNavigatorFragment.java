package com.example.fooddecisionmakerproject.ui.decisionnavigator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.fooddecisionmakerproject.R;

import java.util.zip.Inflater;

public class DecisionNavigatorFragment extends Fragment {

    private DecisionNavigatorViewModel decisionNavigatorViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        decisionNavigatorViewModel =
                ViewModelProviders.of(this).get(DecisionNavigatorViewModel.class);
        View root = inflater.inflate(R.layout.fragment_decisionnavigator, container, false);
        final TextView textView = root.findViewById(R.id.text_decisionnavigator);
        decisionNavigatorViewModel.getText().observe(this,new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}

package com.example.fooddecisionmaker.ui.firstview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.fooddecisionmaker.R;

public class FirstViewFragment extends Fragment {

    private FirstViewViewModel firstViewViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        firstViewViewModel =
                ViewModelProviders.of(this).get(FirstViewViewModel.class);
        View root = inflater.inflate(R.layout.fragment_firstview, container, false);
        final TextView textView = root.findViewById(R.id.text_decision_rullet);
        firstViewViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
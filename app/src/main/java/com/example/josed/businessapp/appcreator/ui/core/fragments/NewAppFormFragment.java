package com.example.josed.businessapp.appcreator.ui.core.fragments;


import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import com.example.josed.businessapp.R;
import com.example.josed.businessapp.appcreator.ui.core.helper.CustomOnItemSelectedListener;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewAppFormFragment extends Fragment {

    Spinner stateSpinner;

    public NewAppFormFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_new_app_form, container, false);
        addListenerOnSpinnerItemSelection(root);

        return root;
    }

    public void addListenerOnSpinnerItemSelection(View view) {
        stateSpinner = view.findViewById(R.id.StateSpinner);
        stateSpinner.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }
}

package com.example.josed.businessapp.appcreator.ui.core.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.josed.businessapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AppCreatorScreenFragment extends Fragment {


    public AppCreatorScreenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_app_creator_screen, container, false);
    }

}

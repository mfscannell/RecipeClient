package com.scannell.mark.recipeclient;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class OwnRecipesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment_main_friends, container, false);
        View rootView = inflater.inflate(R.layout.fragment_main_self, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        textView.setText("Own Recipes");
        return rootView;
    }
}
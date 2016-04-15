package com.snist.theja.sai.trinity;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sai on 07-01-2016.
 */
public class fragment_map extends Fragment {

    public fragment_map(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.layout_map, container, false);

        return rootView;
    }
}
package com.snist.theja.sai.trinity;

/**
 * Created by sai on 07-01-2016.
 */
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragment_develop extends Fragment {

    public fragment_develop(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.layout_developer, container, false);

        return rootView;
    }
}
package com.example.fivegroup.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.fivegroup.R;

import java.util.HashMap;

public class FragmentFreqTime extends CommonFragment {
    EditText et_x;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_freq_time, container, false);

        this.et_x = root.findViewById(R.id.et_x);

        return root;
    }

    public static FragmentFreqTime newInstance() {
        FragmentFreqTime frag = new FragmentFreqTime();
        return frag;
    }

    @Override
    public HashMap getResult(){
        HashMap result = new HashMap();
        result.put("CMD","FREQ_TIME");
        result.put("X", Integer.parseInt(this.et_x.getText().toString()));
        return result;
    }

}

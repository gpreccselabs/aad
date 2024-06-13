package com.example.a7thexp;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {
    Button bt;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle obj)
    {
        view=inflater.inflate(R.layout.fragment_first,container,false);
        bt=view.findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"First Fragment",Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}

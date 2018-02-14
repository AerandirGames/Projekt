package com.example.kai.appalk;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Kai on 29.01.2018.
 */

public class Registrieren_Tab3 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab3_praxis, container, false);
        Button registrieren = view.findViewById(R.id.but_tab3register);
        Button back = view.findViewById(R.id.but_tab3zur);

        registrieren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        back.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                ((Registrieren) getActivity()).setCurrentItem(1, true);
            }
        });
        return view;

    }
}

package com.example.viktor.mma;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Viktor on 04-05-2016.
 */
public class HomeFragment extends Fragment {
    private String TAG = "HomeFragment";
    private NewXpenseFragment newXpenseFragment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        if (container != null)
            container.removeAllViews();

        View v = inflater.inflate(R.layout.home_fragment, container, false);

        ButtonSetup(v);

        return v;
    }
    private void ButtonSetup(final View v) {
        newXpenseFragment = new NewXpenseFragment();

        Button newXpenseBTN = (Button) v.findViewById(R.id.button);
        Button shpnListBTN = (Button) v.findViewById(R.id.button2);

        newXpenseBTN.setClickable(true);
        shpnListBTN.setClickable(true);

        newXpenseBTN.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        getFragmentManager().beginTransaction().replace(R.id.fragment_container, newXpenseFragment).commit();
                    }
                }
        );
    }
}

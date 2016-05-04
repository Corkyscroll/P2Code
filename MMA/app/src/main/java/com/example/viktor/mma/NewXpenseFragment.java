package com.example.viktor.mma;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Viktor on 03-05-2016.
 */
public class NewXpenseFragment extends Fragment {
    private String TAG = "NewXpenseFragment";
    private HomeFragment homeFragment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (container != null)
            container.removeAllViews();
        View v = inflater.inflate(R.layout.new_xpense_fragment, container, false);

        ButtonSetup(v);

        return v;
    }

    private void ButtonSetup(final View v) {
        homeFragment = new HomeFragment();

        Button doneBTN = (Button) v.findViewById(R.id.doneButton);
//        EditText itemName = (EditText) v.findViewById(R.id.itemNameText);
//        EditText itemPrice = (EditText) v.findViewById(R.id.itemPriceText);

        doneBTN.setClickable(true);
        doneBTN.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                                       public void onClick(View v) {
                                           Log.d(TAG, "onClick: WOHO");
                        getFragmentManager().beginTransaction().replace(R.id.fragment_container, homeFragment).commit();
                                       }
                                   }
        );
    }
}

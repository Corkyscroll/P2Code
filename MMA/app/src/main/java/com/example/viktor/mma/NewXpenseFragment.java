package com.example.viktor.mma;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Viktor on 03-05-2016.
 */
public class NewXpenseFragment extends Fragment {
    private String TAG = "NewXpenseFragment";
    private ShoppingListFragment shpnListFragment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (container != null)
            container.removeAllViews();
        View v = inflater.inflate(R.layout.new_xpense_fragment, container, false);

        ButtonSetup(v);

        return v;
    }

    private void ButtonSetup(final View v) {
        shpnListFragment = new ShoppingListFragment();

        Button doneBTN = (Button) v.findViewById(R.id.doneButton);
        final EditText itemName = (EditText) v.findViewById(R.id.itemNameText);
        final EditText itemPrice = (EditText) v.findViewById(R.id.itemPriceText);
        final Switch switchstatus = (Switch) v.findViewById(R.id.plannedSwitch);
        final Switch switchstatus2 = (Switch) v.findViewById(R.id.needSwitch);



        doneBTN.setClickable(true);
        doneBTN.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (itemName.getText().toString().equals("") && itemPrice.getText().toString().equals("")) {
                            Toast.makeText(getActivity(), "Please enter an item name and a price", Toast.LENGTH_LONG).show();
                        }
                        else {
                            if (switchstatus.isChecked()){
                                SaveClass.setunplanned(Double.parseDouble(itemPrice.getText().toString()));

                            }
                            SaveClass.setCamefromnewexpense(true);
                            SaveClass.SetShoppingListContainer(itemName.getText().toString());
                            SaveClass.CountUp();
                            SaveClass.SetMoneySpent(Double.parseDouble(itemPrice.getText().toString()));
                            SaveClass.setNicearray(switchstatus2.isChecked());
                            SaveClass.setPlannedarray(switchstatus.isChecked());
                            SaveClass.setPricearray(Double.parseDouble(itemPrice.getText().toString()));
                            getFragmentManager().beginTransaction().replace(R.id.fragment_container, shpnListFragment).commit();
                        }
                                       }
                                   }
        );
    }
}

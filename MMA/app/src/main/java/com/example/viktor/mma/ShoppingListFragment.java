package com.example.viktor.mma;

import android.app.Fragment;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by Viktor on 04-05-2016.
 */
public class ShoppingListFragment extends Fragment {
    private String TAG = "ShoppingListFragment";
    private NewXpenseFragment newXpenseFragment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (container != null)
            container.removeAllViews();
        View v = inflater.inflate(R.layout.shopping_list_fragment, container, false);

        LabelSetup(v);
        ButtonSetup(v);

        return v;
    }

    private void LabelSetup(final View v) {
        if (SaveClass.getCamefromnewexpense()==true) {

            ArrayList<String> shopContainer = SaveClass.GetShoppingListContainer();
            int placement = SaveClass.GetCounter();
            double totalPrice = SaveClass.GetMoneySpent();

            TextView label1 = (TextView) v.findViewById(R.id.textView3);
            TextView label2 = (TextView) v.findViewById(R.id.textView5);
            TextView label3 = (TextView) v.findViewById(R.id.textView6);
            TextView label4 = (TextView) v.findViewById(R.id.textView7);
            TextView label5 = (TextView) v.findViewById(R.id.textView8);
            TextView label6 = (TextView) v.findViewById(R.id.textView9);
            TextView label7 = (TextView) v.findViewById(R.id.textView10);
            TextView label8 = (TextView) v.findViewById(R.id.textView11);
            TextView label9 = (TextView) v.findViewById(R.id.textView12);
            TextView label10 = (TextView) v.findViewById(R.id.textView13);
            TextView label11 = (TextView) v.findViewById(R.id.textView14);
            TextView label12 = (TextView) v.findViewById(R.id.textView15);
            TextView label13 = (TextView) v.findViewById(R.id.textView16);
            TextView label14 = (TextView) v.findViewById(R.id.textView17);
            TextView label15 = (TextView) v.findViewById(R.id.textView18);
            TextView label16 = (TextView) v.findViewById(R.id.textView19);
            TextView label17 = (TextView) v.findViewById(R.id.textView20);
            TextView label18 = (TextView) v.findViewById(R.id.textView21);
            TextView label19 = (TextView) v.findViewById(R.id.textView22);
            TextView label20 = (TextView) v.findViewById(R.id.textView23);

            CheckBox checkbox1 = (CheckBox) v.findViewById(R.id.checkBox0);
            CheckBox checkbox2 = (CheckBox) v.findViewById(R.id.checkBox1);
            CheckBox checkbox3 = (CheckBox) v.findViewById(R.id.checkBox2);
            CheckBox checkbox4 = (CheckBox) v.findViewById(R.id.checkBox3);
            CheckBox checkbox5 = (CheckBox) v.findViewById(R.id.checkBox4);
            CheckBox checkbox6 = (CheckBox) v.findViewById(R.id.checkBox5);
            CheckBox checkbox7 = (CheckBox) v.findViewById(R.id.checkBox6);
            CheckBox checkbox8 = (CheckBox) v.findViewById(R.id.checkBox7);
            CheckBox checkbox9 = (CheckBox) v.findViewById(R.id.checkBox8);
            CheckBox checkbox10 = (CheckBox) v.findViewById(R.id.checkBox9);
            CheckBox checkbox11 = (CheckBox) v.findViewById(R.id.checkBox10);
            CheckBox checkbox12 = (CheckBox) v.findViewById(R.id.checkBox11);
            CheckBox checkbox13 = (CheckBox) v.findViewById(R.id.checkBox12);
            CheckBox checkbox14 = (CheckBox) v.findViewById(R.id.checkBox13);
            CheckBox checkbox15 = (CheckBox) v.findViewById(R.id.checkBox14);
            CheckBox checkbox16 = (CheckBox) v.findViewById(R.id.checkBox15);
            CheckBox checkbox17 = (CheckBox) v.findViewById(R.id.checkBox16);
            CheckBox checkbox18 = (CheckBox) v.findViewById(R.id.checkBox17);
            CheckBox checkbox19 = (CheckBox) v.findViewById(R.id.checkBox18);
            CheckBox checkbox20 = (CheckBox) v.findViewById(R.id.checkBox19);

            ImageButton imagebutton1 = (ImageButton) v.findViewById(R.id.imageButton0);
            ImageButton imagebutton2 = (ImageButton) v.findViewById(R.id.imageButton1);
            ImageButton imagebutton3 = (ImageButton) v.findViewById(R.id.imageButton2);
            ImageButton imagebutton4 = (ImageButton) v.findViewById(R.id.imageButton3);
            ImageButton imagebutton5 = (ImageButton) v.findViewById(R.id.imageButton4);
            ImageButton imagebutton6 = (ImageButton) v.findViewById(R.id.imageButton5);
            ImageButton imagebutton7 = (ImageButton) v.findViewById(R.id.imageButton6);
            ImageButton imagebutton8 = (ImageButton) v.findViewById(R.id.imageButton7);
            ImageButton imagebutton9 = (ImageButton) v.findViewById(R.id.imageButton8);
            ImageButton imagebutton10 = (ImageButton) v.findViewById(R.id.imageButton9);
            ImageButton imagebutton11 = (ImageButton) v.findViewById(R.id.imageButton10);
            ImageButton imagebutton12 = (ImageButton) v.findViewById(R.id.imageButton11);
            ImageButton imagebutton13 = (ImageButton) v.findViewById(R.id.imageButton12);
            ImageButton imagebutton14 = (ImageButton) v.findViewById(R.id.imageButton13);
            ImageButton imagebutton15 = (ImageButton) v.findViewById(R.id.imageButton14);
            ImageButton imagebutton16 = (ImageButton) v.findViewById(R.id.imageButton15);
            ImageButton imagebutton17 = (ImageButton) v.findViewById(R.id.imageButton16);
            ImageButton imagebutton18 = (ImageButton) v.findViewById(R.id.imageButton17);
            ImageButton imagebutton19 = (ImageButton) v.findViewById(R.id.imageButton18);
            ImageButton imagebutton20 = (ImageButton) v.findViewById(R.id.imageButton19);



            if (placement>=0) {
                label1.setText(shopContainer.get(0));
                checkbox1.setVisibility(View.VISIBLE);
                imagebutton1.setVisibility(View.VISIBLE);
            }
            if (placement>=1) {
                label2.setText(shopContainer.get(1));
                checkbox2.setVisibility(View.VISIBLE);
                imagebutton2.setVisibility(View.VISIBLE);
            }
            if (placement>=2) {
                label3.setText(shopContainer.get(2));
                checkbox3.setVisibility(View.VISIBLE);
                imagebutton3.setVisibility(View.VISIBLE);
            }
            if (placement>=3) {
                label4.setText(shopContainer.get(3));
                checkbox4.setVisibility(View.VISIBLE);
                imagebutton4.setVisibility(View.VISIBLE);
            }
            if (placement>=4) {
                label5.setText(shopContainer.get(4));
                checkbox5.setVisibility(View.VISIBLE);
                imagebutton5.setVisibility(View.VISIBLE);
            }
            if (placement>=5) {
                label6.setText(shopContainer.get(5));
                checkbox6.setVisibility(View.VISIBLE);
                imagebutton6.setVisibility(View.VISIBLE);
            }
            if (placement>=6) {
                label7.setText(shopContainer.get(6));
                checkbox7.setVisibility(View.VISIBLE);
                imagebutton7.setVisibility(View.VISIBLE);
            }
            if (placement>=7) {
                label8.setText(shopContainer.get(7));
                checkbox8.setVisibility(View.VISIBLE);
                imagebutton8.setVisibility(View.VISIBLE);
            }
            if (placement>=8) {
                label9.setText(shopContainer.get(8));
                checkbox9.setVisibility(View.VISIBLE);
                imagebutton9.setVisibility(View.VISIBLE);
            }
            if (placement>=9) {
                label10.setText(shopContainer.get(9));
                checkbox10.setVisibility(View.VISIBLE);
                imagebutton10.setVisibility(View.VISIBLE);
            }
            if (placement>=10) {
                label11.setText(shopContainer.get(10));
                checkbox11.setVisibility(View.VISIBLE);
                imagebutton11.setVisibility(View.VISIBLE);
            }
            if (placement>=11) {
                label12.setText(shopContainer.get(11));
                checkbox12.setVisibility(View.VISIBLE);
                imagebutton12.setVisibility(View.VISIBLE);
            }
            if (placement>=12) {
                label13.setText(shopContainer.get(12));
                checkbox13.setVisibility(View.VISIBLE);
                imagebutton13.setVisibility(View.VISIBLE);
            }
            if (placement>=13) {
                label14.setText(shopContainer.get(13));
                checkbox14.setVisibility(View.VISIBLE);
                imagebutton14.setVisibility(View.VISIBLE);
            }
            if (placement>=14) {
                label15.setText(shopContainer.get(14));
                checkbox15.setVisibility(View.VISIBLE);
                imagebutton15.setVisibility(View.VISIBLE);
            }
            if (placement>=15) {
                label16.setText(shopContainer.get(15));
                checkbox16.setVisibility(View.VISIBLE);
                imagebutton16.setVisibility(View.VISIBLE);
            }
            if (placement>=16) {
                label17.setText(shopContainer.get(16));
                checkbox17.setVisibility(View.VISIBLE);
                imagebutton17.setVisibility(View.VISIBLE);
            }
            if (placement>=17) {
                label18.setText(shopContainer.get(17));
                checkbox18.setVisibility(View.VISIBLE);
                imagebutton18.setVisibility(View.VISIBLE);
            }
            if (placement>=18) {
                label19.setText(shopContainer.get(18));
                checkbox19.setVisibility(View.VISIBLE);
                imagebutton19.setVisibility(View.VISIBLE);
            }
            if (placement>=19) {
                label20.setText(shopContainer.get(19));
                checkbox20.setVisibility(View.VISIBLE);
                imagebutton20.setVisibility(View.VISIBLE);
            }

            TextView totalPriceLabel = (TextView) v.findViewById(R.id.totalPriceDouble);

            totalPriceLabel.setText(Double.toString(totalPrice));
        }
    }

    private void ButtonSetup(final View v) {
        newXpenseFragment = new NewXpenseFragment();

        final TextView label1 = (TextView) v.findViewById(R.id.textView3);
        final TextView label2 = (TextView) v.findViewById(R.id.textView5);
        final TextView label3 = (TextView) v.findViewById(R.id.textView6);
        final TextView label4 = (TextView) v.findViewById(R.id.textView7);
        final TextView label5 = (TextView) v.findViewById(R.id.textView8);
        final TextView label6 = (TextView) v.findViewById(R.id.textView9);
        final TextView label7 = (TextView) v.findViewById(R.id.textView10);
        final TextView label8 = (TextView) v.findViewById(R.id.textView11);
        final TextView label9 = (TextView) v.findViewById(R.id.textView12);
        final TextView label10 = (TextView) v.findViewById(R.id.textView13);
        final TextView label11 = (TextView) v.findViewById(R.id.textView14);
        final TextView label12 = (TextView) v.findViewById(R.id.textView15);
        final TextView label13 = (TextView) v.findViewById(R.id.textView16);
        final TextView label14 = (TextView) v.findViewById(R.id.textView17);
        final TextView label15 = (TextView) v.findViewById(R.id.textView18);
        final TextView label16 = (TextView) v.findViewById(R.id.textView19);
        final TextView label17 = (TextView) v.findViewById(R.id.textView20);
        final TextView label18 = (TextView) v.findViewById(R.id.textView21);
        final TextView label19 = (TextView) v.findViewById(R.id.textView22);
        final TextView label20 = (TextView) v.findViewById(R.id.textView23);

        final CheckBox checkbox1 = (CheckBox) v.findViewById(R.id.checkBox0);
        final CheckBox checkbox2 = (CheckBox) v.findViewById(R.id.checkBox1);
        final CheckBox checkbox3 = (CheckBox) v.findViewById(R.id.checkBox2);
        final CheckBox checkbox4 = (CheckBox) v.findViewById(R.id.checkBox3);
        final CheckBox checkbox5 = (CheckBox) v.findViewById(R.id.checkBox4);
        final CheckBox checkbox6 = (CheckBox) v.findViewById(R.id.checkBox5);
        final CheckBox checkbox7 = (CheckBox) v.findViewById(R.id.checkBox6);
        final CheckBox checkbox8 = (CheckBox) v.findViewById(R.id.checkBox7);
        final CheckBox checkbox9 = (CheckBox) v.findViewById(R.id.checkBox8);
        final CheckBox checkbox10 = (CheckBox) v.findViewById(R.id.checkBox9);
        final CheckBox checkbox11 = (CheckBox) v.findViewById(R.id.checkBox10);
        final CheckBox checkbox12 = (CheckBox) v.findViewById(R.id.checkBox11);
        final CheckBox checkbox13 = (CheckBox) v.findViewById(R.id.checkBox12);
        final CheckBox checkbox14 = (CheckBox) v.findViewById(R.id.checkBox13);
        final CheckBox checkbox15 = (CheckBox) v.findViewById(R.id.checkBox14);
        final CheckBox checkbox16 = (CheckBox) v.findViewById(R.id.checkBox15);
        final CheckBox checkbox17 = (CheckBox) v.findViewById(R.id.checkBox16);
        final CheckBox checkbox18 = (CheckBox) v.findViewById(R.id.checkBox17);
        final CheckBox checkbox19 = (CheckBox) v.findViewById(R.id.checkBox18);
        final CheckBox checkbox20 = (CheckBox) v.findViewById(R.id.checkBox19);

        final ImageButton imagebutton1 = (ImageButton) v.findViewById(R.id.imageButton0);
        final ImageButton imagebutton2 = (ImageButton) v.findViewById(R.id.imageButton1);
        final ImageButton imagebutton3 = (ImageButton) v.findViewById(R.id.imageButton2);
        final ImageButton imagebutton4 = (ImageButton) v.findViewById(R.id.imageButton3);
        final ImageButton imagebutton5 = (ImageButton) v.findViewById(R.id.imageButton4);
        final ImageButton imagebutton6 = (ImageButton) v.findViewById(R.id.imageButton5);
        final ImageButton imagebutton7 = (ImageButton) v.findViewById(R.id.imageButton6);
        final ImageButton imagebutton8 = (ImageButton) v.findViewById(R.id.imageButton7);
        final ImageButton imagebutton9 = (ImageButton) v.findViewById(R.id.imageButton8);
        final ImageButton imagebutton10 = (ImageButton) v.findViewById(R.id.imageButton9);
        final ImageButton imagebutton11 = (ImageButton) v.findViewById(R.id.imageButton10);
        final ImageButton imagebutton12 = (ImageButton) v.findViewById(R.id.imageButton11);
        final ImageButton imagebutton13 = (ImageButton) v.findViewById(R.id.imageButton12);
        final ImageButton imagebutton14 = (ImageButton) v.findViewById(R.id.imageButton13);
        final ImageButton imagebutton15 = (ImageButton) v.findViewById(R.id.imageButton14);
        final ImageButton imagebutton16 = (ImageButton) v.findViewById(R.id.imageButton15);
        final ImageButton imagebutton17 = (ImageButton) v.findViewById(R.id.imageButton16);
        final ImageButton imagebutton18 = (ImageButton) v.findViewById(R.id.imageButton17);
        final ImageButton imagebutton19 = (ImageButton) v.findViewById(R.id.imageButton18);
        final ImageButton imagebutton20 = (ImageButton) v.findViewById(R.id.imageButton19);

        ImageButton newXpenseBTN = (ImageButton) v.findViewById(R.id.button3);
        ImageButton checkOutBTN = (ImageButton) v.findViewById(R.id.checkoutButton);
        checkOutBTN.setClickable(true);
        newXpenseBTN.setClickable(true);

        newXpenseBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, newXpenseFragment).commit();
            }

        });
        imagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveClass.CountDown();
                label1.setText(label2.getText());
                label2.setText(label3.getText());
                label3.setText(label4.getText());
                label4.setText(label5.getText());
                label5.setText(label6.getText());
                label6.setText(label7.getText());
                label7.setText(label8.getText());
                label8.setText(label9.getText());
                label9.setText(label10.getText());
                label10.setText(label11.getText());
                label11.setText(label12.getText());
                label12.setText(label13.getText());
                label13.setText(label14.getText());
                label14.setText(label15.getText());
                label15.setText(label16.getText());
                label16.setText(label17.getText());
                label17.setText(label18.getText());
                label18.setText(label19.getText());
                label19.setText(label20.getText());
                label20.setText("");

                if (label1.getText().toString().equals("")){
                    checkbox1.setVisibility(View.INVISIBLE);
                    imagebutton1.setVisibility(View.INVISIBLE);
                }
                if (label2.getText().toString().equals("")){
                    checkbox2.setVisibility(View.INVISIBLE);
                    imagebutton2.setVisibility(View.INVISIBLE);
                }
                if (label3.getText().toString().equals("")){
                    checkbox3.setVisibility(View.INVISIBLE);
                    imagebutton3.setVisibility(View.INVISIBLE);
                }
                if (label4.getText().toString().equals("")){
                    checkbox4.setVisibility(View.INVISIBLE);
                    imagebutton4.setVisibility(View.INVISIBLE);
                }
                if (label5.getText().toString().equals("")){
                    checkbox5.setVisibility(View.INVISIBLE);
                    imagebutton5.setVisibility(View.INVISIBLE);
                }
                if (label6.getText().toString().equals("")){
                    checkbox6.setVisibility(View.INVISIBLE);
                    imagebutton6.setVisibility(View.INVISIBLE);
                }
                if (label7.getText().toString().equals("")){
                    checkbox7.setVisibility(View.INVISIBLE);
                    imagebutton7.setVisibility(View.INVISIBLE);
                }
                if (label8.getText().toString().equals("")){
                    checkbox8.setVisibility(View.INVISIBLE);
                    imagebutton8.setVisibility(View.INVISIBLE);
                }
                if (label9.getText().toString().equals("")){
                    checkbox9.setVisibility(View.INVISIBLE);
                    imagebutton9.setVisibility(View.INVISIBLE);
                }
                if (label10.getText().toString().equals("")){
                    checkbox10.setVisibility(View.INVISIBLE);
                    imagebutton10.setVisibility(View.INVISIBLE);
                }
                if (label11.getText().toString().equals("")){
                    checkbox11.setVisibility(View.INVISIBLE);
                    imagebutton11.setVisibility(View.INVISIBLE);
                }
                if (label12.getText().toString().equals("")){
                    checkbox12.setVisibility(View.INVISIBLE);
                    imagebutton12.setVisibility(View.INVISIBLE);
                }
                if (label13.getText().toString().equals("")){
                    checkbox13.setVisibility(View.INVISIBLE);
                    imagebutton13.setVisibility(View.INVISIBLE);
                }
                if (label14.getText().toString().equals("")){
                    checkbox14.setVisibility(View.INVISIBLE);
                    imagebutton14.setVisibility(View.INVISIBLE);
                }
                if (label15.getText().toString().equals("")){
                    checkbox15.setVisibility(View.INVISIBLE);
                    imagebutton15.setVisibility(View.INVISIBLE);
                }
                if (label16.getText().toString().equals("")){
                    checkbox16.setVisibility(View.INVISIBLE);
                    imagebutton16.setVisibility(View.INVISIBLE);
                }
                if (label17.getText().toString().equals("")){
                    checkbox17.setVisibility(View.INVISIBLE);
                    imagebutton17.setVisibility(View.INVISIBLE);
                }
                if (label18.getText().toString().equals("")){
                    checkbox18.setVisibility(View.INVISIBLE);
                    imagebutton18.setVisibility(View.INVISIBLE);
                }
                if (label19.getText().toString().equals("")){
                    checkbox19.setVisibility(View.INVISIBLE);
                    imagebutton19.setVisibility(View.INVISIBLE);
                }
                if (label20.getText().toString().equals("")){
                    checkbox20.setVisibility(View.INVISIBLE);
                    imagebutton20.setVisibility(View.INVISIBLE);
                }
            }
        });
        imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveClass.CountDown();
                label2.setText(label3.getText());
                label3.setText(label4.getText());
                label4.setText(label5.getText());
                label5.setText(label6.getText());
                label6.setText(label7.getText());
                label7.setText(label8.getText());
                label8.setText(label9.getText());
                label9.setText(label10.getText());
                label10.setText(label11.getText());
                label11.setText(label12.getText());
                label12.setText(label13.getText());
                label13.setText(label14.getText());
                label14.setText(label15.getText());
                label15.setText(label16.getText());
                label16.setText(label17.getText());
                label17.setText(label18.getText());
                label18.setText(label19.getText());
                label19.setText(label20.getText());
                label20.setText("");

                if (label1.getText().toString().equals("")){
                    checkbox1.setVisibility(View.INVISIBLE);
                    imagebutton1.setVisibility(View.INVISIBLE);
                }
                if (label2.getText().toString().equals("")){
                    checkbox2.setVisibility(View.INVISIBLE);
                    imagebutton2.setVisibility(View.INVISIBLE);
                }
                if (label3.getText().toString().equals("")){
                    checkbox3.setVisibility(View.INVISIBLE);
                    imagebutton3.setVisibility(View.INVISIBLE);
                }
                if (label4.getText().toString().equals("")){
                    checkbox4.setVisibility(View.INVISIBLE);
                    imagebutton4.setVisibility(View.INVISIBLE);
                }
                if (label5.getText().toString().equals("")){
                    checkbox5.setVisibility(View.INVISIBLE);
                    imagebutton5.setVisibility(View.INVISIBLE);
                }
                if (label6.getText().toString().equals("")){
                    checkbox6.setVisibility(View.INVISIBLE);
                    imagebutton6.setVisibility(View.INVISIBLE);
                }
                if (label7.getText().toString().equals("")){
                    checkbox7.setVisibility(View.INVISIBLE);
                    imagebutton7.setVisibility(View.INVISIBLE);
                }
                if (label8.getText().toString().equals("")){
                    checkbox8.setVisibility(View.INVISIBLE);
                    imagebutton8.setVisibility(View.INVISIBLE);
                }
                if (label9.getText().toString().equals("")){
                    checkbox9.setVisibility(View.INVISIBLE);
                    imagebutton9.setVisibility(View.INVISIBLE);
                }
                if (label10.getText().toString().equals("")){
                    checkbox10.setVisibility(View.INVISIBLE);
                    imagebutton10.setVisibility(View.INVISIBLE);
                }
                if (label11.getText().toString().equals("")){
                    checkbox11.setVisibility(View.INVISIBLE);
                    imagebutton11.setVisibility(View.INVISIBLE);
                }
                if (label12.getText().toString().equals("")){
                    checkbox12.setVisibility(View.INVISIBLE);
                    imagebutton12.setVisibility(View.INVISIBLE);
                }
                if (label13.getText().toString().equals("")){
                    checkbox13.setVisibility(View.INVISIBLE);
                    imagebutton13.setVisibility(View.INVISIBLE);
                }
                if (label14.getText().toString().equals("")){
                    checkbox14.setVisibility(View.INVISIBLE);
                    imagebutton14.setVisibility(View.INVISIBLE);
                }
                if (label15.getText().toString().equals("")){
                    checkbox15.setVisibility(View.INVISIBLE);
                    imagebutton15.setVisibility(View.INVISIBLE);
                }
                if (label16.getText().toString().equals("")){
                    checkbox16.setVisibility(View.INVISIBLE);
                    imagebutton16.setVisibility(View.INVISIBLE);
                }
                if (label17.getText().toString().equals("")){
                    checkbox17.setVisibility(View.INVISIBLE);
                    imagebutton17.setVisibility(View.INVISIBLE);
                }
                if (label18.getText().toString().equals("")){
                    checkbox18.setVisibility(View.INVISIBLE);
                    imagebutton18.setVisibility(View.INVISIBLE);
                }
                if (label19.getText().toString().equals("")){
                    checkbox19.setVisibility(View.INVISIBLE);
                    imagebutton19.setVisibility(View.INVISIBLE);
                }
                if (label20.getText().toString().equals("")){
                    checkbox20.setVisibility(View.INVISIBLE);
                    imagebutton20.setVisibility(View.INVISIBLE);
                }
    }
});
        imagebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveClass.CountDown();
                label3.setText(label4.getText());
                label4.setText(label5.getText());
                label5.setText(label6.getText());
                label6.setText(label7.getText());
                label7.setText(label8.getText());
                label8.setText(label9.getText());
                label9.setText(label10.getText());
                label10.setText(label11.getText());
                label11.setText(label12.getText());
                label12.setText(label13.getText());
                label13.setText(label14.getText());
                label14.setText(label15.getText());
                label15.setText(label16.getText());
                label16.setText(label17.getText());
                label17.setText(label18.getText());
                label18.setText(label19.getText());
                label19.setText(label20.getText());
                label20.setText("");

                if (label1.getText().toString().equals("")){
                    checkbox1.setVisibility(View.INVISIBLE);
                    imagebutton1.setVisibility(View.INVISIBLE);
                }
                if (label2.getText().toString().equals("")){
                    checkbox2.setVisibility(View.INVISIBLE);
                    imagebutton2.setVisibility(View.INVISIBLE);
                }
                if (label3.getText().toString().equals("")){
                    checkbox3.setVisibility(View.INVISIBLE);
                    imagebutton3.setVisibility(View.INVISIBLE);
                }
                if (label4.getText().toString().equals("")){
                    checkbox4.setVisibility(View.INVISIBLE);
                    imagebutton4.setVisibility(View.INVISIBLE);
                }
                if (label5.getText().toString().equals("")){
                    checkbox5.setVisibility(View.INVISIBLE);
                    imagebutton5.setVisibility(View.INVISIBLE);
                }
                if (label6.getText().toString().equals("")){
                    checkbox6.setVisibility(View.INVISIBLE);
                    imagebutton6.setVisibility(View.INVISIBLE);
                }
                if (label7.getText().toString().equals("")){
                    checkbox7.setVisibility(View.INVISIBLE);
                    imagebutton7.setVisibility(View.INVISIBLE);
                }
                if (label8.getText().toString().equals("")){
                    checkbox8.setVisibility(View.INVISIBLE);
                    imagebutton8.setVisibility(View.INVISIBLE);
                }
                if (label9.getText().toString().equals("")){
                    checkbox9.setVisibility(View.INVISIBLE);
                    imagebutton9.setVisibility(View.INVISIBLE);
                }
                if (label10.getText().toString().equals("")){
                    checkbox10.setVisibility(View.INVISIBLE);
                    imagebutton10.setVisibility(View.INVISIBLE);
                }
                if (label11.getText().toString().equals("")){
                    checkbox11.setVisibility(View.INVISIBLE);
                    imagebutton11.setVisibility(View.INVISIBLE);
                }
                if (label12.getText().toString().equals("")){
                    checkbox12.setVisibility(View.INVISIBLE);
                    imagebutton12.setVisibility(View.INVISIBLE);
                }
                if (label13.getText().toString().equals("")){
                    checkbox13.setVisibility(View.INVISIBLE);
                    imagebutton13.setVisibility(View.INVISIBLE);
                }
                if (label14.getText().toString().equals("")){
                    checkbox14.setVisibility(View.INVISIBLE);
                    imagebutton14.setVisibility(View.INVISIBLE);
                }
                if (label15.getText().toString().equals("")){
                    checkbox15.setVisibility(View.INVISIBLE);
                    imagebutton15.setVisibility(View.INVISIBLE);
                }
                if (label16.getText().toString().equals("")){
                    checkbox16.setVisibility(View.INVISIBLE);
                    imagebutton16.setVisibility(View.INVISIBLE);
                }
                if (label17.getText().toString().equals("")){
                    checkbox17.setVisibility(View.INVISIBLE);
                    imagebutton17.setVisibility(View.INVISIBLE);
                }
                if (label18.getText().toString().equals("")){
                    checkbox18.setVisibility(View.INVISIBLE);
                    imagebutton18.setVisibility(View.INVISIBLE);
                }
                if (label19.getText().toString().equals("")){
                    checkbox19.setVisibility(View.INVISIBLE);
                    imagebutton19.setVisibility(View.INVISIBLE);
                }
                if (label20.getText().toString().equals("")){
                    checkbox20.setVisibility(View.INVISIBLE);
                    imagebutton20.setVisibility(View.INVISIBLE);
                }
            }
        });
        imagebutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveClass.CountDown();
                label4.setText(label5.getText());
                label5.setText(label6.getText());
                label6.setText(label7.getText());
                label7.setText(label8.getText());
                label8.setText(label9.getText());
                label9.setText(label10.getText());
                label10.setText(label11.getText());
                label11.setText(label12.getText());
                label12.setText(label13.getText());
                label13.setText(label14.getText());
                label14.setText(label15.getText());
                label15.setText(label16.getText());
                label16.setText(label17.getText());
                label17.setText(label18.getText());
                label18.setText(label19.getText());
                label19.setText(label20.getText());
                label20.setText("");

                if (label1.getText().toString().equals("")){
                    checkbox1.setVisibility(View.INVISIBLE);
                    imagebutton1.setVisibility(View.INVISIBLE);
                }
                if (label2.getText().toString().equals("")){
                    checkbox2.setVisibility(View.INVISIBLE);
                    imagebutton2.setVisibility(View.INVISIBLE);
                }
                if (label3.getText().toString().equals("")){
                    checkbox3.setVisibility(View.INVISIBLE);
                    imagebutton3.setVisibility(View.INVISIBLE);
                }
                if (label4.getText().toString().equals("")){
                    checkbox4.setVisibility(View.INVISIBLE);
                    imagebutton4.setVisibility(View.INVISIBLE);
                }
                if (label5.getText().toString().equals("")){
                    checkbox5.setVisibility(View.INVISIBLE);
                    imagebutton5.setVisibility(View.INVISIBLE);
                }
                if (label6.getText().toString().equals("")){
                    checkbox6.setVisibility(View.INVISIBLE);
                    imagebutton6.setVisibility(View.INVISIBLE);
                }
                if (label7.getText().toString().equals("")){
                    checkbox7.setVisibility(View.INVISIBLE);
                    imagebutton7.setVisibility(View.INVISIBLE);
                }
                if (label8.getText().toString().equals("")){
                    checkbox8.setVisibility(View.INVISIBLE);
                    imagebutton8.setVisibility(View.INVISIBLE);
                }
                if (label9.getText().toString().equals("")){
                    checkbox9.setVisibility(View.INVISIBLE);
                    imagebutton9.setVisibility(View.INVISIBLE);
                }
                if (label10.getText().toString().equals("")){
                    checkbox10.setVisibility(View.INVISIBLE);
                    imagebutton10.setVisibility(View.INVISIBLE);
                }
                if (label11.getText().toString().equals("")){
                    checkbox11.setVisibility(View.INVISIBLE);
                    imagebutton11.setVisibility(View.INVISIBLE);
                }
                if (label12.getText().toString().equals("")){
                    checkbox12.setVisibility(View.INVISIBLE);
                    imagebutton12.setVisibility(View.INVISIBLE);
                }
                if (label13.getText().toString().equals("")){
                    checkbox13.setVisibility(View.INVISIBLE);
                    imagebutton13.setVisibility(View.INVISIBLE);
                }
                if (label14.getText().toString().equals("")){
                    checkbox14.setVisibility(View.INVISIBLE);
                    imagebutton14.setVisibility(View.INVISIBLE);
                }
                if (label15.getText().toString().equals("")){
                    checkbox15.setVisibility(View.INVISIBLE);
                    imagebutton15.setVisibility(View.INVISIBLE);
                }
                if (label16.getText().toString().equals("")){
                    checkbox16.setVisibility(View.INVISIBLE);
                    imagebutton16.setVisibility(View.INVISIBLE);
                }
                if (label17.getText().toString().equals("")){
                    checkbox17.setVisibility(View.INVISIBLE);
                    imagebutton17.setVisibility(View.INVISIBLE);
                }
                if (label18.getText().toString().equals("")){
                    checkbox18.setVisibility(View.INVISIBLE);
                    imagebutton18.setVisibility(View.INVISIBLE);
                }
                if (label19.getText().toString().equals("")){
                    checkbox19.setVisibility(View.INVISIBLE);
                    imagebutton19.setVisibility(View.INVISIBLE);
                }
                if (label20.getText().toString().equals("")){
                    checkbox20.setVisibility(View.INVISIBLE);
                    imagebutton20.setVisibility(View.INVISIBLE);
                }
            }
        });
        imagebutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveClass.CountDown();
                label5.setText(label6.getText());
                label6.setText(label7.getText());
                label7.setText(label8.getText());
                label8.setText(label9.getText());
                label9.setText(label10.getText());
                label10.setText(label11.getText());
                label11.setText(label12.getText());
                label12.setText(label13.getText());
                label13.setText(label14.getText());
                label14.setText(label15.getText());
                label15.setText(label16.getText());
                label16.setText(label17.getText());
                label17.setText(label18.getText());
                label18.setText(label19.getText());
                label19.setText(label20.getText());
                label20.setText("");

                if (label1.getText().toString().equals("")){
                    checkbox1.setVisibility(View.INVISIBLE);
                    imagebutton1.setVisibility(View.INVISIBLE);
                }
                if (label2.getText().toString().equals("")){
                    checkbox2.setVisibility(View.INVISIBLE);
                    imagebutton2.setVisibility(View.INVISIBLE);
                }
                if (label3.getText().toString().equals("")){
                    checkbox3.setVisibility(View.INVISIBLE);
                    imagebutton3.setVisibility(View.INVISIBLE);
                }
                if (label4.getText().toString().equals("")){
                    checkbox4.setVisibility(View.INVISIBLE);
                    imagebutton4.setVisibility(View.INVISIBLE);
                }
                if (label5.getText().toString().equals("")){
                    checkbox5.setVisibility(View.INVISIBLE);
                    imagebutton5.setVisibility(View.INVISIBLE);
                }
                if (label6.getText().toString().equals("")){
                    checkbox6.setVisibility(View.INVISIBLE);
                    imagebutton6.setVisibility(View.INVISIBLE);
                }
                if (label7.getText().toString().equals("")){
                    checkbox7.setVisibility(View.INVISIBLE);
                    imagebutton7.setVisibility(View.INVISIBLE);
                }
                if (label8.getText().toString().equals("")){
                    checkbox8.setVisibility(View.INVISIBLE);
                    imagebutton8.setVisibility(View.INVISIBLE);
                }
                if (label9.getText().toString().equals("")){
                    checkbox9.setVisibility(View.INVISIBLE);
                    imagebutton9.setVisibility(View.INVISIBLE);
                }
                if (label10.getText().toString().equals("")){
                    checkbox10.setVisibility(View.INVISIBLE);
                    imagebutton10.setVisibility(View.INVISIBLE);
                }
                if (label11.getText().toString().equals("")){
                    checkbox11.setVisibility(View.INVISIBLE);
                    imagebutton11.setVisibility(View.INVISIBLE);
                }
                if (label12.getText().toString().equals("")){
                    checkbox12.setVisibility(View.INVISIBLE);
                    imagebutton12.setVisibility(View.INVISIBLE);
                }
                if (label13.getText().toString().equals("")){
                    checkbox13.setVisibility(View.INVISIBLE);
                    imagebutton13.setVisibility(View.INVISIBLE);
                }
                if (label14.getText().toString().equals("")){
                    checkbox14.setVisibility(View.INVISIBLE);
                    imagebutton14.setVisibility(View.INVISIBLE);
                }
                if (label15.getText().toString().equals("")){
                    checkbox15.setVisibility(View.INVISIBLE);
                    imagebutton15.setVisibility(View.INVISIBLE);
                }
                if (label16.getText().toString().equals("")){
                    checkbox16.setVisibility(View.INVISIBLE);
                    imagebutton16.setVisibility(View.INVISIBLE);
                }
                if (label17.getText().toString().equals("")){
                    checkbox17.setVisibility(View.INVISIBLE);
                    imagebutton17.setVisibility(View.INVISIBLE);
                }
                if (label18.getText().toString().equals("")){
                    checkbox18.setVisibility(View.INVISIBLE);
                    imagebutton18.setVisibility(View.INVISIBLE);
                }
                if (label19.getText().toString().equals("")){
                    checkbox19.setVisibility(View.INVISIBLE);
                    imagebutton19.setVisibility(View.INVISIBLE);
                }
                if (label20.getText().toString().equals("")){
                    checkbox20.setVisibility(View.INVISIBLE);
                    imagebutton20.setVisibility(View.INVISIBLE);
                }
            }
        });
        imagebutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveClass.CountDown();
                label6.setText(label7.getText());
                label7.setText(label8.getText());
                label8.setText(label9.getText());
                label9.setText(label10.getText());
                label10.setText(label11.getText());
                label11.setText(label12.getText());
                label12.setText(label13.getText());
                label13.setText(label14.getText());
                label14.setText(label15.getText());
                label15.setText(label16.getText());
                label16.setText(label17.getText());
                label17.setText(label18.getText());
                label18.setText(label19.getText());
                label19.setText(label20.getText());
                label20.setText("");

                if (label1.getText().toString().equals("")){
                    checkbox1.setVisibility(View.INVISIBLE);
                    imagebutton1.setVisibility(View.INVISIBLE);
                }
                if (label2.getText().toString().equals("")){
                    checkbox2.setVisibility(View.INVISIBLE);
                    imagebutton2.setVisibility(View.INVISIBLE);
                }
                if (label3.getText().toString().equals("")){
                    checkbox3.setVisibility(View.INVISIBLE);
                    imagebutton3.setVisibility(View.INVISIBLE);
                }
                if (label4.getText().toString().equals("")){
                    checkbox4.setVisibility(View.INVISIBLE);
                    imagebutton4.setVisibility(View.INVISIBLE);
                }
                if (label5.getText().toString().equals("")){
                    checkbox5.setVisibility(View.INVISIBLE);
                    imagebutton5.setVisibility(View.INVISIBLE);
                }
                if (label6.getText().toString().equals("")){
                    checkbox6.setVisibility(View.INVISIBLE);
                    imagebutton6.setVisibility(View.INVISIBLE);
                }
                if (label7.getText().toString().equals("")){
                    checkbox7.setVisibility(View.INVISIBLE);
                    imagebutton7.setVisibility(View.INVISIBLE);
                }
                if (label8.getText().toString().equals("")){
                    checkbox8.setVisibility(View.INVISIBLE);
                    imagebutton8.setVisibility(View.INVISIBLE);
                }
                if (label9.getText().toString().equals("")){
                    checkbox9.setVisibility(View.INVISIBLE);
                    imagebutton9.setVisibility(View.INVISIBLE);
                }
                if (label10.getText().toString().equals("")){
                    checkbox10.setVisibility(View.INVISIBLE);
                    imagebutton10.setVisibility(View.INVISIBLE);
                }
                if (label11.getText().toString().equals("")){
                    checkbox11.setVisibility(View.INVISIBLE);
                    imagebutton11.setVisibility(View.INVISIBLE);
                }
                if (label12.getText().toString().equals("")){
                    checkbox12.setVisibility(View.INVISIBLE);
                    imagebutton12.setVisibility(View.INVISIBLE);
                }
                if (label13.getText().toString().equals("")){
                    checkbox13.setVisibility(View.INVISIBLE);
                    imagebutton13.setVisibility(View.INVISIBLE);
                }
                if (label14.getText().toString().equals("")){
                    checkbox14.setVisibility(View.INVISIBLE);
                    imagebutton14.setVisibility(View.INVISIBLE);
                }
                if (label15.getText().toString().equals("")){
                    checkbox15.setVisibility(View.INVISIBLE);
                    imagebutton15.setVisibility(View.INVISIBLE);
                }
                if (label16.getText().toString().equals("")){
                    checkbox16.setVisibility(View.INVISIBLE);
                    imagebutton16.setVisibility(View.INVISIBLE);
                }
                if (label17.getText().toString().equals("")){
                    checkbox17.setVisibility(View.INVISIBLE);
                    imagebutton17.setVisibility(View.INVISIBLE);
                }
                if (label18.getText().toString().equals("")){
                    checkbox18.setVisibility(View.INVISIBLE);
                    imagebutton18.setVisibility(View.INVISIBLE);
                }
                if (label19.getText().toString().equals("")){
                    checkbox19.setVisibility(View.INVISIBLE);
                    imagebutton19.setVisibility(View.INVISIBLE);
                }
                if (label20.getText().toString().equals("")){
                    checkbox20.setVisibility(View.INVISIBLE);
                    imagebutton20.setVisibility(View.INVISIBLE);
                }
            }
        });
        imagebutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveClass.CountDown();
                label7.setText(label8.getText());
                label8.setText(label9.getText());
                label9.setText(label10.getText());
                label10.setText(label11.getText());
                label11.setText(label12.getText());
                label12.setText(label13.getText());
                label13.setText(label14.getText());
                label14.setText(label15.getText());
                label15.setText(label16.getText());
                label16.setText(label17.getText());
                label17.setText(label18.getText());
                label18.setText(label19.getText());
                label19.setText(label20.getText());
                label20.setText("");

                if (label1.getText().toString().equals("")){
                    checkbox1.setVisibility(View.INVISIBLE);
                    imagebutton1.setVisibility(View.INVISIBLE);
                }
                if (label2.getText().toString().equals("")){
                    checkbox2.setVisibility(View.INVISIBLE);
                    imagebutton2.setVisibility(View.INVISIBLE);
                }
                if (label3.getText().toString().equals("")){
                    checkbox3.setVisibility(View.INVISIBLE);
                    imagebutton3.setVisibility(View.INVISIBLE);
                }
                if (label4.getText().toString().equals("")){
                    checkbox4.setVisibility(View.INVISIBLE);
                    imagebutton4.setVisibility(View.INVISIBLE);
                }
                if (label5.getText().toString().equals("")){
                    checkbox5.setVisibility(View.INVISIBLE);
                    imagebutton5.setVisibility(View.INVISIBLE);
                }
                if (label6.getText().toString().equals("")){
                    checkbox6.setVisibility(View.INVISIBLE);
                    imagebutton6.setVisibility(View.INVISIBLE);
                }
                if (label7.getText().toString().equals("")){
                    checkbox7.setVisibility(View.INVISIBLE);
                    imagebutton7.setVisibility(View.INVISIBLE);
                }
                if (label8.getText().toString().equals("")){
                    checkbox8.setVisibility(View.INVISIBLE);
                    imagebutton8.setVisibility(View.INVISIBLE);
                }
                if (label9.getText().toString().equals("")){
                    checkbox9.setVisibility(View.INVISIBLE);
                    imagebutton9.setVisibility(View.INVISIBLE);
                }
                if (label10.getText().toString().equals("")){
                    checkbox10.setVisibility(View.INVISIBLE);
                    imagebutton10.setVisibility(View.INVISIBLE);
                }
                if (label11.getText().toString().equals("")){
                    checkbox11.setVisibility(View.INVISIBLE);
                    imagebutton11.setVisibility(View.INVISIBLE);
                }
                if (label12.getText().toString().equals("")){
                    checkbox12.setVisibility(View.INVISIBLE);
                    imagebutton12.setVisibility(View.INVISIBLE);
                }
                if (label13.getText().toString().equals("")){
                    checkbox13.setVisibility(View.INVISIBLE);
                    imagebutton13.setVisibility(View.INVISIBLE);
                }
                if (label14.getText().toString().equals("")){
                    checkbox14.setVisibility(View.INVISIBLE);
                    imagebutton14.setVisibility(View.INVISIBLE);
                }
                if (label15.getText().toString().equals("")){
                    checkbox15.setVisibility(View.INVISIBLE);
                    imagebutton15.setVisibility(View.INVISIBLE);
                }
                if (label16.getText().toString().equals("")){
                    checkbox16.setVisibility(View.INVISIBLE);
                    imagebutton16.setVisibility(View.INVISIBLE);
                }
                if (label17.getText().toString().equals("")){
                    checkbox17.setVisibility(View.INVISIBLE);
                    imagebutton17.setVisibility(View.INVISIBLE);
                }
                if (label18.getText().toString().equals("")){
                    checkbox18.setVisibility(View.INVISIBLE);
                    imagebutton18.setVisibility(View.INVISIBLE);
                }
                if (label19.getText().toString().equals("")){
                    checkbox19.setVisibility(View.INVISIBLE);
                    imagebutton19.setVisibility(View.INVISIBLE);
                }
                if (label20.getText().toString().equals("")){
                    checkbox20.setVisibility(View.INVISIBLE);
                    imagebutton20.setVisibility(View.INVISIBLE);
                }
            }
        });
        imagebutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveClass.CountDown();
                label8.setText(label9.getText());
                label9.setText(label10.getText());
                label10.setText(label11.getText());
                label11.setText(label12.getText());
                label12.setText(label13.getText());
                label13.setText(label14.getText());
                label14.setText(label15.getText());
                label15.setText(label16.getText());
                label16.setText(label17.getText());
                label17.setText(label18.getText());
                label18.setText(label19.getText());
                label19.setText(label20.getText());
                label20.setText("");

                if (label1.getText().toString().equals("")){
                    checkbox1.setVisibility(View.INVISIBLE);
                    imagebutton1.setVisibility(View.INVISIBLE);
                }
                if (label2.getText().toString().equals("")){
                    checkbox2.setVisibility(View.INVISIBLE);
                    imagebutton2.setVisibility(View.INVISIBLE);
                }
                if (label3.getText().toString().equals("")){
                    checkbox3.setVisibility(View.INVISIBLE);
                    imagebutton3.setVisibility(View.INVISIBLE);
                }
                if (label4.getText().toString().equals("")){
                    checkbox4.setVisibility(View.INVISIBLE);
                    imagebutton4.setVisibility(View.INVISIBLE);
                }
                if (label5.getText().toString().equals("")){
                    checkbox5.setVisibility(View.INVISIBLE);
                    imagebutton5.setVisibility(View.INVISIBLE);
                }
                if (label6.getText().toString().equals("")){
                    checkbox6.setVisibility(View.INVISIBLE);
                    imagebutton6.setVisibility(View.INVISIBLE);
                }
                if (label7.getText().toString().equals("")){
                    checkbox7.setVisibility(View.INVISIBLE);
                    imagebutton7.setVisibility(View.INVISIBLE);
                }
                if (label8.getText().toString().equals("")){
                    checkbox8.setVisibility(View.INVISIBLE);
                    imagebutton8.setVisibility(View.INVISIBLE);
                }
                if (label9.getText().toString().equals("")){
                    checkbox9.setVisibility(View.INVISIBLE);
                    imagebutton9.setVisibility(View.INVISIBLE);
                }
                if (label10.getText().toString().equals("")){
                    checkbox10.setVisibility(View.INVISIBLE);
                    imagebutton10.setVisibility(View.INVISIBLE);
                }
                if (label11.getText().toString().equals("")){
                    checkbox11.setVisibility(View.INVISIBLE);
                    imagebutton11.setVisibility(View.INVISIBLE);
                }
                if (label12.getText().toString().equals("")){
                    checkbox12.setVisibility(View.INVISIBLE);
                    imagebutton12.setVisibility(View.INVISIBLE);
                }
                if (label13.getText().toString().equals("")){
                    checkbox13.setVisibility(View.INVISIBLE);
                    imagebutton13.setVisibility(View.INVISIBLE);
                }
                if (label14.getText().toString().equals("")){
                    checkbox14.setVisibility(View.INVISIBLE);
                    imagebutton14.setVisibility(View.INVISIBLE);
                }
                if (label15.getText().toString().equals("")){
                    checkbox15.setVisibility(View.INVISIBLE);
                    imagebutton15.setVisibility(View.INVISIBLE);
                }
                if (label16.getText().toString().equals("")){
                    checkbox16.setVisibility(View.INVISIBLE);
                    imagebutton16.setVisibility(View.INVISIBLE);
                }
                if (label17.getText().toString().equals("")){
                    checkbox17.setVisibility(View.INVISIBLE);
                    imagebutton17.setVisibility(View.INVISIBLE);
                }
                if (label18.getText().toString().equals("")){
                    checkbox18.setVisibility(View.INVISIBLE);
                    imagebutton18.setVisibility(View.INVISIBLE);
                }
                if (label19.getText().toString().equals("")){
                    checkbox19.setVisibility(View.INVISIBLE);
                    imagebutton19.setVisibility(View.INVISIBLE);
                }
                if (label20.getText().toString().equals("")){
                    checkbox20.setVisibility(View.INVISIBLE);
                    imagebutton20.setVisibility(View.INVISIBLE);
                }
            }
        });
        imagebutton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveClass.CountDown();
                label9.setText(label10.getText());
                label10.setText(label11.getText());
                label11.setText(label12.getText());
                label12.setText(label13.getText());
                label13.setText(label14.getText());
                label14.setText(label15.getText());
                label15.setText(label16.getText());
                label16.setText(label17.getText());
                label17.setText(label18.getText());
                label18.setText(label19.getText());
                label19.setText(label20.getText());
                label20.setText("");

                if (label1.getText().toString().equals("")){
                    checkbox1.setVisibility(View.INVISIBLE);
                    imagebutton1.setVisibility(View.INVISIBLE);
                }
                if (label2.getText().toString().equals("")){
                    checkbox2.setVisibility(View.INVISIBLE);
                    imagebutton2.setVisibility(View.INVISIBLE);
                }
                if (label3.getText().toString().equals("")){
                    checkbox3.setVisibility(View.INVISIBLE);
                    imagebutton3.setVisibility(View.INVISIBLE);
                }
                if (label4.getText().toString().equals("")){
                    checkbox4.setVisibility(View.INVISIBLE);
                    imagebutton4.setVisibility(View.INVISIBLE);
                }
                if (label5.getText().toString().equals("")){
                    checkbox5.setVisibility(View.INVISIBLE);
                    imagebutton5.setVisibility(View.INVISIBLE);
                }
                if (label6.getText().toString().equals("")){
                    checkbox6.setVisibility(View.INVISIBLE);
                    imagebutton6.setVisibility(View.INVISIBLE);
                }
                if (label7.getText().toString().equals("")){
                    checkbox7.setVisibility(View.INVISIBLE);
                    imagebutton7.setVisibility(View.INVISIBLE);
                }
                if (label8.getText().toString().equals("")){
                    checkbox8.setVisibility(View.INVISIBLE);
                    imagebutton8.setVisibility(View.INVISIBLE);
                }
                if (label9.getText().toString().equals("")){
                    checkbox9.setVisibility(View.INVISIBLE);
                    imagebutton9.setVisibility(View.INVISIBLE);
                }
                if (label10.getText().toString().equals("")){
                    checkbox10.setVisibility(View.INVISIBLE);
                    imagebutton10.setVisibility(View.INVISIBLE);
                }
                if (label11.getText().toString().equals("")){
                    checkbox11.setVisibility(View.INVISIBLE);
                    imagebutton11.setVisibility(View.INVISIBLE);
                }
                if (label12.getText().toString().equals("")){
                    checkbox12.setVisibility(View.INVISIBLE);
                    imagebutton12.setVisibility(View.INVISIBLE);
                }
                if (label13.getText().toString().equals("")){
                    checkbox13.setVisibility(View.INVISIBLE);
                    imagebutton13.setVisibility(View.INVISIBLE);
                }
                if (label14.getText().toString().equals("")){
                    checkbox14.setVisibility(View.INVISIBLE);
                    imagebutton14.setVisibility(View.INVISIBLE);
                }
                if (label15.getText().toString().equals("")){
                    checkbox15.setVisibility(View.INVISIBLE);
                    imagebutton15.setVisibility(View.INVISIBLE);
                }
                if (label16.getText().toString().equals("")){
                    checkbox16.setVisibility(View.INVISIBLE);
                    imagebutton16.setVisibility(View.INVISIBLE);
                }
                if (label17.getText().toString().equals("")){
                    checkbox17.setVisibility(View.INVISIBLE);
                    imagebutton17.setVisibility(View.INVISIBLE);
                }
                if (label18.getText().toString().equals("")){
                    checkbox18.setVisibility(View.INVISIBLE);
                    imagebutton18.setVisibility(View.INVISIBLE);
                }
                if (label19.getText().toString().equals("")){
                    checkbox19.setVisibility(View.INVISIBLE);
                    imagebutton19.setVisibility(View.INVISIBLE);
                }
                if (label20.getText().toString().equals("")){
                    checkbox20.setVisibility(View.INVISIBLE);
                    imagebutton20.setVisibility(View.INVISIBLE);
                }
            }
        });
        imagebutton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveClass.CountDown();
                label10.setText(label11.getText());
                label11.setText(label12.getText());
                label12.setText(label13.getText());
                label13.setText(label14.getText());
                label14.setText(label15.getText());
                label15.setText(label16.getText());
                label16.setText(label17.getText());
                label17.setText(label18.getText());
                label18.setText(label19.getText());
                label19.setText(label20.getText());
                label20.setText("");

                if (label1.getText().toString().equals("")){
                    checkbox1.setVisibility(View.INVISIBLE);
                    imagebutton1.setVisibility(View.INVISIBLE);
                }
                if (label2.getText().toString().equals("")){
                    checkbox2.setVisibility(View.INVISIBLE);
                    imagebutton2.setVisibility(View.INVISIBLE);
                }
                if (label3.getText().toString().equals("")){
                    checkbox3.setVisibility(View.INVISIBLE);
                    imagebutton3.setVisibility(View.INVISIBLE);
                }
                if (label4.getText().toString().equals("")){
                    checkbox4.setVisibility(View.INVISIBLE);
                    imagebutton4.setVisibility(View.INVISIBLE);
                }
                if (label5.getText().toString().equals("")){
                    checkbox5.setVisibility(View.INVISIBLE);
                    imagebutton5.setVisibility(View.INVISIBLE);
                }
                if (label6.getText().toString().equals("")){
                    checkbox6.setVisibility(View.INVISIBLE);
                    imagebutton6.setVisibility(View.INVISIBLE);
                }
                if (label7.getText().toString().equals("")){
                    checkbox7.setVisibility(View.INVISIBLE);
                    imagebutton7.setVisibility(View.INVISIBLE);
                }
                if (label8.getText().toString().equals("")){
                    checkbox8.setVisibility(View.INVISIBLE);
                    imagebutton8.setVisibility(View.INVISIBLE);
                }
                if (label9.getText().toString().equals("")){
                    checkbox9.setVisibility(View.INVISIBLE);
                    imagebutton9.setVisibility(View.INVISIBLE);
                }
                if (label10.getText().toString().equals("")){
                    checkbox10.setVisibility(View.INVISIBLE);
                    imagebutton10.setVisibility(View.INVISIBLE);
                }
                if (label11.getText().toString().equals("")){
                    checkbox11.setVisibility(View.INVISIBLE);
                    imagebutton11.setVisibility(View.INVISIBLE);
                }
                if (label12.getText().toString().equals("")){
                    checkbox12.setVisibility(View.INVISIBLE);
                    imagebutton12.setVisibility(View.INVISIBLE);
                }
                if (label13.getText().toString().equals("")){
                    checkbox13.setVisibility(View.INVISIBLE);
                    imagebutton13.setVisibility(View.INVISIBLE);
                }
                if (label14.getText().toString().equals("")){
                    checkbox14.setVisibility(View.INVISIBLE);
                    imagebutton14.setVisibility(View.INVISIBLE);
                }
                if (label15.getText().toString().equals("")){
                    checkbox15.setVisibility(View.INVISIBLE);
                    imagebutton15.setVisibility(View.INVISIBLE);
                }
                if (label16.getText().toString().equals("")){
                    checkbox16.setVisibility(View.INVISIBLE);
                    imagebutton16.setVisibility(View.INVISIBLE);
                }
                if (label17.getText().toString().equals("")){
                    checkbox17.setVisibility(View.INVISIBLE);
                    imagebutton17.setVisibility(View.INVISIBLE);
                }
                if (label18.getText().toString().equals("")){
                    checkbox18.setVisibility(View.INVISIBLE);
                    imagebutton18.setVisibility(View.INVISIBLE);
                }
                if (label19.getText().toString().equals("")){
                    checkbox19.setVisibility(View.INVISIBLE);
                    imagebutton19.setVisibility(View.INVISIBLE);
                }
                if (label20.getText().toString().equals("")){
                    checkbox20.setVisibility(View.INVISIBLE);
                    imagebutton20.setVisibility(View.INVISIBLE);
                }
            }
        });
        imagebutton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveClass.CountDown();
                label11.setText(label12.getText());
                label12.setText(label13.getText());
                label13.setText(label14.getText());
                label14.setText(label15.getText());
                label15.setText(label16.getText());
                label16.setText(label17.getText());
                label17.setText(label18.getText());
                label18.setText(label19.getText());
                label19.setText(label20.getText());
                label20.setText("");

                if (label1.getText().toString().equals("")){
                    checkbox1.setVisibility(View.INVISIBLE);
                    imagebutton1.setVisibility(View.INVISIBLE);
                }
                if (label2.getText().toString().equals("")){
                    checkbox2.setVisibility(View.INVISIBLE);
                    imagebutton2.setVisibility(View.INVISIBLE);
                }
                if (label3.getText().toString().equals("")){
                    checkbox3.setVisibility(View.INVISIBLE);
                    imagebutton3.setVisibility(View.INVISIBLE);
                }
                if (label4.getText().toString().equals("")){
                    checkbox4.setVisibility(View.INVISIBLE);
                    imagebutton4.setVisibility(View.INVISIBLE);
                }
                if (label5.getText().toString().equals("")){
                    checkbox5.setVisibility(View.INVISIBLE);
                    imagebutton5.setVisibility(View.INVISIBLE);
                }
                if (label6.getText().toString().equals("")){
                    checkbox6.setVisibility(View.INVISIBLE);
                    imagebutton6.setVisibility(View.INVISIBLE);
                }
                if (label7.getText().toString().equals("")){
                    checkbox7.setVisibility(View.INVISIBLE);
                    imagebutton7.setVisibility(View.INVISIBLE);
                }
                if (label8.getText().toString().equals("")){
                    checkbox8.setVisibility(View.INVISIBLE);
                    imagebutton8.setVisibility(View.INVISIBLE);
                }
                if (label9.getText().toString().equals("")){
                    checkbox9.setVisibility(View.INVISIBLE);
                    imagebutton9.setVisibility(View.INVISIBLE);
                }
                if (label10.getText().toString().equals("")){
                    checkbox10.setVisibility(View.INVISIBLE);
                    imagebutton10.setVisibility(View.INVISIBLE);
                }
                if (label11.getText().toString().equals("")){
                    checkbox11.setVisibility(View.INVISIBLE);
                    imagebutton11.setVisibility(View.INVISIBLE);
                }
                if (label12.getText().toString().equals("")){
                    checkbox12.setVisibility(View.INVISIBLE);
                    imagebutton12.setVisibility(View.INVISIBLE);
                }
                if (label13.getText().toString().equals("")){
                    checkbox13.setVisibility(View.INVISIBLE);
                    imagebutton13.setVisibility(View.INVISIBLE);
                }
                if (label14.getText().toString().equals("")){
                    checkbox14.setVisibility(View.INVISIBLE);
                    imagebutton14.setVisibility(View.INVISIBLE);
                }
                if (label15.getText().toString().equals("")){
                    checkbox15.setVisibility(View.INVISIBLE);
                    imagebutton15.setVisibility(View.INVISIBLE);
                }
                if (label16.getText().toString().equals("")){
                    checkbox16.setVisibility(View.INVISIBLE);
                    imagebutton16.setVisibility(View.INVISIBLE);
                }
                if (label17.getText().toString().equals("")){
                    checkbox17.setVisibility(View.INVISIBLE);
                    imagebutton17.setVisibility(View.INVISIBLE);
                }
                if (label18.getText().toString().equals("")){
                    checkbox18.setVisibility(View.INVISIBLE);
                    imagebutton18.setVisibility(View.INVISIBLE);
                }
                if (label19.getText().toString().equals("")){
                    checkbox19.setVisibility(View.INVISIBLE);
                    imagebutton19.setVisibility(View.INVISIBLE);
                }
                if (label20.getText().toString().equals("")){
                    checkbox20.setVisibility(View.INVISIBLE);
                    imagebutton20.setVisibility(View.INVISIBLE);
                }
            }
        });
        imagebutton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveClass.CountDown();
                label12.setText(label13.getText());
                label13.setText(label14.getText());
                label14.setText(label15.getText());
                label15.setText(label16.getText());
                label16.setText(label17.getText());
                label17.setText(label18.getText());
                label18.setText(label19.getText());
                label19.setText(label20.getText());
                label20.setText("");

                if (label1.getText().toString().equals("")){
                    checkbox1.setVisibility(View.INVISIBLE);
                    imagebutton1.setVisibility(View.INVISIBLE);
                }
                if (label2.getText().toString().equals("")){
                    checkbox2.setVisibility(View.INVISIBLE);
                    imagebutton2.setVisibility(View.INVISIBLE);
                }
                if (label3.getText().toString().equals("")){
                    checkbox3.setVisibility(View.INVISIBLE);
                    imagebutton3.setVisibility(View.INVISIBLE);
                }
                if (label4.getText().toString().equals("")){
                    checkbox4.setVisibility(View.INVISIBLE);
                    imagebutton4.setVisibility(View.INVISIBLE);
                }
                if (label5.getText().toString().equals("")){
                    checkbox5.setVisibility(View.INVISIBLE);
                    imagebutton5.setVisibility(View.INVISIBLE);
                }
                if (label6.getText().toString().equals("")){
                    checkbox6.setVisibility(View.INVISIBLE);
                    imagebutton6.setVisibility(View.INVISIBLE);
                }
                if (label7.getText().toString().equals("")){
                    checkbox7.setVisibility(View.INVISIBLE);
                    imagebutton7.setVisibility(View.INVISIBLE);
                }
                if (label8.getText().toString().equals("")){
                    checkbox8.setVisibility(View.INVISIBLE);
                    imagebutton8.setVisibility(View.INVISIBLE);
                }
                if (label9.getText().toString().equals("")){
                    checkbox9.setVisibility(View.INVISIBLE);
                    imagebutton9.setVisibility(View.INVISIBLE);
                }
                if (label10.getText().toString().equals("")){
                    checkbox10.setVisibility(View.INVISIBLE);
                    imagebutton10.setVisibility(View.INVISIBLE);
                }
                if (label11.getText().toString().equals("")){
                    checkbox11.setVisibility(View.INVISIBLE);
                    imagebutton11.setVisibility(View.INVISIBLE);
                }
                if (label12.getText().toString().equals("")){
                    checkbox12.setVisibility(View.INVISIBLE);
                    imagebutton12.setVisibility(View.INVISIBLE);
                }
                if (label13.getText().toString().equals("")){
                    checkbox13.setVisibility(View.INVISIBLE);
                    imagebutton13.setVisibility(View.INVISIBLE);
                }
                if (label14.getText().toString().equals("")){
                    checkbox14.setVisibility(View.INVISIBLE);
                    imagebutton14.setVisibility(View.INVISIBLE);
                }
                if (label15.getText().toString().equals("")){
                    checkbox15.setVisibility(View.INVISIBLE);
                    imagebutton15.setVisibility(View.INVISIBLE);
                }
                if (label16.getText().toString().equals("")){
                    checkbox16.setVisibility(View.INVISIBLE);
                    imagebutton16.setVisibility(View.INVISIBLE);
                }
                if (label17.getText().toString().equals("")){
                    checkbox17.setVisibility(View.INVISIBLE);
                    imagebutton17.setVisibility(View.INVISIBLE);
                }
                if (label18.getText().toString().equals("")){
                    checkbox18.setVisibility(View.INVISIBLE);
                    imagebutton18.setVisibility(View.INVISIBLE);
                }
                if (label19.getText().toString().equals("")){
                    checkbox19.setVisibility(View.INVISIBLE);
                    imagebutton19.setVisibility(View.INVISIBLE);
                }
                if (label20.getText().toString().equals("")){
                    checkbox20.setVisibility(View.INVISIBLE);
                    imagebutton20.setVisibility(View.INVISIBLE);
                }
            }
        });
        imagebutton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveClass.CountDown();
                label13.setText(label14.getText());
                label14.setText(label15.getText());
                label15.setText(label16.getText());
                label16.setText(label17.getText());
                label17.setText(label18.getText());
                label18.setText(label19.getText());
                label19.setText(label20.getText());
                label20.setText("");

                if (label1.getText().toString().equals("")){
                    checkbox1.setVisibility(View.INVISIBLE);
                    imagebutton1.setVisibility(View.INVISIBLE);
                }
                if (label2.getText().toString().equals("")){
                    checkbox2.setVisibility(View.INVISIBLE);
                    imagebutton2.setVisibility(View.INVISIBLE);
                }
                if (label3.getText().toString().equals("")){
                    checkbox3.setVisibility(View.INVISIBLE);
                    imagebutton3.setVisibility(View.INVISIBLE);
                }
                if (label4.getText().toString().equals("")){
                    checkbox4.setVisibility(View.INVISIBLE);
                    imagebutton4.setVisibility(View.INVISIBLE);
                }
                if (label5.getText().toString().equals("")){
                    checkbox5.setVisibility(View.INVISIBLE);
                    imagebutton5.setVisibility(View.INVISIBLE);
                }
                if (label6.getText().toString().equals("")){
                    checkbox6.setVisibility(View.INVISIBLE);
                    imagebutton6.setVisibility(View.INVISIBLE);
                }
                if (label7.getText().toString().equals("")){
                    checkbox7.setVisibility(View.INVISIBLE);
                    imagebutton7.setVisibility(View.INVISIBLE);
                }
                if (label8.getText().toString().equals("")){
                    checkbox8.setVisibility(View.INVISIBLE);
                    imagebutton8.setVisibility(View.INVISIBLE);
                }
                if (label9.getText().toString().equals("")){
                    checkbox9.setVisibility(View.INVISIBLE);
                    imagebutton9.setVisibility(View.INVISIBLE);
                }
                if (label10.getText().toString().equals("")){
                    checkbox10.setVisibility(View.INVISIBLE);
                    imagebutton10.setVisibility(View.INVISIBLE);
                }
                if (label11.getText().toString().equals("")){
                    checkbox11.setVisibility(View.INVISIBLE);
                    imagebutton11.setVisibility(View.INVISIBLE);
                }
                if (label12.getText().toString().equals("")){
                    checkbox12.setVisibility(View.INVISIBLE);
                    imagebutton12.setVisibility(View.INVISIBLE);
                }
                if (label13.getText().toString().equals("")){
                    checkbox13.setVisibility(View.INVISIBLE);
                    imagebutton13.setVisibility(View.INVISIBLE);
                }
                if (label14.getText().toString().equals("")){
                    checkbox14.setVisibility(View.INVISIBLE);
                    imagebutton14.setVisibility(View.INVISIBLE);
                }
                if (label15.getText().toString().equals("")){
                    checkbox15.setVisibility(View.INVISIBLE);
                    imagebutton15.setVisibility(View.INVISIBLE);
                }
                if (label16.getText().toString().equals("")){
                    checkbox16.setVisibility(View.INVISIBLE);
                    imagebutton16.setVisibility(View.INVISIBLE);
                }
                if (label17.getText().toString().equals("")){
                    checkbox17.setVisibility(View.INVISIBLE);
                    imagebutton17.setVisibility(View.INVISIBLE);
                }
                if (label18.getText().toString().equals("")){
                    checkbox18.setVisibility(View.INVISIBLE);
                    imagebutton18.setVisibility(View.INVISIBLE);
                }
                if (label19.getText().toString().equals("")){
                    checkbox19.setVisibility(View.INVISIBLE);
                    imagebutton19.setVisibility(View.INVISIBLE);
                }
                if (label20.getText().toString().equals("")){
                    checkbox20.setVisibility(View.INVISIBLE);
                    imagebutton20.setVisibility(View.INVISIBLE);
                }
            }
        });
        imagebutton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveClass.CountDown();
                label14.setText(label15.getText());
                label15.setText(label16.getText());
                label16.setText(label17.getText());
                label17.setText(label18.getText());
                label18.setText(label19.getText());
                label19.setText(label20.getText());
                label20.setText("");

                if (label1.getText().toString().equals("")){
                    checkbox1.setVisibility(View.INVISIBLE);
                    imagebutton1.setVisibility(View.INVISIBLE);
                }
                if (label2.getText().toString().equals("")){
                    checkbox2.setVisibility(View.INVISIBLE);
                    imagebutton2.setVisibility(View.INVISIBLE);
                }
                if (label3.getText().toString().equals("")){
                    checkbox3.setVisibility(View.INVISIBLE);
                    imagebutton3.setVisibility(View.INVISIBLE);
                }
                if (label4.getText().toString().equals("")){
                    checkbox4.setVisibility(View.INVISIBLE);
                    imagebutton4.setVisibility(View.INVISIBLE);
                }
                if (label5.getText().toString().equals("")){
                    checkbox5.setVisibility(View.INVISIBLE);
                    imagebutton5.setVisibility(View.INVISIBLE);
                }
                if (label6.getText().toString().equals("")){
                    checkbox6.setVisibility(View.INVISIBLE);
                    imagebutton6.setVisibility(View.INVISIBLE);
                }
                if (label7.getText().toString().equals("")){
                    checkbox7.setVisibility(View.INVISIBLE);
                    imagebutton7.setVisibility(View.INVISIBLE);
                }
                if (label8.getText().toString().equals("")){
                    checkbox8.setVisibility(View.INVISIBLE);
                    imagebutton8.setVisibility(View.INVISIBLE);
                }
                if (label9.getText().toString().equals("")){
                    checkbox9.setVisibility(View.INVISIBLE);
                    imagebutton9.setVisibility(View.INVISIBLE);
                }
                if (label10.getText().toString().equals("")){
                    checkbox10.setVisibility(View.INVISIBLE);
                    imagebutton10.setVisibility(View.INVISIBLE);
                }
                if (label11.getText().toString().equals("")){
                    checkbox11.setVisibility(View.INVISIBLE);
                    imagebutton11.setVisibility(View.INVISIBLE);
                }
                if (label12.getText().toString().equals("")){
                    checkbox12.setVisibility(View.INVISIBLE);
                    imagebutton12.setVisibility(View.INVISIBLE);
                }
                if (label13.getText().toString().equals("")){
                    checkbox13.setVisibility(View.INVISIBLE);
                    imagebutton13.setVisibility(View.INVISIBLE);
                }
                if (label14.getText().toString().equals("")){
                    checkbox14.setVisibility(View.INVISIBLE);
                    imagebutton14.setVisibility(View.INVISIBLE);
                }
                if (label15.getText().toString().equals("")){
                    checkbox15.setVisibility(View.INVISIBLE);
                    imagebutton15.setVisibility(View.INVISIBLE);
                }
                if (label16.getText().toString().equals("")){
                    checkbox16.setVisibility(View.INVISIBLE);
                    imagebutton16.setVisibility(View.INVISIBLE);
                }
                if (label17.getText().toString().equals("")){
                    checkbox17.setVisibility(View.INVISIBLE);
                    imagebutton17.setVisibility(View.INVISIBLE);
                }
                if (label18.getText().toString().equals("")){
                    checkbox18.setVisibility(View.INVISIBLE);
                    imagebutton18.setVisibility(View.INVISIBLE);
                }
                if (label19.getText().toString().equals("")){
                    checkbox19.setVisibility(View.INVISIBLE);
                    imagebutton19.setVisibility(View.INVISIBLE);
                }
                if (label20.getText().toString().equals("")){
                    checkbox20.setVisibility(View.INVISIBLE);
                    imagebutton20.setVisibility(View.INVISIBLE);
                }
            }
        });
        imagebutton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveClass.CountDown();
                label15.setText(label16.getText());
                label16.setText(label17.getText());
                label17.setText(label18.getText());
                label18.setText(label19.getText());
                label19.setText(label20.getText());
                label20.setText("");

                if (label1.getText().toString().equals("")){
                    checkbox1.setVisibility(View.INVISIBLE);
                    imagebutton1.setVisibility(View.INVISIBLE);
                }
                if (label2.getText().toString().equals("")){
                    checkbox2.setVisibility(View.INVISIBLE);
                    imagebutton2.setVisibility(View.INVISIBLE);
                }
                if (label3.getText().toString().equals("")){
                    checkbox3.setVisibility(View.INVISIBLE);
                    imagebutton3.setVisibility(View.INVISIBLE);
                }
                if (label4.getText().toString().equals("")){
                    checkbox4.setVisibility(View.INVISIBLE);
                    imagebutton4.setVisibility(View.INVISIBLE);
                }
                if (label5.getText().toString().equals("")){
                    checkbox5.setVisibility(View.INVISIBLE);
                    imagebutton5.setVisibility(View.INVISIBLE);
                }
                if (label6.getText().toString().equals("")){
                    checkbox6.setVisibility(View.INVISIBLE);
                    imagebutton6.setVisibility(View.INVISIBLE);
                }
                if (label7.getText().toString().equals("")){
                    checkbox7.setVisibility(View.INVISIBLE);
                    imagebutton7.setVisibility(View.INVISIBLE);
                }
                if (label8.getText().toString().equals("")){
                    checkbox8.setVisibility(View.INVISIBLE);
                    imagebutton8.setVisibility(View.INVISIBLE);
                }
                if (label9.getText().toString().equals("")){
                    checkbox9.setVisibility(View.INVISIBLE);
                    imagebutton9.setVisibility(View.INVISIBLE);
                }
                if (label10.getText().toString().equals("")){
                    checkbox10.setVisibility(View.INVISIBLE);
                    imagebutton10.setVisibility(View.INVISIBLE);
                }
                if (label11.getText().toString().equals("")){
                    checkbox11.setVisibility(View.INVISIBLE);
                    imagebutton11.setVisibility(View.INVISIBLE);
                }
                if (label12.getText().toString().equals("")){
                    checkbox12.setVisibility(View.INVISIBLE);
                    imagebutton12.setVisibility(View.INVISIBLE);
                }
                if (label13.getText().toString().equals("")){
                    checkbox13.setVisibility(View.INVISIBLE);
                    imagebutton13.setVisibility(View.INVISIBLE);
                }
                if (label14.getText().toString().equals("")){
                    checkbox14.setVisibility(View.INVISIBLE);
                    imagebutton14.setVisibility(View.INVISIBLE);
                }
                if (label15.getText().toString().equals("")){
                    checkbox15.setVisibility(View.INVISIBLE);
                    imagebutton15.setVisibility(View.INVISIBLE);
                }
                if (label16.getText().toString().equals("")){
                    checkbox16.setVisibility(View.INVISIBLE);
                    imagebutton16.setVisibility(View.INVISIBLE);
                }
                if (label17.getText().toString().equals("")){
                    checkbox17.setVisibility(View.INVISIBLE);
                    imagebutton17.setVisibility(View.INVISIBLE);
                }
                if (label18.getText().toString().equals("")){
                    checkbox18.setVisibility(View.INVISIBLE);
                    imagebutton18.setVisibility(View.INVISIBLE);
                }
                if (label19.getText().toString().equals("")){
                    checkbox19.setVisibility(View.INVISIBLE);
                    imagebutton19.setVisibility(View.INVISIBLE);
                }
                if (label20.getText().toString().equals("")){
                    checkbox20.setVisibility(View.INVISIBLE);
                    imagebutton20.setVisibility(View.INVISIBLE);
                }
            }
        });
        imagebutton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveClass.CountDown();
                label16.setText(label17.getText());
                label17.setText(label18.getText());
                label18.setText(label19.getText());
                label19.setText(label20.getText());
                label20.setText("");

                if (label1.getText().toString().equals("")){
                    checkbox1.setVisibility(View.INVISIBLE);
                    imagebutton1.setVisibility(View.INVISIBLE);
                }
                if (label2.getText().toString().equals("")){
                    checkbox2.setVisibility(View.INVISIBLE);
                    imagebutton2.setVisibility(View.INVISIBLE);
                }
                if (label3.getText().toString().equals("")){
                    checkbox3.setVisibility(View.INVISIBLE);
                    imagebutton3.setVisibility(View.INVISIBLE);
                }
                if (label4.getText().toString().equals("")){
                    checkbox4.setVisibility(View.INVISIBLE);
                    imagebutton4.setVisibility(View.INVISIBLE);
                }
                if (label5.getText().toString().equals("")){
                    checkbox5.setVisibility(View.INVISIBLE);
                    imagebutton5.setVisibility(View.INVISIBLE);
                }
                if (label6.getText().toString().equals("")){
                    checkbox6.setVisibility(View.INVISIBLE);
                    imagebutton6.setVisibility(View.INVISIBLE);
                }
                if (label7.getText().toString().equals("")){
                    checkbox7.setVisibility(View.INVISIBLE);
                    imagebutton7.setVisibility(View.INVISIBLE);
                }
                if (label8.getText().toString().equals("")){
                    checkbox8.setVisibility(View.INVISIBLE);
                    imagebutton8.setVisibility(View.INVISIBLE);
                }
                if (label9.getText().toString().equals("")){
                    checkbox9.setVisibility(View.INVISIBLE);
                    imagebutton9.setVisibility(View.INVISIBLE);
                }
                if (label10.getText().toString().equals("")){
                    checkbox10.setVisibility(View.INVISIBLE);
                    imagebutton10.setVisibility(View.INVISIBLE);
                }
                if (label11.getText().toString().equals("")){
                    checkbox11.setVisibility(View.INVISIBLE);
                    imagebutton11.setVisibility(View.INVISIBLE);
                }
                if (label12.getText().toString().equals("")){
                    checkbox12.setVisibility(View.INVISIBLE);
                    imagebutton12.setVisibility(View.INVISIBLE);
                }
                if (label13.getText().toString().equals("")){
                    checkbox13.setVisibility(View.INVISIBLE);
                    imagebutton13.setVisibility(View.INVISIBLE);
                }
                if (label14.getText().toString().equals("")){
                    checkbox14.setVisibility(View.INVISIBLE);
                    imagebutton14.setVisibility(View.INVISIBLE);
                }
                if (label15.getText().toString().equals("")){
                    checkbox15.setVisibility(View.INVISIBLE);
                    imagebutton15.setVisibility(View.INVISIBLE);
                }
                if (label16.getText().toString().equals("")){
                    checkbox16.setVisibility(View.INVISIBLE);
                    imagebutton16.setVisibility(View.INVISIBLE);
                }
                if (label17.getText().toString().equals("")){
                    checkbox17.setVisibility(View.INVISIBLE);
                    imagebutton17.setVisibility(View.INVISIBLE);
                }
                if (label18.getText().toString().equals("")){
                    checkbox18.setVisibility(View.INVISIBLE);
                    imagebutton18.setVisibility(View.INVISIBLE);
                }
                if (label19.getText().toString().equals("")){
                    checkbox19.setVisibility(View.INVISIBLE);
                    imagebutton19.setVisibility(View.INVISIBLE);
                }
                if (label20.getText().toString().equals("")){
                    checkbox20.setVisibility(View.INVISIBLE);
                    imagebutton20.setVisibility(View.INVISIBLE);
                }
            }
        });
        imagebutton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveClass.CountDown();
                label17.setText(label18.getText());
                label18.setText(label19.getText());
                label19.setText(label20.getText());
                label20.setText("");

                if (label1.getText().toString().equals("")){
                    checkbox1.setVisibility(View.INVISIBLE);
                    imagebutton1.setVisibility(View.INVISIBLE);
                }
                if (label2.getText().toString().equals("")){
                    checkbox2.setVisibility(View.INVISIBLE);
                    imagebutton2.setVisibility(View.INVISIBLE);
                }
                if (label3.getText().toString().equals("")){
                    checkbox3.setVisibility(View.INVISIBLE);
                    imagebutton3.setVisibility(View.INVISIBLE);
                }
                if (label4.getText().toString().equals("")){
                    checkbox4.setVisibility(View.INVISIBLE);
                    imagebutton4.setVisibility(View.INVISIBLE);
                }
                if (label5.getText().toString().equals("")){
                    checkbox5.setVisibility(View.INVISIBLE);
                    imagebutton5.setVisibility(View.INVISIBLE);
                }
                if (label6.getText().toString().equals("")){
                    checkbox6.setVisibility(View.INVISIBLE);
                    imagebutton6.setVisibility(View.INVISIBLE);
                }
                if (label7.getText().toString().equals("")){
                    checkbox7.setVisibility(View.INVISIBLE);
                    imagebutton7.setVisibility(View.INVISIBLE);
                }
                if (label8.getText().toString().equals("")){
                    checkbox8.setVisibility(View.INVISIBLE);
                    imagebutton8.setVisibility(View.INVISIBLE);
                }
                if (label9.getText().toString().equals("")){
                    checkbox9.setVisibility(View.INVISIBLE);
                    imagebutton9.setVisibility(View.INVISIBLE);
                }
                if (label10.getText().toString().equals("")){
                    checkbox10.setVisibility(View.INVISIBLE);
                    imagebutton10.setVisibility(View.INVISIBLE);
                }
                if (label11.getText().toString().equals("")){
                    checkbox11.setVisibility(View.INVISIBLE);
                    imagebutton11.setVisibility(View.INVISIBLE);
                }
                if (label12.getText().toString().equals("")){
                    checkbox12.setVisibility(View.INVISIBLE);
                    imagebutton12.setVisibility(View.INVISIBLE);
                }
                if (label13.getText().toString().equals("")){
                    checkbox13.setVisibility(View.INVISIBLE);
                    imagebutton13.setVisibility(View.INVISIBLE);
                }
                if (label14.getText().toString().equals("")){
                    checkbox14.setVisibility(View.INVISIBLE);
                    imagebutton14.setVisibility(View.INVISIBLE);
                }
                if (label15.getText().toString().equals("")){
                    checkbox15.setVisibility(View.INVISIBLE);
                    imagebutton15.setVisibility(View.INVISIBLE);
                }
                if (label16.getText().toString().equals("")){
                    checkbox16.setVisibility(View.INVISIBLE);
                    imagebutton16.setVisibility(View.INVISIBLE);
                }
                if (label17.getText().toString().equals("")){
                    checkbox17.setVisibility(View.INVISIBLE);
                    imagebutton17.setVisibility(View.INVISIBLE);
                }
                if (label18.getText().toString().equals("")){
                    checkbox18.setVisibility(View.INVISIBLE);
                    imagebutton18.setVisibility(View.INVISIBLE);
                }
                if (label19.getText().toString().equals("")){
                    checkbox19.setVisibility(View.INVISIBLE);
                    imagebutton19.setVisibility(View.INVISIBLE);
                }
                if (label20.getText().toString().equals("")){
                    checkbox20.setVisibility(View.INVISIBLE);
                    imagebutton20.setVisibility(View.INVISIBLE);
                }
            }
        });
        imagebutton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveClass.CountDown();
                label18.setText(label19.getText());
                label19.setText(label20.getText());
                label20.setText("");

                if (label1.getText().toString().equals("")){
                    checkbox1.setVisibility(View.INVISIBLE);
                    imagebutton1.setVisibility(View.INVISIBLE);
                }
                if (label2.getText().toString().equals("")){
                    checkbox2.setVisibility(View.INVISIBLE);
                    imagebutton2.setVisibility(View.INVISIBLE);
                }
                if (label3.getText().toString().equals("")){
                    checkbox3.setVisibility(View.INVISIBLE);
                    imagebutton3.setVisibility(View.INVISIBLE);
                }
                if (label4.getText().toString().equals("")){
                    checkbox4.setVisibility(View.INVISIBLE);
                    imagebutton4.setVisibility(View.INVISIBLE);
                }
                if (label5.getText().toString().equals("")){
                    checkbox5.setVisibility(View.INVISIBLE);
                    imagebutton5.setVisibility(View.INVISIBLE);
                }
                if (label6.getText().toString().equals("")){
                    checkbox6.setVisibility(View.INVISIBLE);
                    imagebutton6.setVisibility(View.INVISIBLE);
                }
                if (label7.getText().toString().equals("")){
                    checkbox7.setVisibility(View.INVISIBLE);
                    imagebutton7.setVisibility(View.INVISIBLE);
                }
                if (label8.getText().toString().equals("")){
                    checkbox8.setVisibility(View.INVISIBLE);
                    imagebutton8.setVisibility(View.INVISIBLE);
                }
                if (label9.getText().toString().equals("")){
                    checkbox9.setVisibility(View.INVISIBLE);
                    imagebutton9.setVisibility(View.INVISIBLE);
                }
                if (label10.getText().toString().equals("")){
                    checkbox10.setVisibility(View.INVISIBLE);
                    imagebutton10.setVisibility(View.INVISIBLE);
                }
                if (label11.getText().toString().equals("")){
                    checkbox11.setVisibility(View.INVISIBLE);
                    imagebutton11.setVisibility(View.INVISIBLE);
                }
                if (label12.getText().toString().equals("")){
                    checkbox12.setVisibility(View.INVISIBLE);
                    imagebutton12.setVisibility(View.INVISIBLE);
                }
                if (label13.getText().toString().equals("")){
                    checkbox13.setVisibility(View.INVISIBLE);
                    imagebutton13.setVisibility(View.INVISIBLE);
                }
                if (label14.getText().toString().equals("")){
                    checkbox14.setVisibility(View.INVISIBLE);
                    imagebutton14.setVisibility(View.INVISIBLE);
                }
                if (label15.getText().toString().equals("")){
                    checkbox15.setVisibility(View.INVISIBLE);
                    imagebutton15.setVisibility(View.INVISIBLE);
                }
                if (label16.getText().toString().equals("")){
                    checkbox16.setVisibility(View.INVISIBLE);
                    imagebutton16.setVisibility(View.INVISIBLE);
                }
                if (label17.getText().toString().equals("")){
                    checkbox17.setVisibility(View.INVISIBLE);
                    imagebutton17.setVisibility(View.INVISIBLE);
                }
                if (label18.getText().toString().equals("")){
                    checkbox18.setVisibility(View.INVISIBLE);
                    imagebutton18.setVisibility(View.INVISIBLE);
                }
                if (label19.getText().toString().equals("")){
                    checkbox19.setVisibility(View.INVISIBLE);
                    imagebutton19.setVisibility(View.INVISIBLE);
                }
                if (label20.getText().toString().equals("")){
                    checkbox20.setVisibility(View.INVISIBLE);
                    imagebutton20.setVisibility(View.INVISIBLE);
                }
            }
        });
        imagebutton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveClass.CountDown();
                label19.setText(label20.getText());
                label20.setText("");

                if (label1.getText().toString().equals("")){
                    checkbox1.setVisibility(View.INVISIBLE);
                    imagebutton1.setVisibility(View.INVISIBLE);
                }
                if (label2.getText().toString().equals("")){
                    checkbox2.setVisibility(View.INVISIBLE);
                    imagebutton2.setVisibility(View.INVISIBLE);
                }
                if (label3.getText().toString().equals("")){
                    checkbox3.setVisibility(View.INVISIBLE);
                    imagebutton3.setVisibility(View.INVISIBLE);
                }
                if (label4.getText().toString().equals("")){
                    checkbox4.setVisibility(View.INVISIBLE);
                    imagebutton4.setVisibility(View.INVISIBLE);
                }
                if (label5.getText().toString().equals("")){
                    checkbox5.setVisibility(View.INVISIBLE);
                    imagebutton5.setVisibility(View.INVISIBLE);
                }
                if (label6.getText().toString().equals("")){
                    checkbox6.setVisibility(View.INVISIBLE);
                    imagebutton6.setVisibility(View.INVISIBLE);
                }
                if (label7.getText().toString().equals("")){
                    checkbox7.setVisibility(View.INVISIBLE);
                    imagebutton7.setVisibility(View.INVISIBLE);
                }
                if (label8.getText().toString().equals("")){
                    checkbox8.setVisibility(View.INVISIBLE);
                    imagebutton8.setVisibility(View.INVISIBLE);
                }
                if (label9.getText().toString().equals("")){
                    checkbox9.setVisibility(View.INVISIBLE);
                    imagebutton9.setVisibility(View.INVISIBLE);
                }
                if (label10.getText().toString().equals("")){
                    checkbox10.setVisibility(View.INVISIBLE);
                    imagebutton10.setVisibility(View.INVISIBLE);
                }
                if (label11.getText().toString().equals("")){
                    checkbox11.setVisibility(View.INVISIBLE);
                    imagebutton11.setVisibility(View.INVISIBLE);
                }
                if (label12.getText().toString().equals("")){
                    checkbox12.setVisibility(View.INVISIBLE);
                    imagebutton12.setVisibility(View.INVISIBLE);
                }
                if (label13.getText().toString().equals("")){
                    checkbox13.setVisibility(View.INVISIBLE);
                    imagebutton13.setVisibility(View.INVISIBLE);
                }
                if (label14.getText().toString().equals("")){
                    checkbox14.setVisibility(View.INVISIBLE);
                    imagebutton14.setVisibility(View.INVISIBLE);
                }
                if (label15.getText().toString().equals("")){
                    checkbox15.setVisibility(View.INVISIBLE);
                    imagebutton15.setVisibility(View.INVISIBLE);
                }
                if (label16.getText().toString().equals("")){
                    checkbox16.setVisibility(View.INVISIBLE);
                    imagebutton16.setVisibility(View.INVISIBLE);
                }
                if (label17.getText().toString().equals("")){
                    checkbox17.setVisibility(View.INVISIBLE);
                    imagebutton17.setVisibility(View.INVISIBLE);
                }
                if (label18.getText().toString().equals("")){
                    checkbox18.setVisibility(View.INVISIBLE);
                    imagebutton18.setVisibility(View.INVISIBLE);
                }
                if (label19.getText().toString().equals("")){
                    checkbox19.setVisibility(View.INVISIBLE);
                    imagebutton19.setVisibility(View.INVISIBLE);
                }
                if (label20.getText().toString().equals("")){
                    checkbox20.setVisibility(View.INVISIBLE);
                    imagebutton20.setVisibility(View.INVISIBLE);
                }
            }
        });
        imagebutton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveClass.CountDown();
                label20.setText("");

                if (label1.getText().toString().equals("")){
                    checkbox1.setVisibility(View.INVISIBLE);
                    imagebutton1.setVisibility(View.INVISIBLE);
                }
                if (label2.getText().toString().equals("")){
                    checkbox2.setVisibility(View.INVISIBLE);
                    imagebutton2.setVisibility(View.INVISIBLE);
                }
                if (label3.getText().toString().equals("")){
                    checkbox3.setVisibility(View.INVISIBLE);
                    imagebutton3.setVisibility(View.INVISIBLE);
                }
                if (label4.getText().toString().equals("")){
                    checkbox4.setVisibility(View.INVISIBLE);
                    imagebutton4.setVisibility(View.INVISIBLE);
                }
                if (label5.getText().toString().equals("")){
                    checkbox5.setVisibility(View.INVISIBLE);
                    imagebutton5.setVisibility(View.INVISIBLE);
                }
                if (label6.getText().toString().equals("")){
                    checkbox6.setVisibility(View.INVISIBLE);
                    imagebutton6.setVisibility(View.INVISIBLE);
                }
                if (label7.getText().toString().equals("")){
                    checkbox7.setVisibility(View.INVISIBLE);
                    imagebutton7.setVisibility(View.INVISIBLE);
                }
                if (label8.getText().toString().equals("")){
                    checkbox8.setVisibility(View.INVISIBLE);
                    imagebutton8.setVisibility(View.INVISIBLE);
                }
                if (label9.getText().toString().equals("")){
                    checkbox9.setVisibility(View.INVISIBLE);
                    imagebutton9.setVisibility(View.INVISIBLE);
                }
                if (label10.getText().toString().equals("")){
                    checkbox10.setVisibility(View.INVISIBLE);
                    imagebutton10.setVisibility(View.INVISIBLE);
                }
                if (label11.getText().toString().equals("")){
                    checkbox11.setVisibility(View.INVISIBLE);
                    imagebutton11.setVisibility(View.INVISIBLE);
                }
                if (label12.getText().toString().equals("")){
                    checkbox12.setVisibility(View.INVISIBLE);
                    imagebutton12.setVisibility(View.INVISIBLE);
                }
                if (label13.getText().toString().equals("")){
                    checkbox13.setVisibility(View.INVISIBLE);
                    imagebutton13.setVisibility(View.INVISIBLE);
                }
                if (label14.getText().toString().equals("")){
                    checkbox14.setVisibility(View.INVISIBLE);
                    imagebutton14.setVisibility(View.INVISIBLE);
                }
                if (label15.getText().toString().equals("")){
                    checkbox15.setVisibility(View.INVISIBLE);
                    imagebutton15.setVisibility(View.INVISIBLE);
                }
                if (label16.getText().toString().equals("")){
                    checkbox16.setVisibility(View.INVISIBLE);
                    imagebutton16.setVisibility(View.INVISIBLE);
                }
                if (label17.getText().toString().equals("")){
                    checkbox17.setVisibility(View.INVISIBLE);
                    imagebutton17.setVisibility(View.INVISIBLE);
                }
                if (label18.getText().toString().equals("")){
                    checkbox18.setVisibility(View.INVISIBLE);
                    imagebutton18.setVisibility(View.INVISIBLE);
                }
                if (label19.getText().toString().equals("")){
                    checkbox19.setVisibility(View.INVISIBLE);
                    imagebutton19.setVisibility(View.INVISIBLE);
                }
                if (label20.getText().toString().equals("")){
                    checkbox20.setVisibility(View.INVISIBLE);
                    imagebutton20.setVisibility(View.INVISIBLE);
                }

            }
        });
        checkOutBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Double> clickerpricearray = new ArrayList<Double>();
                clickerpricearray=SaveClass.getPricearray();

                ArrayList<String> arrayList = new ArrayList<String>();

                if (checkbox20.isChecked()) {
                 SaveClass.setCheckOutPrice(clickerpricearray.get(19));
                    label20.setText("");


                }
                if (checkbox19.isChecked()){
                    SaveClass.setCheckOutPrice(clickerpricearray.get(18));
                    label19.setText(label20.getText());
                    label20.setText("");

                }
                if (checkbox18.isChecked()){
                    SaveClass.setCheckOutPrice(clickerpricearray.get(17));
                    label18.setText(label19.getText());
                    label19.setText(label20.getText());
                    label20.setText("");
                }
                if (checkbox17.isChecked()){
                    SaveClass.setCheckOutPrice(clickerpricearray.get(16));
                    label17.setText(label18.getText());
                    label18.setText(label19.getText());
                    label19.setText(label20.getText());
                    label20.setText("");
                }
                if (checkbox16.isChecked()){
                    SaveClass.setCheckOutPrice(clickerpricearray.get(15));
                    label16.setText(label17.getText());
                    label17.setText(label18.getText());
                    label18.setText(label19.getText());
                    label19.setText(label20.getText());
                    label20.setText("");
                }
                if (checkbox15.isChecked()){
                    SaveClass.setCheckOutPrice(clickerpricearray.get(14));
                    label15.setText(label16.getText());
                    label16.setText(label17.getText());
                    label17.setText(label18.getText());
                    label18.setText(label19.getText());
                    label19.setText(label20.getText());
                    label20.setText("");
                }
                if (checkbox14.isChecked()){
                    SaveClass.setCheckOutPrice(clickerpricearray.get(13));
                    label14.setText(label15.getText());
                    label15.setText(label16.getText());
                    label16.setText(label17.getText());
                    label17.setText(label18.getText());
                    label18.setText(label19.getText());
                    label19.setText(label20.getText());
                    label20.setText("");
                }
                if (checkbox13.isChecked()){
                    SaveClass.setCheckOutPrice(clickerpricearray.get(12));
                    label13.setText(label14.getText());
                    label14.setText(label15.getText());
                    label15.setText(label16.getText());
                    label16.setText(label17.getText());
                    label17.setText(label18.getText());
                    label18.setText(label19.getText());
                    label19.setText(label20.getText());
                    label20.setText("");
                }
                if (checkbox12.isChecked()){
                    SaveClass.setCheckOutPrice(clickerpricearray.get(11));
                    label12.setText(label13.getText());
                    label13.setText(label14.getText());
                    label14.setText(label15.getText());
                    label15.setText(label16.getText());
                    label16.setText(label17.getText());
                    label17.setText(label18.getText());
                    label18.setText(label19.getText());
                    label19.setText(label20.getText());
                    label20.setText("");
                }
                if (checkbox11.isChecked()){
                    SaveClass.setCheckOutPrice(clickerpricearray.get(10));
                    label11.setText(label12.getText());
                    label12.setText(label13.getText());
                    label13.setText(label14.getText());
                    label14.setText(label15.getText());
                    label15.setText(label16.getText());
                    label16.setText(label17.getText());
                    label17.setText(label18.getText());
                    label18.setText(label19.getText());
                    label19.setText(label20.getText());
                    label20.setText("");
                }
                if (checkbox10.isChecked()){
                    SaveClass.setCheckOutPrice(clickerpricearray.get(9));
                    label10.setText(label11.getText());
                    label11.setText(label12.getText());
                    label12.setText(label13.getText());
                    label13.setText(label14.getText());
                    label14.setText(label15.getText());
                    label15.setText(label16.getText());
                    label16.setText(label17.getText());
                    label17.setText(label18.getText());
                    label18.setText(label19.getText());
                    label19.setText(label20.getText());
                    label20.setText("");
                }
                if (checkbox9.isChecked()){
                    SaveClass.setCheckOutPrice(clickerpricearray.get(8));
                    label9.setText(label10.getText());
                    label10.setText(label11.getText());
                    label11.setText(label12.getText());
                    label12.setText(label13.getText());
                    label13.setText(label14.getText());
                    label14.setText(label15.getText());
                    label15.setText(label16.getText());
                    label16.setText(label17.getText());
                    label17.setText(label18.getText());
                    label18.setText(label19.getText());
                    label19.setText(label20.getText());
                    label20.setText("");
                }
                if (checkbox8.isChecked()){
                    SaveClass.setCheckOutPrice(clickerpricearray.get(7));
                    label8.setText(label9.getText());
                    label9.setText(label10.getText());
                    label10.setText(label11.getText());
                    label11.setText(label12.getText());
                    label12.setText(label13.getText());
                    label13.setText(label14.getText());
                    label14.setText(label15.getText());
                    label15.setText(label16.getText());
                    label16.setText(label17.getText());
                    label17.setText(label18.getText());
                    label18.setText(label19.getText());
                    label19.setText(label20.getText());
                    label20.setText("");
                }
                if (checkbox7.isChecked()){
                    SaveClass.setCheckOutPrice(clickerpricearray.get(6));
                    label7.setText(label8.getText());
                    label8.setText(label9.getText());
                    label9.setText(label10.getText());
                    label10.setText(label11.getText());
                    label11.setText(label12.getText());
                    label12.setText(label13.getText());
                    label13.setText(label14.getText());
                    label14.setText(label15.getText());
                    label15.setText(label16.getText());
                    label16.setText(label17.getText());
                    label17.setText(label18.getText());
                    label18.setText(label19.getText());
                    label19.setText(label20.getText());
                    label20.setText("");
                }
                if (checkbox6.isChecked()){
                    SaveClass.setCheckOutPrice(clickerpricearray.get(5));
                    label6.setText(label7.getText());
                    label7.setText(label8.getText());
                    label8.setText(label9.getText());
                    label9.setText(label10.getText());
                    label10.setText(label11.getText());
                    label11.setText(label12.getText());
                    label12.setText(label13.getText());
                    label13.setText(label14.getText());
                    label14.setText(label15.getText());
                    label15.setText(label16.getText());
                    label16.setText(label17.getText());
                    label17.setText(label18.getText());
                    label18.setText(label19.getText());
                    label19.setText(label20.getText());
                    label20.setText("");
                }
                if (checkbox5.isChecked()){
                    SaveClass.setCheckOutPrice(clickerpricearray.get(4));
                    label5.setText(label6.getText());
                    label6.setText(label7.getText());
                    label7.setText(label8.getText());
                    label8.setText(label9.getText());
                    label9.setText(label10.getText());
                    label10.setText(label11.getText());
                    label11.setText(label12.getText());
                    label12.setText(label13.getText());
                    label13.setText(label14.getText());
                    label14.setText(label15.getText());
                    label15.setText(label16.getText());
                    label16.setText(label17.getText());
                    label17.setText(label18.getText());
                    label18.setText(label19.getText());
                    label19.setText(label20.getText());
                    label20.setText("");
                }
                if (checkbox4.isChecked()){
                    SaveClass.setCheckOutPrice(clickerpricearray.get(3));
                    label4.setText(label5.getText());
                    label5.setText(label6.getText());
                    label6.setText(label7.getText());
                    label7.setText(label8.getText());
                    label8.setText(label9.getText());
                    label9.setText(label10.getText());
                    label10.setText(label11.getText());
                    label11.setText(label12.getText());
                    label12.setText(label13.getText());
                    label13.setText(label14.getText());
                    label14.setText(label15.getText());
                    label15.setText(label16.getText());
                    label16.setText(label17.getText());
                    label17.setText(label18.getText());
                    label18.setText(label19.getText());
                    label19.setText(label20.getText());
                    label20.setText("");
                }
                if (checkbox3.isChecked()){
                    SaveClass.setCheckOutPrice(clickerpricearray.get(2));
                    label3.setText(label4.getText());
                    label4.setText(label5.getText());
                    label5.setText(label6.getText());
                    label6.setText(label7.getText());
                    label7.setText(label8.getText());
                    label8.setText(label9.getText());
                    label9.setText(label10.getText());
                    label10.setText(label11.getText());
                    label11.setText(label12.getText());
                    label12.setText(label13.getText());
                    label13.setText(label14.getText());
                    label14.setText(label15.getText());
                    label15.setText(label16.getText());
                    label16.setText(label17.getText());
                    label17.setText(label18.getText());
                    label18.setText(label19.getText());
                    label19.setText(label20.getText());
                    label20.setText("");
                }
                if (checkbox2.isChecked()){
                    SaveClass.setCheckOutPrice(clickerpricearray.get(1));
                    label2.setText(label3.getText());
                    label3.setText(label4.getText());
                    label4.setText(label5.getText());
                    label5.setText(label6.getText());
                    label6.setText(label7.getText());
                    label7.setText(label8.getText());
                    label8.setText(label9.getText());
                    label9.setText(label10.getText());
                    label10.setText(label11.getText());
                    label11.setText(label12.getText());
                    label12.setText(label13.getText());
                    label13.setText(label14.getText());
                    label14.setText(label15.getText());
                    label15.setText(label16.getText());
                    label16.setText(label17.getText());
                    label17.setText(label18.getText());
                    label18.setText(label19.getText());
                    label19.setText(label20.getText());
                    label20.setText("");
                }
                if (checkbox1.isChecked()){
                    SaveClass.setCheckOutPrice(clickerpricearray.get(0));
                    label1.setText(label2.getText());
                    label2.setText(label3.getText());
                    label3.setText(label4.getText());
                    label4.setText(label5.getText());
                    label5.setText(label6.getText());
                    label6.setText(label7.getText());
                    label7.setText(label8.getText());
                    label8.setText(label9.getText());
                    label9.setText(label10.getText());
                    label10.setText(label11.getText());
                    label11.setText(label12.getText());
                    label12.setText(label13.getText());
                    label13.setText(label14.getText());
                    label14.setText(label15.getText());
                    label15.setText(label16.getText());
                    label16.setText(label17.getText());
                    label17.setText(label18.getText());
                    label18.setText(label19.getText());
                    label19.setText(label20.getText());
                    label20.setText("");
                }

                checkbox1.setChecked(false);
                checkbox2.setChecked(false);
                checkbox3.setChecked(false);
                checkbox4.setChecked(false);
                checkbox5.setChecked(false);
                checkbox6.setChecked(false);
                checkbox7.setChecked(false);
                checkbox8.setChecked(false);
                checkbox9.setChecked(false);
                checkbox10.setChecked(false);
                checkbox11.setChecked(false);
                checkbox12.setChecked(false);
                checkbox13.setChecked(false);
                checkbox14.setChecked(false);
                checkbox15.setChecked(false);
                checkbox16.setChecked(false);
                checkbox17.setChecked(false);
                checkbox18.setChecked(false);
                checkbox19.setChecked(false);
                checkbox20.setChecked(false);

                if (label1.getText().toString().equals("")){
                    checkbox1.setVisibility(View.INVISIBLE);
                    imagebutton1.setVisibility(View.INVISIBLE);
                }
                if (label2.getText().toString().equals("")){
                    checkbox2.setVisibility(View.INVISIBLE);
                    imagebutton2.setVisibility(View.INVISIBLE);
                }
                if (label3.getText().toString().equals("")){
                    checkbox3.setVisibility(View.INVISIBLE);
                    imagebutton3.setVisibility(View.INVISIBLE);
                }
                if (label4.getText().toString().equals("")){
                    checkbox4.setVisibility(View.INVISIBLE);
                    imagebutton4.setVisibility(View.INVISIBLE);
                }
                if (label5.getText().toString().equals("")){
                    checkbox5.setVisibility(View.INVISIBLE);
                    imagebutton5.setVisibility(View.INVISIBLE);
                }
                if (label6.getText().toString().equals("")){
                    checkbox6.setVisibility(View.INVISIBLE);
                    imagebutton6.setVisibility(View.INVISIBLE);
                }
                if (label7.getText().toString().equals("")){
                    checkbox7.setVisibility(View.INVISIBLE);
                    imagebutton7.setVisibility(View.INVISIBLE);
                }
                if (label8.getText().toString().equals("")){
                    checkbox8.setVisibility(View.INVISIBLE);
                    imagebutton8.setVisibility(View.INVISIBLE);
                }
                if (label9.getText().toString().equals("")){
                    checkbox9.setVisibility(View.INVISIBLE);
                    imagebutton9.setVisibility(View.INVISIBLE);
                }
                if (label10.getText().toString().equals("")){
                    checkbox10.setVisibility(View.INVISIBLE);
                    imagebutton10.setVisibility(View.INVISIBLE);
                }
                if (label11.getText().toString().equals("")){
                    checkbox11.setVisibility(View.INVISIBLE);
                    imagebutton11.setVisibility(View.INVISIBLE);
                }
                if (label12.getText().toString().equals("")){
                    checkbox12.setVisibility(View.INVISIBLE);
                    imagebutton12.setVisibility(View.INVISIBLE);
                }
                if (label13.getText().toString().equals("")){
                    checkbox13.setVisibility(View.INVISIBLE);
                    imagebutton13.setVisibility(View.INVISIBLE);
                }
                if (label14.getText().toString().equals("")){
                    checkbox14.setVisibility(View.INVISIBLE);
                    imagebutton14.setVisibility(View.INVISIBLE);
                }
                if (label15.getText().toString().equals("")){
                    checkbox15.setVisibility(View.INVISIBLE);
                    imagebutton15.setVisibility(View.INVISIBLE);
                }
                if (label16.getText().toString().equals("")){
                    checkbox16.setVisibility(View.INVISIBLE);
                    imagebutton16.setVisibility(View.INVISIBLE);
                }
                if (label17.getText().toString().equals("")){
                    checkbox17.setVisibility(View.INVISIBLE);
                    imagebutton17.setVisibility(View.INVISIBLE);
                }
                if (label18.getText().toString().equals("")){
                    checkbox18.setVisibility(View.INVISIBLE);
                    imagebutton18.setVisibility(View.INVISIBLE);
                }
                if (label19.getText().toString().equals("")){
                    checkbox19.setVisibility(View.INVISIBLE);
                    imagebutton19.setVisibility(View.INVISIBLE);
                }
                if (label20.getText().toString().equals("")){
                    checkbox20.setVisibility(View.INVISIBLE);
                    imagebutton20.setVisibility(View.INVISIBLE);
                }

                Toast.makeText(getActivity(), "You've checked out items", Toast.LENGTH_LONG).show();
            }
        });
    }
}

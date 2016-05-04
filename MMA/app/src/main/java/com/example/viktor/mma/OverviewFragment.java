package com.example.viktor.mma;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//
//import com.github.mikephil.charting.charts.PieChart;
//import com.github.mikephil.charting.data.Entry;
//import com.github.mikephil.charting.data.PieData;
//import com.github.mikephil.charting.data.PieDataSet;
//import com.github.mikephil.charting.utils.ColorTemplate;
//
//import java.util.ArrayList;


/**
 * Created by Viktor on 03-05-2016.
 */
public class OverviewFragment extends Fragment {
    private String TAG = "OverviewFragment";

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (container != null)
            container.removeAllViews();

        View v = inflater.inflate(R.layout.overview_fragment, container, false);

        //ChartSetup(v);

        return v;
    }

    public void ChartSetup(View v) {
//        PieChart pieChart = (PieChart) v.findViewById(R.id.chart);
//
//        ArrayList<Entry> entries = new ArrayList<>();
//        entries.add(new Entry(4f, 0));
//        entries.add(new Entry(8f, 1));
//        entries.add(new Entry(6f, 2));
//        entries.add(new Entry(12f, 3));
//        entries.add(new Entry(18f, 4));
//        entries.add(new Entry(9f, 5));
//
//        PieDataSet dataset = new PieDataSet(entries, "# of Calls");
//
//        ArrayList<String> labels = new ArrayList<String>();
//        labels.add("January");
//        labels.add("February");
//        labels.add("March");
//        labels.add("April");
//        labels.add("May");
//        labels.add("June");
//
//        PieData data = new PieData(labels, dataset);
//        dataset.setColors(ColorTemplate.COLORFUL_COLORS); //
//        pieChart.setDescription("Description");
//        pieChart.setData(data);
//
//        pieChart.animateY(5000);
//
//        pieChart.saveToGallery("/sd/mychart.jpg", 85); // 85 is the quality of the image

    }
}

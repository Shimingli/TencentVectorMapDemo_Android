package com.example.tencentmap.tencentmapdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tencent.tencentmap.mapsdk.maps.model.Circle;
import com.tencent.tencentmap.mapsdk.maps.model.CircleOptions;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;

public class DrawCircleActivity extends SupportMapFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LatLng latLng = new LatLng(39.984059,116.307771);
        Circle circle = tencentMap.addCircle(new CircleOptions().
                center(latLng).
                radius(100d).
                fillColor(getResources().getColor(R.color.style)).
                strokeColor(getResources().getColor(R.color.colorPrimary)).
                strokeWidth(1));
    }
}

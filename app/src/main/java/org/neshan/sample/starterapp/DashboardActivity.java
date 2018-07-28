package org.neshan.sample.starterapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.neshan.sample.starterapp.activity.AddMarker;
import org.neshan.sample.starterapp.activity.ChangeCameraBearing;
import org.neshan.sample.starterapp.activity.ChangeCameraTilt;
import org.neshan.sample.starterapp.activity.ChangeStyle;
import org.neshan.sample.starterapp.activity.DatabaseLayer;
import org.neshan.sample.starterapp.activity.DrawLine;
import org.neshan.sample.starterapp.activity.DrawPolygon;
import org.neshan.sample.starterapp.activity.OnlineLayer;
import org.neshan.sample.starterapp.activity.POILayer;
import org.neshan.sample.starterapp.activity.TrafficLayer;
import org.neshan.sample.starterapp.activity.UserLocation;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void goToAddMarkerActivity(View view) {
        Intent intent = new Intent(this, AddMarker.class);
        startActivity(intent);
    }

    public void goToDrawLineActivity(View view) {
        Intent intent = new Intent(this, DrawLine.class);
        startActivity(intent);
    }

    public void goToDrawPolygonActivity(View view) {
        Intent intent = new Intent(this, DrawPolygon.class);
        startActivity(intent);
    }

    public void goToChangeCameraTiltActivity(View view) {
        Intent intent = new Intent(this, ChangeCameraTilt.class);
        startActivity(intent);
    }

    public void goToChangeCameraBearingActivity(View view) {
        Intent intent = new Intent(this, ChangeCameraBearing.class);
        startActivity(intent);
    }

    public void goToChangeStyleActivity(View view) {
        Intent intent = new Intent(this, ChangeStyle.class);
        startActivity(intent);
    }

    public void goToUserLocationActivity(View view) {
        Intent intent = new Intent(this, UserLocation.class);
        startActivity(intent);
    }

    public void goToTrafficLayerActivity(View view) {
        Intent intent = new Intent(this, TrafficLayer.class);
        startActivity(intent);
    }

    public void goToOnlineLayerActivity(View view) {
        Intent intent = new Intent(this, OnlineLayer.class);
        startActivity(intent);
    }

    public void goToPOILayerActivity(View view) {
        Intent intent = new Intent(this, POILayer.class);
        startActivity(intent);
    }

    public void goToDatabaseLayerActivity(View view) {
        Intent intent = new Intent(this, DatabaseLayer.class);
        startActivity(intent);
    }
}

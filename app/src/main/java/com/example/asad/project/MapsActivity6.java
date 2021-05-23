package com.example.asad.project;

import android.location.Address;
import android.location.Geocoder;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class MapsActivity6 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    EditText loc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps6);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        loc = (EditText)findViewById(R.id.customSearchID);
    }

    public void search(View view) {
        Toast.makeText(this,"HELLO",Toast.LENGTH_SHORT).show();


        String location = loc.getText().toString();
        List<Address> addressList = null;


        if (location != null || !location.equals("")) {

                Geocoder geocoder = new Geocoder(this);
                try {
                    addressList = geocoder.getFromLocationName(location, 1);
                } catch (IOException e) {
                e.printStackTrace();
            }
            Address adress = addressList.get(0);

            LatLng lt = new LatLng(adress.getLatitude(), adress.getLongitude());

            mMap.addMarker(new MarkerOptions().position(lt).title(location));
            mMap.animateCamera(CameraUpdateFactory.newLatLng(lt));
        }
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng fast = new LatLng(31.48121529026332,74.30373698472977);
        mMap.addMarker(new MarkerOptions().position(fast).title("FAST University - Current Location ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(fast));

        mMap.setMyLocationEnabled(true);
    }
}

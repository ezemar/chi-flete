package com.example.pablov.demochiflete;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import Models.Direccion;
import io.realm.Realm;
import io.realm.RealmQuery;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Realm modelRealm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        modelRealm = Realm.getDefaultInstance();

        modelRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                Direccion query = realm.where(Direccion.class).findFirst();
                Long lat = query.getLatitud();
                Long longitud = query.getLongitud();

                // Add a marker in Sydney and move the camera
                LatLng sydney = new LatLng(lat, longitud);
                mMap.addMarker(new MarkerOptions().position(sydney).title("Los Andes"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
            }
        });

    }
}

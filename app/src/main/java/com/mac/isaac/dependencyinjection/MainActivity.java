package com.mac.isaac.dependencyinjection;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VehicleComponent component = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();

        vehicle = component.provideVehicle();

        Toast.makeText(this, "Speed: "+String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();
    }

}

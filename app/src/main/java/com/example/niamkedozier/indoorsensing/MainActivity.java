package com.example.niamkedozier.indoorsensing;

import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.List;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements SensorEventListener{
    Button getSensorBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void getSensorBtnClick(View view){
        TextView textView = (TextView)findViewById(R.id.text);
        SensorManager mgr = (SensorManager)getSystemService(SENSOR_SERVICE);
        List<Sensor> sensors = mgr.getSensorList(Sensor.TYPE_ALL);
        String sensorInfo = "";
        for (Sensor s : sensors){
            sensorInfo = sensorInfo + s.getName()+ "\n";
        }
        textView.setText(sensorInfo);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}

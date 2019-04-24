package com.example.gyk_1;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Camera;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button openPhotoVideoBtn, openVoiceBtn, openMapBtn ,openWebBtn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //activity nin layout xml dosyası tanımlanıyor burda
        initialize();
    }

    private void initialize() {
        openPhotoVideoBtn.findViewById(R.id.open_photo_and_video);
        openPhotoVideoBtn.setOnClickListener(this);

        openVoiceBtn.findViewById(R.id.open_voice);
        openVoiceBtn.setOnClickListener(this);

        openMapBtn.findViewById(R.id.open_map);
        openVoiceBtn.setOnClickListener(this);

        openWebBtn.findViewById(R.id.open_web);
        openWebBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
                case R.id.open_photo_and_video:
                    Intent cameraIntent = new Intent(MainActivity.this, CameraActivity.class);
                    startActivity(cameraIntent);
                    break;
                case R.id.open_voice:
                    Intent voiceIntent = new Intent(MainActivity.this, VoiceActivity.class);
                    startActivity(voiceIntent);
                    break;
                case R.id.open_map:
                    Intent mapIntent = new Intent(MainActivity.this, MapActivity.class);
                    startActivity(mapIntent);
                    break;
                case R.id.open_web:
                    Intent webIntent = new Intent(MainActivity.this, WebActivity.class);
                    startActivity(webIntent);
                    break;
        }

    }
}

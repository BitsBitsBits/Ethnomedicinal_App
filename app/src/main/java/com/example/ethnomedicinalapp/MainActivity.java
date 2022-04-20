package com.example.ethnomedicinalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ethnomedicinalapp.Retrofit.IUploadAPI;
import com.example.ethnomedicinalapp.Retrofit.RetrofitClient;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {
    private static final int PICK_FILE_REQUEST = 1000;



    private IUploadAPI getAPIUpload(){
        return RetrofitClient.getClient().create(IUploadAPI.class);
    }


    Button cameraButton;
    Button plantsButton;
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        cameraButton = findViewById(R.id.cameraButton);
        cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UploadingActivity.class);
                startActivity(intent);
            }



        });

        plantsButton = findViewById(R.id.plantsButton);
        plantsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlantActivity.class);
                startActivity(intent);
            }
        });


    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */

    public native String stringFromJNI();
}
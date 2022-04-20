package com.example.ethnomedicinalapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ethnomedicinalapp.Retrofit.RetrofitClient;
import com.github.dhaval2404.imagepicker.ImagePicker;

import java.io.IOException;

public class UploadingActivity extends AppCompatActivity {
    Button cameraButton4;
    ImageView preview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uploading);

        preview = findViewById(R.id.image_view);
        cameraButton4 = findViewById(R.id.cameraButton4);

        cameraButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                ImagePicker.with(UploadingActivity.this)
                        .compress(1024)			//Final image size will be less than 1 MB(Optional)
                        .maxResultSize(1080, 1080)//Final image resolution will be less than 1080 x 1080(Optional)
                        .start();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        Uri uri = data.getData();
        preview.setImageURI(uri);
    }

}

package com.company.facedetectionbitel;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    private FaceOverlayView faceOverlayView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        faceOverlayView = findViewById(R.id.face_overlay);
        InputStream stream = getResources().openRawResource(R.raw.faces);
        Bitmap bitmap = BitmapFactory.decodeStream(stream);

        faceOverlayView.setBitmap(bitmap);

    }
}

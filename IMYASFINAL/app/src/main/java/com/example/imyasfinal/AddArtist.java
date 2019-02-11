package com.example.imyasfinal;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class AddArtist extends AppCompatActivity {

    private Uri imageuri;
    private static final int IMAGE_REQUEST_1 = 3;
    ImageButton image;
    ImageView image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_artist);
    }
}

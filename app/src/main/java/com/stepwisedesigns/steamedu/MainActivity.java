package com.stepwisedesigns.steamedu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView profileClickActionImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profileClickActionImageView = findViewById(R.id.bottom_image_view);
        profileClickActionImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showProgressIntent = new Intent(MainActivity.this,StudentProgress.class);
                showProgressIntent.setAction(Intent.ACTION_SEND);
                startActivity(showProgressIntent);
            }
        });
    }
}

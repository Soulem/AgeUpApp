package com.dynamicdevs.ageupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button restartButton;
    private Button ageUpButton;
    private RadioButton ageUpByTenRB;
    private ImageView imageView;
    private TextView ageTextView;
    private int age;
    private TextView currentAgeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        restartButton = findViewById(R.id.restartButton);
        ageUpButton = findViewById(R.id.ageUpButton);
        ageUpByTenRB = findViewById(R.id.ageUpByTenRadioButton);
        imageView = findViewById(R.id.personImage);
        ageTextView = findViewById(R.id.ageValueTextView);
        currentAgeTextView = findViewById(R.id.currentAgeTextView);
        age = 0;
        ageTextView.setText(age);
    }

    public void onAgeUpClick(View view){
        if (ageUpByTenRB.isChecked()){
            age += 10;
        }
        else{
            age++;
        }
        ageTextView.setText(age);

        handleImage();
    }

    private void handleImage() {
        switch(age){
            case
        }
    }
}
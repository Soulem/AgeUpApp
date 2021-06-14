package com.dynamicdevs.ageupapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
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
        if (null == savedInstanceState) {
            setContentView(R.layout.activity_main);
            restartButton = findViewById(R.id.restartButton);
            ageUpButton = findViewById(R.id.ageUpButton);
            ageUpByTenRB = findViewById(R.id.ageUpByTenRadioButton);
            imageView = findViewById(R.id.personImage);
            ageTextView = findViewById(R.id.ageValueTextView);
            currentAgeTextView = findViewById(R.id.currentAgeTextView);
            age = 0;
            ageTextView.setText(String.valueOf(age));
            restartButton.setVisibility(View.INVISIBLE);
            imageView.setImageResource(R.drawable.age_0);
        }
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("AGE_KEY", age);
        outState.putInt("RESTART_VISIBLE_KEY", restartButton.getVisibility());
        outState.putBoolean("RADIO_BUTTON_KEY", ageUpByTenRB.isChecked());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        age = savedInstanceState.getInt("AGE_KEY");
        restartButton.setVisibility(savedInstanceState.getInt("RESTART_VISIBLE_KEY"));
        ageUpByTenRB.setChecked(savedInstanceState.getBoolean("RADIO_BUTTON_KEY"));
        handleImage();
    }

    public void onAgeUpClick(View view){
        if (ageUpByTenRB.isChecked()){
            age += 10;
        }
        else{
            age++;
        }
        ageTextView.setText(String.valueOf(age));

        handleImage();
    }

    private void handleImage() {
        if(2 > age){
            imageView.setImageResource(R.drawable.age_0);
        }
        else if(5 > age){
            imageView.setImageResource(R.drawable.age_2);
        }
        else if(10 > age){
            imageView.setImageResource(R.drawable.age_5);
        }
        else if(13 > age){
            imageView.setImageResource(R.drawable.age_10);
        }
        else if(18 > age){
            imageView.setImageResource(R.drawable.age_13);
        }
        else if(20 > age){
            imageView.setImageResource(R.drawable.age_18);
        }
        else if(30 > age){
            imageView.setImageResource(R.drawable.age_20);
        }
        else if(40 > age){
            imageView.setImageResource(R.drawable.age_30);
        }
        else if(50 > age){
            imageView.setImageResource(R.drawable.age_40);
        }
        else if(60 > age){
            imageView.setImageResource(R.drawable.age_50);
        }
        else if(70 > age){
            imageView.setImageResource(R.drawable.age_60);
        }
        else if(80 > age){
            imageView.setImageResource(R.drawable.age_70);
        }
        else if(90 > age){
            imageView.setImageResource(R.drawable.age_80);
        }
        else if(100 > age){
            imageView.setImageResource(R.drawable.age_90);
        }
        else if(110 > age){
            imageView.setImageResource(R.drawable.age_100);
        }
        else if(120 > age){
            imageView.setImageResource(R.drawable.age_110);
        }
        else if(130 > age){
            imageView.setImageResource(R.drawable.age_120);
        }
        else{
            imageView.setImageResource(R.drawable.age_dead);
            restartButton.setVisibility(View.VISIBLE);
            currentAgeTextView.setText(R.string.dead_string);
        }
    }

    public void onRestartClick(View view){
        age = 0;
        ageTextView.setText(String.valueOf(age));
        restartButton.setVisibility(View.INVISIBLE);
        imageView.setImageResource(R.drawable.age_0);
        currentAgeTextView.setText(R.string.current_age_resorce);
    }
}
package com.example.premireapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    /*
    AppCompactActivity: Base class for activities that wish to use
    some of the newer platform features on older Android devices.
    onCreate(),setContentView(),findViewById() : we need extends AppCompactActivity.
    */
    TextView textView;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        // Bundle are used to pass data between various activities.

        super.onCreate(savedInstanceState);
        // we call it in the first launch of the activity.
        // examples:onStart,onRestart,onStop.
        // calls the method in the super class and save an InstanceState of the activity if any damage.
        // when we relaod the activity it will be the same.

        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.salutations_text_view);
    }
    public void montrerSalutations (View view)
    {
        String message= "Bienvenue à ma première application";
        textView.setText (message) ;
    }
}
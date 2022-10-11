package com.example.noscreenshots;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Adding this will prevent taking screenshot in your app
        /*
        * This method only prevents the user from taking screenshot from this activity,
        * if they try to take a screenshot from another activity of the app, they'll
        * be able to.
         */
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,
                WindowManager.LayoutParams.FLAG_SECURE);

    }
}
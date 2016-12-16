package com.example.shreyanshsingh.hellouser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        TextView t = (TextView) findViewById(R.id.welcome_user);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String newText = extras.getString("myTextViewString");
            if (newText != null) {
                t.setText(newText);
            }
        }


    }

}

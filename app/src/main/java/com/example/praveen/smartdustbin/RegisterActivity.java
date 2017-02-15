package com.example.praveen.smartdustbin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void toastmessage(View view){
        Toast.makeText(getApplicationContext() , "This is Toast message !" , Toast.LENGTH_SHORT).show();
    }
}

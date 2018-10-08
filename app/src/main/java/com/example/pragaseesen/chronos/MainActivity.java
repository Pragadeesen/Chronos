package com.example.pragaseesen.chronos;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast,
                (ViewGroup) findViewById(R.id.custom_toast_container));
        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText("    Welcome to Chronos    ");
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, -150);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();



    }

    public void Register(View view)
    {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    public void ForgotPassword(View view)
    {
        Intent intent = new Intent(this,ForgotPasswordVerifyActivity.class);
        startActivity(intent);
    }

    public void Sign_In(View view)
    {
        Intent intent = new Intent(this,FilmDisplayActivity.class);
        startActivity(intent);
    }
}

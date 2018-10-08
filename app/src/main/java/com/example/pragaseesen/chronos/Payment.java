package com.example.pragaseesen.chronos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
    }

    public void PrintTickets(View view)
    {
        Intent intent = new Intent(this, TicketDetails.class);
        startActivity(intent);
    }

    public void BackToFilmList(View view)
    {
        Intent intent = new Intent(this, FilmDisplayActivity.class);
        startActivity(intent);
    }
}

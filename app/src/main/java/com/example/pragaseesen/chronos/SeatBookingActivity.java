package com.example.pragaseesen.chronos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SeatBookingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat_booking);
    }

    public void DoPayment(View view)
    {
        Intent intent = new Intent(this, Payment.class);
        startActivity(intent);
    }

    public void BackToFilmList(View view)
    {
        Intent intent = new Intent(this, FilmDisplayActivity.class);
        startActivity(intent);
    }
}

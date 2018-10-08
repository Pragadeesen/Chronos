package com.example.pragaseesen.chronos;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class RegisterActivity extends AppCompatActivity {

    private EditText userName,email,password,confirmPassword,nic,phoneNo;
    private Button register;
    DatabaseReference myRef;
    FirebaseDatabase database;
    Users user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //
        // userName = findViewById(R.id.editText1);

        // Write a message to the database
        register = findViewById(R.id.button);
        userName = findViewById(R.id.editText6);
        email = findViewById(R.id.email);
        password = findViewById(R.id.editText2);
        confirmPassword = findViewById(R.id.editText3);
        nic = findViewById(R.id.editText5);
        phoneNo = findViewById(R.id.editText);

        //register.setOnClickListener();
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("Users");
        user = new Users();

    }

    private void getVal(){
        user.setEmail(email.getText().toString());
        user.setUsername(userName.getText().toString());
        user.setPassword(password.getText().toString());
        user.setNic(nic.getText().toString());
        user.setPhone(phoneNo.getText().toString());
    }
    public void btnInsert(View view){
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                getVal();
                myRef.child(user.getEmail()).setValue(user);
                Toast.makeText(RegisterActivity.this," Registered Successfully ",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }

    public void Login(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

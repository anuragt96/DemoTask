package com.example.demotask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Profile extends AppCompatActivity {

    TextView name_tv,email_tv;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        name_tv = findViewById(R.id.user_name);
        email_tv =findViewById(R.id.user_email);

        mAuth=FirebaseAuth.getInstance();


        FirebaseUser user = mAuth.getCurrentUser();

        String name = user.getDisplayName();
        String email = user.getEmail();
        String phone = user.getPhoneNumber();


        name_tv.setText(name);
        email_tv.setText(email);
    }
}

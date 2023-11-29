package com.security.communitysafee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginOptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_options);
        Button buttonResident = (Button) findViewById(R.id.buttonLoginAsResident);
        Button buttonSecurity = (Button) findViewById(R.id.buttonLoginAsSecurity);
        buttonResident.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(view.getContext(), login_resident.class);
                view.getContext().startActivity(intent);
            }
        });

        buttonSecurity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(view.getContext(), login_security.class);
                view.getContext().startActivity(intent);
            }
        });
    }
}
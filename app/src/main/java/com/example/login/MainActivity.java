package com.example.login;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText emailEditText;
    EditText passwordEditText;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        emailEditText = (EditText) findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        //first method of setting an event handler
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                String message = "";

                if(email.equals("student@gc.ca") && password.equals("Password")){
                    message = "Welcome";
                }else{
                    message = "Try Again";
                }

                View parentLayout = findViewById(android.R.id.content);
                Snackbar.make(parentLayout, message, Snackbar.LENGTH_LONG).show();

            }
        });



    }

    //this is the second option when creating an event handler
    public void Reset(View view) {
        emailEditText.setText("");
        passwordEditText.setText("");
    }
}

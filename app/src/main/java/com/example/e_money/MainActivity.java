package com.example.e_money;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edit_username, edit_password;
    String username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_signin = findViewById(R.id.btn_signin);
        edit_username = findViewById(R.id.edit_username);
        edit_password = findViewById(R.id.edit_password);

        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = "joshuafirme07";
                password = "123";

                if (edit_username.getText().toString().equals(username) &&
                        edit_password.getText().toString().equals(password)){
                    Intent intent = new Intent(MainActivity.this, Dashboard.class);
                    intent.putExtra("username", username);
                    startActivity(intent);
                }
               else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Invalid account!");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
    }
}

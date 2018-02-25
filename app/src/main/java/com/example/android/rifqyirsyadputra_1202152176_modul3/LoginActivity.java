package com.example.android.rifqyirsyadputra_1202152176_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText mUsername;
    private EditText mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mUsername = (EditText) findViewById(R.id.username);
        mPassword = (EditText) findViewById(R.id.pass);
    }



    public void launchMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        String username = mUsername.getText().toString();
        String password = mPassword.getText().toString();

        // Untuk Authentifikasi dengan Username dan Password dengan data statik

        if ((username.equals("EAD")) || (password.equals("MOBILE")) ) {
            Toast toast = Toast.makeText(this, "Login Berhasil", Toast.LENGTH_LONG);
            toast.show();
            startActivity(intent);

        } else {
            Toast toast = Toast.makeText(this, "Username atau Password salah", Toast.LENGTH_LONG);
            toast.show();}
    }
}

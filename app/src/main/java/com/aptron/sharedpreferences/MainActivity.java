package com.aptron.sharedpreferences;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

    }

    public void save(View view) {

        String emailText= email.getText().toString();
        String passText = password.getText().toString();

        SharedPreferences preferences= getSharedPreferences("data",MODE_PRIVATE);
        SharedPreferences.Editor editor= preferences.edit();

        editor.putString("email",emailText);
        editor.putString("pass",passText);

        editor.commit();
        Toast.makeText(this, "Data Saved SuccessFully", Toast.LENGTH_SHORT).show();

    }

    public void next(View view) {
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }
}
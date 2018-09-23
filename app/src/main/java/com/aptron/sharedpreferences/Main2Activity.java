package com.aptron.sharedpreferences;
import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView email2,password2;
    Button load,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        email2 = findViewById(R.id.email1);
        password2 = findViewById(R.id.password1);

    }

    public void load(View view) {

        SharedPreferences preferences= getSharedPreferences("data",MODE_PRIVATE);

        String email=preferences.getString("email","Data not Found");
        String pass = preferences.getString("pass","Data not Found");

        email2.setText(email);
        password2.setText(pass);
    }

    public void back(View view) {
        finish();
    }
}
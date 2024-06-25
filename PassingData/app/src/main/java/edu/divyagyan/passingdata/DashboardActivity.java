package edu.divyagyan.passingdata;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    private TextView GreetingTextView;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dashboard);

        GreetingTextView  = findViewById(R.id.greeting_text);
         Intent intent = getIntent();
         if(intent !=null){
             String uName = intent.getStringExtra("username");
             GreetingTextView.setText("Hello"+uName);
         }
    }
}

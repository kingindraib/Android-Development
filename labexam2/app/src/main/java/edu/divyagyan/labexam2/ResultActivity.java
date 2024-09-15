package edu.divyagyan.labexam2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    private TextView name,phone,age;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        name = findViewById(R.id.nameRes);
        age = findViewById(R.id.ageRes);
        phone = findViewById(R.id.phoneres);

        Intent intent = getIntent();
        String nm = intent.getStringExtra("name");
        int ag = intent.getIntExtra("age",0);
        int ph = intent.getIntExtra("phone",0);
        name.setText(nm);
        age.setText(Integer.toString(ag));
        phone.setText(Integer.toString(ph));

    }
}

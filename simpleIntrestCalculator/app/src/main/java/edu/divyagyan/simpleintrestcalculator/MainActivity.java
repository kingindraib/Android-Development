package edu.divyagyan.simpleintrestcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button submit;
    private EditText principle,rate,Itime;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                principle = findViewById(R.id.principle);
                rate = findViewById(R.id.rate);
                Itime = findViewById(R.id.i_time);
                int p = Integer.parseInt(principle.getText().toString());
                int r = Integer.parseInt(rate.getText().toString());
                int t = Integer.parseInt(Itime.getText().toString());

                float i = (p*t*r)/100;
                Toast.makeText(MainActivity.this,"intrst"+i, Toast.LENGTH_SHORT).show();

            }
        });
    }
}

package edu.divyagyan.labexam1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Mainactivity extends AppCompatActivity {
    private EditText secondEdittext, firstEdittext;
    private Button submit;
    private TextView result;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstEdittext = findViewById(R.id.firstEdittext);
        secondEdittext = findViewById(R.id.secondEdittext);
        result = findViewById(R.id.resultEdittext);

        submit =findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(firstEdittext.getText().toString());
                int n2 = Integer.parseInt(secondEdittext.getText().toString());
                int res =n1+n2;

                result.setText(Integer.toString(res));

            }
        });
    }
}

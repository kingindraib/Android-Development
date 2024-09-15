package edu.divyagyan.labexam2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MembershipActivity extends AppCompatActivity {

    private EditText fullname,age,phone;
    private Button submit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membership);

        fullname = findViewById(R.id.fullNameText);
        age = findViewById(R.id.ageText);
        phone = findViewById(R.id.phoneText);
        submit =findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MembershipActivity.this,ResultActivity.class);
                intent.putExtra("name",fullname.getText().toString());
                intent.putExtra("phone",Integer.parseInt(phone.getText().toString()));
                intent.putExtra("age",Integer.parseInt(age.getText().toString()));
                startActivity(intent);
            }
        });
    }
}

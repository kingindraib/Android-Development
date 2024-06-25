package edu.divyagyan.geetingdatafromsecondactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private EditText UserNameEditText;
    private Button ClickMeEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        UserNameEditText = findViewById(R.id.user_name_edit_text);
        ClickMeEditText = findViewById(R.id.click_me_button);

        ClickMeEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = UserNameEditText.getText().toString().trim();
                if(userName.length()> 3 && !userName.isEmpty()){
                    Intent intent = new Intent();
                    intent.putExtra("userName",userName);
                    setResult(201,intent);
                    finish();
                } else{
                    Toast.makeText(SecondActivity.this,"invalid username",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}

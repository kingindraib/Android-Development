package edu.divyagyan.loginsignupexample;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button login_btn;
    private TextView alreadyTextView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        login_btn = findViewById(R.id.login_btn);
        alreadyTextView = findViewById(R.id.already_account_text_view);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = usernameEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                if(!userName.isEmpty()){

                    if(password.isEmpty()){
                        passwordEditText.setError("passowrd is required");
                    }else{
                        Toast.makeText(LoginActivity.this,"Login success",Toast.LENGTH_SHORT).show();
                    }

                }else{
                    usernameEditText.setError("UserName is Empty");
                }

//                Log.d(TAG, "username",username);
            }
        });

//        alreadyTextView.setOnClickListener(this);
    }

    public void onClick(View v){
        Intent intent = new Intent(LoginActivity.this,signupActivity.class);
    }
}

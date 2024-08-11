package edu.divyagyan.dialogfragmentexample;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button LogoutButton,SubmitButton,CustomButton;
    private TextView resultTextView;
    private EditText FirstInputText,SecondInputText;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogoutButton = findViewById(R.id.logout);



        LogoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialogFragmentExample alertDialogFragmentExample = new AlertDialogFragmentExample();
                alertDialogFragmentExample.show(getSupportFragmentManager(),"Alert");
            }
        });

        CustomButton = findViewById(R.id.button_two);
        CustomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                View view = getLayoutInflater().inflate(R.layout.dialog_cutsom,null);
                builder.setView(view);
                FirstInputText = findViewById(R.id.first_input_text);
                SecondInputText = findViewById(R.id.second_input_text);
                resultTextView = findViewById(R.id.resultTextView);
//                SubmitButton = findViewById(R.id.submit_button);
//                SubmitButton.setOnClickListener(new View.OnClickListener() {
//                    @SuppressLint("SetTextI18n")
//                    @Override
//                    public void onClick(View v) {
//                        int firstnum = Integer.parseInt(FirstInputText.getText().toString().trim());
//                        int secondnum = Integer.parseInt(SecondInputText.getText().toString().trim());
//                        int sum = firstnum+secondnum;
//                        resultTextView.setText("resutl is "+sum);
//                    }
//                });

                builder.create().show();
            }
        });
    }
}

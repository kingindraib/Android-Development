package edu.divyagyan.geetingdatafromsecondactivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView ResultTextView;
    private Button NevigateTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ResultTextView = findViewById(R.id.result_text_view_editText);
        NevigateTextView = findViewById(R.id.navigate_button);

        NevigateTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    startActivityForResult(intent,201);
            }
        });
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 201 ){
//            && resultCode == RESULT_OK
            if(data !=null){
                String userName = data.getStringExtra("userName");
                    ResultTextView.setText("hello "+userName);
            }else{
                ResultTextView.setText("Usrname Not Found");
            }
        }
    }
}

package edu.divyagyan.listviewexampleall;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button simpleListviewButton, customListViewButton;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleListviewButton = findViewById(R.id.simple_list_view_button);
        simpleListviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SimpleListviewActivity.class);
                startActivity(intent);
            }
        });

        customListViewButton = findViewById(R.id.custom_list_view_button);
        customListViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this,CustomListViewActivity.class);
                startActivity(intent);
            }
        });
    }
}

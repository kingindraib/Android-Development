package edu.divyagyan.activitylifecycleexample;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getCanonicalName();
    private Button clickButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "this is log on create");
        clickButton = findViewById(R.id.click_btn);

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "this is log on start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "this is log on resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "this is log on pouse");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "this is log on restrt");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "this is log on stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "this is log on destroy");
    }
}

package edu.divyagyan.activitylifecycleexample;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getCanonicalName();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.i(TAG,"this is on create");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"this os distroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "this is on restart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "this is onpouse");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"this is stop ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "this is resueme");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG," this is start");
    }
}

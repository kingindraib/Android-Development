package edu.divyagyan.fagmentlifecycle;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private final String TAB = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAB,"on create view");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAB,"on start call");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAB,"on stop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAB,"on Resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAB,"on restart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAB,"on Pause ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAB,"on Destroy");
    }
}

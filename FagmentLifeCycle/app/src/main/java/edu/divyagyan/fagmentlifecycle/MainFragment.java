package edu.divyagyan.fagmentlifecycle;

import android.content.Context;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class MainFragment extends Fragment {
    private final String TAG = MainFragment.class.getSimpleName();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "On create method called Fragment");
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i(TAG,"attach method call fargment");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_main,container,false);
        return  view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG,"onactivity method create fragement");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG,"on start frgament");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG,"on resume in Fragement");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG,"on pouse in Frament");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG,"on stop in fargment");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"on destroy in Fargment");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG,"On detech on fragment");
    }
}

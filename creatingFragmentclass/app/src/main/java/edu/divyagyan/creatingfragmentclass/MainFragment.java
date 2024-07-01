package edu.divyagyan.creatingfragmentclass;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {

    private EditText firstNumberEditText,secondNumberEditText;
    private TextView resultTextView;
    private Button clickMeEdittext;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       firstNumberEditText = view.findViewById(R.id.first_number_editText);
       secondNumberEditText = view.findViewById(R.id.second_edit_text);
       clickMeEdittext = view.findViewById(R.id.click_button);
       resultTextView = view.findViewById(R.id.result_textView);

       clickMeEdittext.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString().trim());
               int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString().trim());

               int sum =calculate(firstNumber,secondNumber);
               resultTextView.setText("Result "+sum);
           }
       });
    }

    private int calculate(int firstnumber, int secondnumber){
        int sum = firstnumber+secondnumber;
        return sum;
    }
}

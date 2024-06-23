package edu.divyagyan.loginsignupexample;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class signupActivity extends AppCompatActivity {

    private EditText fullNameEditText,addrressEditTetx,phoneNumberEditText,passwordEditText;
    private RadioGroup genderRadioGroup;
    private Spinner countriesSpinner;
    private CheckBox termsConditionCheckbox;
    private Button signUpBtn;
    private String GenderSelected;
    private String countrySelect;
    private Boolean isCheckedTermscondition;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        fullNameEditText = findViewById(R.id.full_name_edit_text);
        addrressEditTetx = findViewById(R.id.address_edit_text);
        phoneNumberEditText = findViewById(R.id.phone_number_edit_text);
        passwordEditText = findViewById(R.id.password_edit_text);
        countriesSpinner = findViewById(R.id.countries_spinner);
        genderRadioGroup = findViewById(R.id.gener_radio_group);
        termsConditionCheckbox = findViewById(R.id.terms_condion_checkbox);
        signUpBtn = findViewById(R.id.sign_up_btn);


        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String fullName =fullNameEditText.getText().toString();
               String address = addrressEditTetx.getText().toString();
               String phone  = phoneNumberEditText.getText().toString();
               String password =  passwordEditText.getText().toString();
            }
        });

        genderRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.male_radio){
                    GenderSelected = "male";
                } else if (checkedId == R.id.female_radio) {
                    GenderSelected = "female";
                }else{
                    GenderSelected = "female";
                }
            }
        });

        countriesSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        termsConditionCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                isCheckedTermscondition =
            }
        });



    }
}

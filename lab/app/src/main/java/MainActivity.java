import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import edu.divyagyan.lab.R;

public class MainActivity extends AppCompatActivity {

    private EditText secondEdittext, firstEdittext;
     private Button submit;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstEdittext = findViewById(R.id.firstEdittext);
        secondEdittext = findViewById(R.id.secondEdittext);

        submit =findViewById(R.id.submit);
    }
}

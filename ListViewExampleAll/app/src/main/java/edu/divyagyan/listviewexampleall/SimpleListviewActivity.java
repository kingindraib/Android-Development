package edu.divyagyan.listviewexampleall;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SimpleListviewActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<String> arrayAdapter;
    private String[] datas = {"Ram","Shyam","Hari","Gita","Rita","Rahul"};
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simplelistview);

        listView = findViewById(R.id.simple_list_view);

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,datas);
//        arrayAdapter = new ArrayAdapter(this,R.layout.activity_simplelistview,android.R.id.text1,data);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SimpleListviewActivity.this,"Clicked "+datas[position],Toast.LENGTH_SHORT).show();
            }
        });

    }

}

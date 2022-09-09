package com.example.test_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Page_1 extends AppCompatActivity {

    TextView textView;
    Button Click_Button_Page_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        textView= (TextView) findViewById(R.id.id_tv_1);
        Click_Button_Page_1= (Button)findViewById(R.id.id_click_button_page_1);

        Click_Button_Page_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"This is Page-1",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
package com.example.test_1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.translation.ViewTranslationCallback;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ////for this page
    Button Button_Page_1,Button_Page_2;

    //For First Activity
    TextView textView_1;
    Button Click_Button_Page_1;

    //For Second Activity
    TextView textView_2;
    Button Click_Button_Page_2;

    LinearLayout layout;


    @RequiresApi(api = Build.VERSION_CODES.S)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Button ThisPageButton= (Button) findViewById(R.id.id_button);
//        ThisPageButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"Suvrodev Howlader",Toast.LENGTH_SHORT).show();
//            }
//        });

        /*===============================================================*/

        layout= (LinearLayout) findViewById(R.id.id_liear_layout);

        Button_Page_1= (Button) findViewById(R.id.id_Button_page_1);
        Button_Page_2= (Button) findViewById(R.id.id_Button_page_2);

        textView_1= (TextView) findViewById(R.id.id_tv_1);
        Click_Button_Page_1= (Button) findViewById(R.id.id_click_button_page_1);


        textView_1.setText("Page-1 from Main Activity");
        Click_Button_Page_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView_1.setText("Page-1 from Main Activity.......");
                textView_1.setBackgroundColor(Color.parseColor("#00FFFF"));
               //Here Set Background Color
                Toast.makeText(getApplicationContext(),"This is the button of\nPage-1\nexcess from mainactivity",Toast.LENGTH_SHORT).show();
            }
        });



        View view= LayoutInflater.from(this).inflate(R.layout.activity_page2,null);
        textView_2=view.findViewById(R.id.id_tv_2);
        Click_Button_Page_2=view.findViewById(R.id.id_click_button_page_2);

       // layout.setViewTranslationCallback((ViewTranslationCallback) view);
        layout.addView(view);

        textView_2.setText("Ok, This is Text view of 2nd Page");
        Click_Button_Page_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),textView_2.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });


        Button_Page_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Activity_Page_1.class);
                startActivity(intent);
            }
        });

        Button_Page_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Activity_Page_2.class);
                startActivity(intent);
            }
        });




    }
}
package com.itp.buttontest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button button,button2;
    EditText editText;
    TextView textView,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= (Button)findViewById(R.id.btn1);
        button2=(Button)findViewById(R.id.btn2);
        EditText editText =(EditText) findViewById(R.id.et1);
        TextView textView=(TextView) findViewById(R.id.txt1);
        TextView textView2=(TextView) findViewById(R.id.txt2);


       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

//              Toast.makeText(MainActivity.this, "Toast Message: "+editText.getText().toString(), Toast.LENGTH_SHORT).show();

            textView.setText(editText.getText().toString());

           }
       });

       button2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String str= editText.getText().toString();
               String rev="";
               for(int i=str.length()-1;i>=0;i--)
               {
                   rev=rev+str.charAt(i);
               }
               textView2.setText(rev);
           }
       });
    }


}
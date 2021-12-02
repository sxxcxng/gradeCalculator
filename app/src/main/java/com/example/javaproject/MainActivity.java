package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView tv1, tv2;
    EditText edit1, edit2, edit3;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("학점 계산기");
        init();
    }
    void init(){
        tv1 = (TextView)findViewById(R.id.textView);
        tv2 = (TextView)findViewById(R.id.textView2);

        edit1 = (EditText)findViewById(R.id.editText);
        edit2 = (EditText)findViewById(R.id.editText2);
        edit3 = (EditText)findViewById(R.id.editText3);

        imageView = (ImageView)findViewById(R.id.imageView);

    }
    public void click(View v){
        if(v.getId() == R.id.button){
            calculator();
            return;
        }else if(v.getId() == R.id.button2){
            reset();
            return;
        }
    }

    void reset(){
        edit1.setText("");
        edit2.setText("");
        edit3.setText("");

        tv1.setText("0점");
        tv2.setText("0점");

        imageView.setVisibility(View.GONE);

        edit1.requestFocus();
        Toast.makeText(getApplicationContext(),"초기화 되었습니다.", Toast.LENGTH_SHORT).show();
    }

    void calculator(){
        String s1, s2, s3;
        int sum, result;

        s1 = edit1.getText().toString();
        s2 = edit2.getText().toString();
        s3 = edit3.getText().toString();

        if(emptyCheck(s1, s2, s3)){
            edit1.setText("0");
            edit2.setText("0");
            edit3.setText("0");

            return;
        }

        sum = Integer.parseInt(s1) + Integer.parseInt(s2) + Integer.parseInt(s3);
        result = sum/3;

        tv1.setText(sum+"점");
        tv2.setText(result + "점");

        imageView.setVisibility(View.VISIBLE);

        if(result >= 90){
            imageView.setImageResource(R.drawable.alphabet_a);
        }else if(result >= 80){
            imageView.setImageResource(R.drawable.alphabet_b);
        }else if(result >= 70){
            imageView.setImageResource(R.drawable.alphabet_c);
        }else{
            imageView.setImageResource(R.drawable.alphabet_f);
        }

        return;
    }

    boolean emptyCheck(String s1, String s2, String s3){
        return s1 == null || s1.equals("") || s2 == null || s2.equals("") || s3 == null || s3.equals("");
    }
}

}
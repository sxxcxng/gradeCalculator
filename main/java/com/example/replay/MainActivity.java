package com.example.replay;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    EditText e2;
    EditText e3;
    EditText e4;
    EditText e5;
    EditText e6;
    EditText e7;
    EditText e8;

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;

    Button b1;

    private double score;
    private int credit;

    private Spinner spinner;
    private TextView tv_result;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("학점 계산기ㅣ");
        //전체뷰 xml파일 들고오기
        setContentView(R.layout.activity_main);

        //학점(1,2,3 학점)
        e1 = (EditText) findViewById(R.id.editText1);
        e2 = (EditText) findViewById(R.id.editText2);
        e3 = (EditText) findViewById(R.id.editText3);
        e4 = (EditText) findViewById(R.id.editText4);
        e5 = (EditText) findViewById(R.id.editText5);
        e6 = (EditText) findViewById(R.id.editText6);
        e7 = (EditText) findViewById(R.id.editText7);
        e8 = (EditText) findViewById(R.id.editText8);

        tv1 = (TextView) findViewById(R.id.textViewCal1);
        tv2 = (TextView) findViewById(R.id.textViewCal2);
        tv3 = (TextView) findViewById(R.id.textViewCal3);
        tv4 = (TextView) findViewById(R.id.textViewCal4);

        b1 = (Button) findViewById(R.id.button1);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        //text에 스피너 값이 string으로 가져와짐
        String score = spinner.getSelectedItem().toString();
        //int credit = editText1.get

        switch (score) {
            case "A+":
                this.score = 4.5;
            case "A0":
                this.score = 4.0;
            case "B+":
                this.score = 3.5;
            case "B0":
                this.score = 3.0;
            case "C+":
                this.score = 2.5;
            case "C0":
                this.score = 2.0;
            case "D+":
                this.score = 1.5;
            case "D0":
                this.score = 1.0;
            case "F":
                this.score = 0.0;
            default:
                this.score = 0.0;
        }

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                int result = Integer.parseInt(s1) * Integer.parseInt(score);
                tv1.setText(result);
            }
        });
    }
}






        /*CheckBox checkBox = (CheckBox) findViewById(R.id.check1) ;
        checkBox.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO : process the click event.
            }
        }); */
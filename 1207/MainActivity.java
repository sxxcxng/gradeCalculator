package com.example.replay;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText e[] = new EditText[8];
    private Spinner sp[] = new Spinner[8];
    private TextView tv[] = new TextView[4];
    private double score[] = new double[8];
    /*
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
*/
    double scoreNum;

    private int creditSum;
    private int creditAdd;
    private int result;

    private Spinner spinner;
    String[] test = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("학점 계산기");
        //전체뷰 xml파일 들고오기
        setContentView(R.layout.activity_main);

        //학점(1,2,3 학점)

        e[0] = (EditText) findViewById(R.id.editText1);
        e[1] = (EditText) findViewById(R.id.editText2);
        e[2] = (EditText) findViewById(R.id.editText3);
        e[3] = (EditText) findViewById(R.id.editText4);
        e[4] = (EditText) findViewById(R.id.editText5);
        e[5] = (EditText) findViewById(R.id.editText6);
        e[6] = (EditText) findViewById(R.id.editText7);
        e[7] = (EditText) findViewById(R.id.editText8);

        tv[0] = (TextView) findViewById(R.id.textViewCal1);
        tv[1] = (TextView) findViewById(R.id.textViewCal2);
        tv[2] = (TextView) findViewById(R.id.textViewCal3);
        tv[3] = (TextView) findViewById(R.id.textViewCal4);

        sp[0] = (Spinner) findViewById(R.id.spinner);
        sp[1] = (Spinner) findViewById(R.id.spinner1);
        sp[2] = (Spinner) findViewById(R.id.spinner2);
        sp[3] = (Spinner) findViewById(R.id.spinner3);
        sp[4] = (Spinner) findViewById(R.id.spinner4);
        sp[5] = (Spinner) findViewById(R.id.spinner5);
        sp[6] = (Spinner) findViewById(R.id.spinner6);
        sp[7] = (Spinner) findViewById(R.id.spinner7);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, test
        );
        // 드롭다운 클릭 시 선택 창
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // 스피너에 어댑터 설정
        sp[0].setAdapter(adapter);
/*
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                tv[0].setText(test[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
*/
        //text에 스피너 값이 string으로 가져와짐
        String score1 = sp[0].getSelectedItem().toString();
        String score2 = sp[1].getSelectedItem().toString();
        String score3 = sp[2].getSelectedItem().toString();
        String score4 = sp[3].getSelectedItem().toString();
        String score5 = sp[4].getSelectedItem().toString();
        String score6 = sp[5].getSelectedItem().toString();
        String score7 = sp[6].getSelectedItem().toString();
        String score8 = sp[7].getSelectedItem().toString();

        switch (score1) {
            case "A+":
                scoreNum = 4.5;
                break;
            case "A0":
                scoreNum = 4.0;
                break;
            case "B+":
                scoreNum = 3.5;
                break;
            case "B0":
                scoreNum = 3.0;
                break;
            case "C+":
                scoreNum = 2.5;
                break;
            case "C0":
                scoreNum = 2.0;
                break;
            case "D+":
                scoreNum = 1.5;
                break;
            case "D0":
                scoreNum = 1.0;
                break;
            case "F":
                scoreNum = 0.0;
                break;
        }

        switch (score2) {
            case "A+":
                scoreNum = 4.5;
                break;
            case "A0":
                scoreNum = 4.0;
                break;
            case "B+":
                scoreNum = 3.5;
                break;
            case "B0":
                scoreNum = 3.0;
                break;
            case "C+":
                scoreNum = 2.5;
                break;
            case "C0":
                scoreNum = 2.0;
                break;
            case "D+":
                scoreNum = 1.5;
                break;
            case "D0":
                scoreNum = 1.0;
                break;
            case "F":
                scoreNum = 0.0;
                break;
        }

        switch (score3) {
            case "A+":
                scoreNum = 4.5;
                break;
            case "A0":
                scoreNum = 4.0;
                break;
            case "B+":
                scoreNum = 3.5;
                break;
            case "B0":
                scoreNum = 3.0;
                break;
            case "C+":
                scoreNum = 2.5;
                break;
            case "C0":
                scoreNum = 2.0;
                break;
            case "D+":
                scoreNum = 1.5;
                break;
            case "D0":
                scoreNum = 1.0;
                break;
            case "F":
                scoreNum = 0.0;
                break;
        }

        switch (score4) {
            case "A+":
                scoreNum = 4.5;
                break;
            case "A0":
                scoreNum = 4.0;
                break;
            case "B+":
                scoreNum = 3.5;
                break;
            case "B0":
                scoreNum = 3.0;
                break;
            case "C+":
                scoreNum = 2.5;
                break;
            case "C0":
                scoreNum = 2.0;
                break;
            case "D+":
                scoreNum = 1.5;
                break;
            case "D0":
                scoreNum = 1.0;
                break;
            case "F":
                scoreNum = 0.0;
                break;
        }

        switch (score5) {
            case "A+":
                scoreNum = 4.5;
                break;
            case "A0":
                scoreNum = 4.0;
                break;
            case "B+":
                scoreNum = 3.5;
                break;
            case "B0":
                scoreNum = 3.0;
                break;
            case "C+":
                scoreNum = 2.5;
                break;
            case "C0":
                scoreNum = 2.0;
                break;
            case "D+":
                scoreNum = 1.5;
                break;
            case "D0":
                scoreNum = 1.0;
                break;
            case "F":
                scoreNum = 0.0;
                break;
        }

        switch (score6) {
            case "A+":
                scoreNum = 4.5;
                break;
            case "A0":
                scoreNum = 4.0;
                break;
            case "B+":
                scoreNum = 3.5;
                break;
            case "B0":
                scoreNum = 3.0;
                break;
            case "C+":
                scoreNum = 2.5;
                break;
            case "C0":
                scoreNum = 2.0;
                break;
            case "D+":
                scoreNum = 1.5;
                break;
            case "D0":
                scoreNum = 1.0;
                break;
            case "F":
                scoreNum = 0.0;
                break;
        }

        switch (score7) {
            case "A+":
                scoreNum = 4.5;
                break;
            case "A0":
                scoreNum = 4.0;
                break;
            case "B+":
                scoreNum = 3.5;
                break;
            case "B0":
                scoreNum = 3.0;
                break;
            case "C+":
                scoreNum = 2.5;
                break;
            case "C0":
                scoreNum = 2.0;
                break;
            case "D+":
                scoreNum = 1.5;
                break;
            case "D0":
                scoreNum = 1.0;
                break;
            case "F":
                scoreNum = 0.0;
                break;
        }

        switch (score8) {
            case "A+":
                scoreNum = 4.5;
                break;
            case "A0":
                scoreNum = 4.0;
                break;
            case "B+":
                scoreNum = 3.5;
                break;
            case "B0":
                scoreNum = 3.0;
                break;
            case "C+":
                scoreNum = 2.5;
                break;
            case "C0":
                scoreNum = 2.0;
                break;
            case "D+":
                scoreNum = 1.5;
                break;
            case "D0":
                scoreNum = 1.0;
                break;
            case "F":
                scoreNum = 0.0;
                break;
        }


        //button 클릭시 이벤트 처리
        Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e[0].getText().toString();
                String s2 = e[1].getText().toString();
                String s3 = e[2].getText().toString();
                String s4 = e[3].getText().toString();
                String s5 = e[4].getText().toString();
                String s6 = e[5].getText().toString();
                String s7 = e[6].getText().toString();
                String s8 = e[7].getText().toString();

                int creditSum = Integer.parseInt(s1) + Integer.parseInt(s2) + Integer.parseInt(s3) + Integer.parseInt(s4)
                        + Integer.parseInt(s5) + Integer.parseInt(s6) + Integer.parseInt(s7) + Integer.parseInt(s8);
                int result = Integer.parseInt(s1) * Integer.parseInt(score1) + Integer.parseInt(s2) * Integer.parseInt(score2)
                        + Integer.parseInt(s3) * Integer.parseInt(score3) + Integer.parseInt(s4) * Integer.parseInt(score4)
                        + Integer.parseInt(s5) * Integer.parseInt(score5) + Integer.parseInt(s6) * Integer.parseInt(score6)
                        + Integer.parseInt(s7) * Integer.parseInt(score7) + Integer.parseInt(s8) * Integer.parseInt(score8);
                int creditAdd = 130 - creditSum;

                tv[0].setText(result);
                tv[1].setText(result);
                tv[2].setText(creditSum);
                tv[3].setText(creditAdd);
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

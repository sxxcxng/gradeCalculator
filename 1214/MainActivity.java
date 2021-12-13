package com.example.replay;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int[] et = new int[9];
    double[] sn = new double[8];
    String[] selectedItemName = new String[8];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("학점 계산기");
        //전체뷰 activity_main.xml 파일 들고오기
        setContentView(R.layout.activity_main);

        /*
        ArrayAdapter gradeAdapter = ArrayAdapter.createFromResource(this, R.array.test, android.R.layout.simple_spinner_item);
        gradeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(gradeAdapter);
        */

    }



    //버튼 눌렀을 때
   public void gradeCal(View v) {
       Toast.makeText(this, "학점 계산이 완료됐습니다.", Toast.LENGTH_LONG).show();

       //editText1 id의 EditText를 받아서 editText1이라는 객체에 저장장
       EditText editText1 = (EditText) findViewById(R.id.editText1);
       EditText editText2 = (EditText) findViewById(R.id.editText2);
       EditText editText3 = (EditText) findViewById(R.id.editText3);
       EditText editText4 = (EditText) findViewById(R.id.editText4);
       EditText editText5 = (EditText) findViewById(R.id.editText5);
       EditText editText6 = (EditText) findViewById(R.id.editText6);
       EditText editText7 = (EditText) findViewById(R.id.editText7);
       EditText editText8 = (EditText) findViewById(R.id.editText8);
       EditText editText9 = (EditText) findViewById(R.id.editText9);

       et[0] = Integer.parseInt(editText1.getText().toString());
       et[1] = Integer.parseInt(editText2.getText().toString());
       et[2] = Integer.parseInt(editText3.getText().toString());
       et[3] = Integer.parseInt(editText4.getText().toString());
       et[4] = Integer.parseInt(editText5.getText().toString());
       et[5] = Integer.parseInt(editText6.getText().toString());
       et[6] = Integer.parseInt(editText7.getText().toString());
       et[7] = Integer.parseInt(editText8.getText().toString());
       et[8] = Integer.parseInt(editText9.getText().toString());

       Spinner spinner = (Spinner) findViewById(R.id.spinner);
       Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
       Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
       Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
       Spinner spinner4 = (Spinner) findViewById(R.id.spinner4);
       Spinner spinner5 = (Spinner) findViewById(R.id.spinner5);
       Spinner spinner6 = (Spinner) findViewById(R.id.spinner6);
       Spinner spinner7 = (Spinner) findViewById(R.id.spinner7);

       selectedItemName[0] = spinner.getSelectedItem().toString();
       selectedItemName[1] = spinner1.getSelectedItem().toString();
       selectedItemName[2] = spinner2.getSelectedItem().toString();
       selectedItemName[3] = spinner3.getSelectedItem().toString();
       selectedItemName[4] = spinner4.getSelectedItem().toString();
       selectedItemName[5] = spinner5.getSelectedItem().toString();
       selectedItemName[6] = spinner6.getSelectedItem().toString();
       selectedItemName[7] = spinner7.getSelectedItem().toString();

       ArrayAdapter<CharSequence> sp = ArrayAdapter.createFromResource(this, R.array.test, android.R.layout.simple_spinner_item);
       sp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       spinner.setAdapter(sp);

       for(int i=0; i<8; i++) {
           if (selectedItemName[i].equals("A+"))
               sn[i] = 4.5;
           else if (selectedItemName[i].equals("A0"))
               sn[i] = 4.0;
           else if (selectedItemName[i].equals("B+"))
               sn[i] = 3.5;
           else if (selectedItemName[i].equals("B0"))
               sn[i] = 3.0;
           else if (selectedItemName[i].equals("C+"))
               sn[i] = 2.5;
           else if (selectedItemName[i].equals("C0"))
               sn[i] = 2.0;
           else if (selectedItemName[i].equals("D+"))
               sn[i] = 1.5;
           else if (selectedItemName[i].equals("D0"))
               sn[i] = 1.0;
           else
               sn[i] = 0.0;
       }

       spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
           }
           @Override
           public void onNothingSelected(AdapterView<?> parent) {
           }
       });

       CheckBox checkBox = (CheckBox) findViewById(R.id.check);
       CheckBox checkBox1 = (CheckBox) findViewById(R.id.check1);
       CheckBox checkBox2 = (CheckBox) findViewById(R.id.check2);
       CheckBox checkBox3 = (CheckBox) findViewById(R.id.check3);
       CheckBox checkBox4 = (CheckBox) findViewById(R.id.check4);
       CheckBox checkBox5 = (CheckBox) findViewById(R.id.check5);
       CheckBox checkBox6 = (CheckBox) findViewById(R.id.check6);
       CheckBox checkBox7 = (CheckBox) findViewById(R.id.check7);


       double scoreNum2 = 0.0;
       int creditNum = 0;
       if(checkBox.isChecked() == true) {
           scoreNum2 += sn[0] * et[0];
           creditNum += et[0];
       }
       if(checkBox1.isChecked() == true) {
           scoreNum2 += sn[1] * et[1];
           creditNum += et[1];
       }
       if(checkBox2.isChecked() == true) {
           scoreNum2 += sn[2] * et[2];
           creditNum += et[2];
       }
       if(checkBox3.isChecked() == true) {
           scoreNum2 += sn[3] * et[3];
           creditNum += et[3];
       }
       if(checkBox4.isChecked() == true) {
           scoreNum2 += sn[4] * et[4];
           creditNum += et[4];
       }
       if(checkBox5.isChecked() == true) {
           scoreNum2 += sn[5] * et[5];
           creditNum += et[5];
       }
       if(checkBox6.isChecked() == true) {
           scoreNum2 += sn[6] * et[6];
           creditNum += et[6];
       }
       if(checkBox7.isChecked() == true) {
           scoreNum2 += sn[7] * et[7];
           creditNum += et[7];
       }
       double num2 = scoreNum2/creditNum;
       String num3 = String.format("%.2f", num2);

       int scoreNum3 = et[0] + et[1] + et[2] + et[3] + et[4] + et[5] + et[6] + et[7];
       double scoreNum1 = (et[0] * sn[0] + et[1] * sn[1] + et[2] * sn[2] + et[3] * sn[3]
               + et[4] * sn[4] + et[5] * sn[5] +et[6] * sn[6] + et[7] * sn[7]) / scoreNum3;
       int scoreNum4 = 130 - scoreNum3 - et[8];
       TextView textViewResult1 = (TextView) findViewById(R.id.textViewResult1);
       TextView textViewResult2 = (TextView) findViewById(R.id.textViewResult2);
       TextView textViewResult3 = (TextView) findViewById(R.id.textViewResult3);
       TextView textViewResult4 = (TextView) findViewById(R.id.textViewResult4);

       //textViewResult1.setText(Double.parseDouble(score1));
       String num = String.format("%.2f", scoreNum1);

       textViewResult1.setText("총 평점: " + num);
       textViewResult2.setText(" 전공 평점: " + num3);
       textViewResult3.setText("취득 학점: " + Integer.toString(scoreNum3));
       textViewResult4.setText("졸업까지 남은 학점: " + Integer.toString(scoreNum4));


    }
}
package com.example.replay;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double scoreNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("학점 계산기");
        //전체뷰 activity_main.xml 파일 들고오기
        setContentView(R.layout.activity_main);

    }


    //버튼 눌렀을 때
   public void gradeCal(View v) {
       Toast.makeText(this, "학점 계산이 완료됐습니다.", Toast.LENGTH_LONG).show();

       //editText0 id의 EditText를 받아서 editText0이라는 객체에 저장장
       EditText editText1 = (EditText) findViewById(R.id.editText1);
       EditText editText2 = (EditText) findViewById(R.id.editText2);
       EditText editText3 = (EditText) findViewById(R.id.editText3);
       EditText editText4 = (EditText) findViewById(R.id.editText4);
       EditText editText5 = (EditText) findViewById(R.id.editText5);
       EditText editText6 = (EditText) findViewById(R.id.editText6);
       EditText editText7 = (EditText) findViewById(R.id.editText7);
       EditText editText8 = (EditText) findViewById(R.id.editText8);

       int et1 = Integer.parseInt(editText1.getText().toString());
       int et2 = Integer.parseInt(editText2.getText().toString());
       int et3 = Integer.parseInt(editText3.getText().toString());
       int et4 = Integer.parseInt(editText4.getText().toString());
       int et5 = Integer.parseInt(editText5.getText().toString());
       int et6 = Integer.parseInt(editText6.getText().toString());
       int et7 = Integer.parseInt(editText7.getText().toString());
       int et8 = Integer.parseInt(editText8.getText().toString());

       //spinner값 string으로 가져오기
       Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
       String score1 = spinner1.getSelectedItem().toString();

       ArrayAdapter sp1 = ArrayAdapter.createFromResource(this, R.array.test, android.R.layout.simple_spinner_item);
       sp1.setDropDownViewResource((android.R.layout.simple_spinner_item));
       spinner1.setAdapter(sp1);


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


       TextView textViewResult1 = (TextView) findViewById(R.id.textViewResult1);
       TextView textViewResult2 = (TextView) findViewById(R.id.textViewResult2);
       TextView textViewResult3 = (TextView) findViewById(R.id.textViewResult3);
       TextView textViewResult4 = (TextView) findViewById(R.id.textViewResult4);

       //textViewResult1.setText(Double.parseDouble(score1));
       textViewResult3.setText(Integer.toString(et1 + et2 + et3 + et4 + et5 + et6 + et7 + et8));








       /*
        Intent intent = new Intent.ACTION_VIEW
        startActivity();
        */

    }
}

package com.example.ch04_calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1.자바 view객체를 만든다
        //2.자바 view 객체에 xml객체를 연결한다(바인딩한다)
        //3.자바 view 객체에 조작을 가한다(변경한다)

        //1.자바 view객체를 만든다
        EditText edt1, edt2;
        Button btn1, btn2, btn3, btn4;
        TextView tv1;

        //2.자바 view 객체에 xml객체를 연결한다(바인딩한다)
        edt1 = findViewById(R.id.Edit1);
        edt2 = findViewById(R.id.Edit2);

        btn1 = findViewById(R.id.BtnAdd);
        btn2 = findViewById(R.id.BtnSub);
        btn3 = findViewById(R.id.BtnMul);
        btn4 = findViewById(R.id.BtnDiv);

        tv1 = findViewById(R.id.TextResult);

        //3.자바 view 객체에 조작을 가한다(변경한다)
        //버튼을 눌렀을 때, 이벤트 처리
        //자바 view 객체에, 리스너객체를 연결한다. 먼저 리스너를 만들어야 한다.
        //자바객체.연결메소드(리스너1);
//        btn1.setOnTouchListener(리스너1);

        //방법1. 인터페이스를 상속받는(=구현하는) my클래스를 만든다
        class MyListener implements View.OnTouchListener
        {
            //추상메소드를 재정의 해줘야만 한다. 반드시
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                //더하기 버튼을 눌렀을 때, 할 일들을 코딩
                //1.에디트텍스트에서 값을 가져온다
                //2.가져온 값을 더한다.
                //3.더한결과를 텍스트뷰에 출력한다

                //1.에디트텍스트에서 값을 가져온다
                String str1 = edt1.getText().toString();//객체를 글자로 바꾼다
                String str2 = edt2.getText().toString();

                //2.가져온 값을 더한다.
                int n1 = Integer.parseInt(str1);//글자를 숫자로 바꾼다
                int n2 = Integer.parseInt(str2);
                int n3 = n1 + n2;

                //3.더한결과를 텍스트뷰에 출력한다
                tv1.setText("결과출력:"+n3);

                return false;
            }
        }

        //클래스로 객체를 만든다(생성한다)
        MyListener lis1 = new MyListener();

//        View.OnTouchListener lis1 = new View.OnTouchListener();

        btn1.setOnTouchListener(lis1);

        //방법2. My클래스를 만들지 않고, 바로 인터페이스로 객체 만들기(생성하기)\

        View.OnTouchListener lis2 = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                //1.에디트텍스트에서 값을 가져온다
                String str1 = edt1.getText().toString();//객체를 글자로 바꾼다
                String str2 = edt2.getText().toString();

                //2.가져온 값을 뺀다.
                int n1 = Integer.parseInt(str1);//글자를 숫자로 바꾼다
                int n2 = Integer.parseInt(str2);
                int n3 = n1 - n2;

                //3.더한결과를 텍스트뷰에 출력한다
                tv1.setText("결과출력:"+n3);
                return false;
            }
        };
        
        btn2.setOnTouchListener(lis2);

        //방법3. 객체조차도 따로 만들지 않겠다. 바로 쓰겠다.
        btn3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                //1.에디트텍스트에서 값을 가져온다
                String str1 = edt1.getText().toString();//객체를 글자로 바꾼다
                String str2 = edt2.getText().toString();

                //2.가져온 값을 곱한다.
                int n1 = Integer.parseInt(str1);//글자를 숫자로 바꾼다
                int n2 = Integer.parseInt(str2);
                int n3 = n1 * n2;

                //3.더한결과를 텍스트뷰에 출력한다
                tv1.setText("결과출력:"+n3);
                return false;
            }
        });

        //방법3. 객체조차도 따로 만들지 않겠다. 바로 쓰겠다.
        btn4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                //1.에디트텍스트에서 값을 가져온다
                String str1 = edt1.getText().toString();//객체를 글자로 바꾼다
                String str2 = edt2.getText().toString();

                //2.가져온 값을 나눈다.
                int n1 = Integer.parseInt(str1);//글자를 숫자로 바꾼다
                int n2 = Integer.parseInt(str2);
                int n3 = n1 / n2;

                //3.더한결과를 텍스트뷰에 출력한다
                tv1.setText("결과출력:"+n3);
                return false;
            }
        });




    }
}
package com.example.ch04_calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main_table_layout);

        //1.자바 view객체를 만든다
        //2.자바 view 객체에 xml객체를 연결한다(바인딩한다)
        //3.자바 view 객체에 조작을 가한다(변경한다)

        //1.자바 view객체를 만든다
        EditText edt1, edt2;
        Button btn1, btn2, btn3, btn4;
        Button btn5;
        TextView tv1;

        //2.자바 view 객체에 xml객체를 연결한다(바인딩한다)
        edt1 = findViewById(R.id.Edit1);
        edt2 = findViewById(R.id.Edit2);

        btn1 = findViewById(R.id.BtnAdd);
        btn2 = findViewById(R.id.BtnSub);
        btn3 = findViewById(R.id.BtnMul);
        btn4 = findViewById(R.id.BtnDiv);
        btn5 = findViewById(R.id.BtnMod);

        tv1 = findViewById(R.id.TextResult);

//        Button btn00 = findViewById(R.id.BtnNum0);
//        Button btn01 = findViewById(R.id.BtnNum1);
//        Button btn02 = findViewById(R.id.BtnNum2);
//        Button btn03 = findViewById(R.id.BtnNum3);
//        Button btn04 = findViewById(R.id.BtnNum4);
//        Button btn05 = findViewById(R.id.BtnNum5);
//        Button btn06 = findViewById(R.id.BtnNum6);
//        Button btn07 = findViewById(R.id.BtnNum7);
//        Button btn08 = findViewById(R.id.BtnNum8);
//        Button btn09 = findViewById(R.id.BtnNum9);

        int btnID_arr[] = {R.id.BtnNum0, R.id.BtnNum1, R.id.BtnNum2, R.id.BtnNum3, R.id.BtnNum4,
                           R.id.BtnNum5, R.id.BtnNum6, R.id.BtnNum7, R.id.BtnNum8, R.id.BtnNum8};

        Button btnArr[] = new Button[10];

        for(int i=0; i<btnArr.length;++i) {
//            btnArr[i] = findViewById(R.id.BtnNum+i);
            btnArr[i] = findViewById(btnID_arr[i]);
        }

//        btnArr[0] = findViewById(R.id.BtnNum0);
//        btnArr[1] = findViewById(R.id.BtnNum1);
//        btnArr[2] = findViewById(R.id.BtnNum2);
//        btnArr[3] = findViewById(R.id.BtnNum3);
//        btnArr[4] = findViewById(R.id.BtnNum4);
//        btnArr[5] = findViewById(R.id.BtnNum5);
//        btnArr[6] = findViewById(R.id.BtnNum6);
//        btnArr[7] = findViewById(R.id.BtnNum7);
//        btnArr[8] = findViewById(R.id.BtnNum8);
//        btnArr[9] = findViewById(R.id.BtnNum9);

        for(int i=0; i<btnArr.length;++i)
        {
            int finalI = i;
            btnArr[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (edt1.isFocused())//에딧1에 포커스가 있을때
                    {
                        String str1 = edt1.getText().toString() + finalI;
                        edt1.setText(str1);
                    } else if (edt2.isFocused())//에딧2에 포커스가 있을때
                    {
                        String str1 = edt2.getText().toString() + 2;
                        edt2.setText(str1);

                    } else {
                        Toast.makeText(getApplicationContext(), "에디트를 선택해주세요!", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

//        btnArr[0].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(edt1.isFocused())//에딧1에 포커스가 있을때
//                {
//                    String str1 = edt1.getText().toString() + "0";
//                    edt1.setText(str1);
//                }
//                else if(edt2.isFocused())//에딧2에 포커스가 있을때
//                {
//                    String str1 = edt2.getText().toString() + "0";
//                    edt2.setText(str1);
//
//                }
//                else
//                {
//                    Toast.makeText(getApplicationContext(),"에디트를 선택해주세요!",Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        btnArr[1].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(edt1.isFocused())//에딧1에 포커스가 있을때
//                {
//                    String str1 = edt1.getText().toString() + "1";
//                    edt1.setText(str1);
//                }
//                else if(edt2.isFocused())//에딧2에 포커스가 있을때
//                {
//                    String str1 = edt2.getText().toString() + "1";
//                    edt2.setText(str1);
//
//                }
//            }
//        });
//        btnArr[2].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(edt1.isFocused())//에딧1에 포커스가 있을때
//                {
//                    String str1 = edt1.getText().toString() + "2";
//                    edt1.setText(str1);
//                }
//                else if(edt2.isFocused())//에딧2에 포커스가 있을때
//                {
//                    String str1 = edt2.getText().toString() + "2";
//                    edt2.setText(str1);
//
//                }
//            }
//        });
//        btnArr[3].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(edt1.isFocused())//에딧1에 포커스가 있을때
//                {
//                    String str1 = edt1.getText().toString() + "3";
//                    edt1.setText(str1);
//                }
//                else if(edt2.isFocused())//에딧2에 포커스가 있을때
//                {
//                    String str1 = edt2.getText().toString() + "3";
//                    edt2.setText(str1);
//
//                }
//            }
//        });
//        btnArr[4].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(edt1.isFocused())//에딧1에 포커스가 있을때
//                {
//                    String str1 = edt1.getText().toString() + "4";
//                    edt1.setText(str1);
//                }
//                else if(edt2.isFocused())//에딧2에 포커스가 있을때
//                {
//                    String str1 = edt2.getText().toString() + "4";
//                    edt2.setText(str1);
//
//                }
//            }
//        });
//        btnArr[5].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(edt1.isFocused())//에딧1에 포커스가 있을때
//                {
//                    String str1 = edt1.getText().toString() + "5";
//                    edt1.setText(str1);
//                }
//                else if(edt2.isFocused())//에딧2에 포커스가 있을때
//                {
//                    String str1 = edt2.getText().toString() + "5";
//                    edt2.setText(str1);
//
//                }
//            }
//        });
//        btnArr[6].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(edt1.isFocused())//에딧1에 포커스가 있을때
//                {
//                    String str1 = edt1.getText().toString() + "6";
//                    edt1.setText(str1);
//                }
//                else if(edt2.isFocused())//에딧2에 포커스가 있을때
//                {
//                    String str1 = edt2.getText().toString() + "6";
//                    edt2.setText(str1);
//
//                }
//            }
//        });
//        btnArr[7].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(edt1.isFocused())//에딧1에 포커스가 있을때
//                {
//                    String str1 = edt1.getText().toString() + "7";
//                    edt1.setText(str1);
//                }
//                else if(edt2.isFocused())//에딧2에 포커스가 있을때
//                {
//                    String str1 = edt2.getText().toString() + "7";
//                    edt2.setText(str1);
//
//                }
//            }
//        });
//        btnArr[8].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(edt1.isFocused())//에딧1에 포커스가 있을때
//                {
//                    String str1 = edt1.getText().toString() + "8";
//                    edt1.setText(str1);
//                }
//                else if(edt2.isFocused())//에딧2에 포커스가 있을때
//                {
//                    String str1 = edt2.getText().toString() + "8";
//                    edt2.setText(str1);
//
//                }
//            }
//        });
//        btnArr[9].setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(edt1.isFocused())//에딧1에 포커스가 있을때
//                {
//                    String str1 = edt1.getText().toString() + "9";
//                    edt1.setText(str1);
//                }
//                else if(edt2.isFocused())//에딧2에 포커스가 있을때
//                {
//                    String str1 = edt2.getText().toString() + "9";
//                    edt2.setText(str1);
//
//                }
//            }
//        });




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
//        btn4.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                //1.에디트텍스트에서 값을 가져온다
//                String str1 = edt1.getText().toString();//객체를 글자로 바꾼다
//                String str2 = edt2.getText().toString();
//
//                //2.가져온 값을 나눈다.
//                int n1 = Integer.parseInt(str1);//글자를 숫자로 바꾼다
//                int n2 = Integer.parseInt(str2);
//                int n3 = n1 / n2;
//
//                //3.더한결과를 텍스트뷰에 출력한다
//                tv1.setText("결과출력:"+n3);
//                return false;
//            }
//        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //1.에디트텍스트에서 값을 가져온다
                String str1 = edt1.getText().toString();//객체를 글자로 바꾼다
                String str2 = edt2.getText().toString();

                if(str1.equals("") || str2.equals(""))//에디트 둘 중에 하나라도 값이 없으면
                {
                    Toast.makeText(MainActivity.this, "값없음!", Toast.LENGTH_SHORT).show();
                }
                else //그렇지 않고 둘다 값이 있으면
                {
                    if(str2.equals("0"))
                    {
                        Toast.makeText(MainActivity.this, "0으로 나눌 수 없음!", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        //2.가져온 값을 나눈다.
                        double n1 = Double.parseDouble(str1);
                        double n2 = Double.parseDouble(str2);
                        double n3 = n1 / n2;
                        n3 = ((int)(n3 *100))/100.0;

                        //3.더한결과를 텍스트뷰에 출력한다
                        tv1.setText("결과출력:" + n3);
                    }
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //1.에디트텍스트에서 값을 가져온다
                String str1 = edt1.getText().toString();//객체를 글자로 바꾼다
                String str2 = edt2.getText().toString();

                if(str1.equals("") || str2.equals(""))//에디트 둘 중에 하나라도 값이 없으면
                {
                    Toast.makeText(MainActivity.this, "값없음!", Toast.LENGTH_SHORT).show();
                }
                else //그렇지 않고 둘다 값이 있으면
                {
                    //2.가져온 값을 나눈다.
//                    int n1 = Integer.parseInt(str1);//글자를 숫자로 바꾼다
//                    int n2 = Integer.parseInt(str2);
//                    int n3 = n1 % n2;
                    double n1 = Double.parseDouble(str1);
                    double n2 = Double.parseDouble(str2);
                    double n3 = n1 % n2;

                    //3.더한결과를 텍스트뷰에 출력한다
                    tv1.setText("결과출력:"+n3);
                }

            }
        });




    }
}
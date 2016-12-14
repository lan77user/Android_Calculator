package com.sqsf.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnplus, btndivide, btnminus, btnmul,btnbackspace,btndelete,btnamount;
    public EditText editText;
    public TextView textView;
    public String opt = "+";//操作符
    public double n1 = 0.0, n2 = 0.0;//两个操作数

    public View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            editText = (EditText) findViewById(R.id.edit_text);
            textView = (TextView) findViewById(R.id.textView1);
            String s = editText.getText().toString();

            Button btn = (Button) v;

            try {
                switch (btn.getId()) {

                    case R.id.backspace://回退
                    {
                        String str = editText.getText().toString();
                        if (str.length() > 0)
                        {
                            editText.setText(str.substring(0, str.length() - 1));
                        }
                        else if(str.length() == 0)
                        {
                            editText.setText("");
                        }
                        break;
                    }
                    case R.id.delete://清除
                    {
                        String str = editText.getText().toString();
                        if (str.length() > 0)
                            editText.setText("");
                        break;
                    }


                    case R.id.btn1://1
                    {
                        String str = editText.getText().toString();
                        editText.setText(str + 1);
                        str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.btn2://2
                    {
                        String str = editText.getText().toString();
                        editText.setText(str + 2);
                        str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.btn3://3
                    {
                        editText.setText(editText.getText().toString() + 3);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.btn4://4
                    {
                        editText.setText(editText.getText().toString() + 4);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.btn5://5
                    {
                        editText.setText(editText.getText().toString() + 5);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.btn6://6
                    {
                        editText.setText(editText.getText().toString() + 6);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.btn7://7
                    {
                        editText.setText(editText.getText().toString() + 7);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.btn8://8
                    {
                        editText.setText(editText.getText().toString() + 8);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.btn9://9
                    {
                        editText.setText(editText.getText().toString() + 9);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }
                    case R.id.btn0://0
                    {
                        textView.setText(n1 + opt + 10);
                        editText.setText(editText.getText().toString() + 0);
                        String str = editText.getText().toString();
                        textView.setText(str);
                        break;
                    }



                    case R.id.btn_plus://+
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        opt = "+";
                        textView.setText(n1 + opt);
                        editText.setText("");
                        break;
                    }
                    case R.id.btn_minus://操作符-
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        opt = "-";
                        editText.setText("");
                        textView.setText(n1 + opt);
                        break;
                    }
                    case R.id.mul://操作符*
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        opt = "*";
                        editText.setText("");
                        textView.setText(n1 + opt);
                        break;
                    }
                    case R.id.divide://操作符 /
                    {
                        String str = editText.getText().toString();
                        n1 = Double.parseDouble(str);
                        opt = "/";
                        editText.setText("");
                        textView.setText(n1 + opt);
                        break;
                    }


                    case R.id.point://.小数点
                    {
                        String str = editText.getText().toString();
                        if (str.indexOf(".") != -1) //判断字符串中是否已经包含了小数点，如果有就什么也不做
                        {
                        } else //如果没有小数点
                        {
                            if (str.equals("0"))//如果开始为0，
                                editText.setText(("0" + ".").toString());
                            else if (str.equals(""))//如果初时显示为空，就什么也不做
                            {
                            } else
                                editText.setText(str + ".");
                        }
                        break;
                    }
                    case R.id.amount://操作符=
                    {
                        if (opt == "+") {
                            String str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            textView.setText(n1 + opt + n2 + "=");
                            editText.setText((n1 + n2) + "");
                        } else if (opt == "-") {
                            String str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            textView.setText(n1 + opt + n2 + "=");
                            editText.setText((n1 - n2) + "");
                        } else if (opt == "*") {
                            String str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            textView.setText(n1 + opt + n2 + "=");
                            editText.setText((n1 * n2) + "");
                        } else if (opt == "/") {
                            String str = editText.getText().toString();
                            n2 = Double.parseDouble(str);
                            if (n2 == 0) {
                                editText.setText("");
                                textView.setText("除数不能为0");
                                break;
                            } else {
                                textView.setText(n1 + opt + n2 + "=");
                                editText.setText((n1 / n2) + "");
                            }
                        }
                        break;
                    }

                }
            } catch (Exception e) {
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//


        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btnplus = (Button) findViewById(R.id.btn_plus);
        btndivide = (Button) findViewById(R.id.divide);
        btnminus = (Button) findViewById(R.id.btn_minus);
        btnmul = (Button) findViewById(R.id.mul);
        btnbackspace = (Button) findViewById(R.id.backspace);
        btndelete = (Button) findViewById(R.id.delete);
        btnamount = (Button)findViewById(R.id.amount);


        btn0.setOnClickListener(listener);
        btn1.setOnClickListener(listener);
        btn2.setOnClickListener(listener);
        btn3.setOnClickListener(listener);
        btn4.setOnClickListener(listener);
        btn5.setOnClickListener(listener);
        btn6.setOnClickListener(listener);
        btn7.setOnClickListener(listener);
        btn8.setOnClickListener(listener);
        btn9.setOnClickListener(listener);
        btnplus.setOnClickListener(listener);
        btnminus.setOnClickListener(listener);
        btndivide.setOnClickListener(listener);
        btnmul.setOnClickListener(listener);
        btndelete.setOnClickListener(listener);
        btnbackspace.setOnClickListener(listener);
        btnamount.setOnClickListener(listener);


    }
}
//int 和String类型之间的转化
//        int a = 5;
//        String str1 = ""+ a;
//    }


//    public void buttonClick(View v){
//        if (R.id.btn1)
//    }

//    button.setOnClickListener(new OnClickListener() {
//        @Override
//        public void onClick(View v) {
//
//        }
//    }
//    );
//}

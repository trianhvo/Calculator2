package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button[] numberButtons;
    public TextView textView;
    Button one, two, three, four, five, six, seven, eight, nine, zero, C, CE, add, sub, mul, div, equal, BS, lunisolar;
    int currValue = 0;
    int mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        C = (Button) findViewById(R.id.C);
        CE = (Button) findViewById(R.id.CE);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        equal = (Button) findViewById(R.id.equal);
        BS = (Button) findViewById(R.id.BS);
        lunisolar = (Button) findViewById(R.id.lunisolar);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence currTextView = textView.getText();
                if (currTextView.equals("0")) {
                    textView.setText("1");
                } else {
                    textView.setText(currTextView + "1");
                }
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence currTextView = textView.getText();
                if (currTextView.equals("0")) {
                    textView.setText("2");
                } else {
                    textView.setText(currTextView + "2");
                }
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence currTextView = textView.getText();
                if (currTextView.equals("0")) {
                    textView.setText("3");
                } else {
                    textView.setText(currTextView + "3");
                }
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence currTextView = textView.getText();
                if (currTextView.equals("0")) {
                    textView.setText("4");
                } else {
                    textView.setText(currTextView + "4");
                }
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence currTextView = textView.getText();
                if (currTextView.equals("0")) {
                    textView.setText("5");
                } else {
                    textView.setText(currTextView + "5");
                }
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence currTextView = textView.getText();
                if (currTextView.equals("0")) {
                    textView.setText("6");
                } else {
                    textView.setText(currTextView + "6");
                }
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence currTextView = textView.getText();
                if (currTextView.equals("0")) {
                    textView.setText("7");
                } else {
                    textView.setText(currTextView + "7");
                }
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence currTextView = textView.getText();
                if (currTextView.equals("0")) {
                    textView.setText("8");
                } else {
                    textView.setText(currTextView + "8");
                }
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence currTextView = textView.getText();
                if (currTextView.equals("0")) {
                    textView.setText("9");
                } else {
                    textView.setText(currTextView + "9");
                }
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence currTextView = textView.getText();
                if (currTextView.equals("0")) {
                    textView.setText("0");
                } else {
                    textView.setText(currTextView + "0");
                }
            }
        });

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("0");
            }
        });

        CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currValue = 0;
                textView.setText("0");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currValue = Integer.parseInt(textView.getText().toString());
                mode = 0;
                textView.setText("0");
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currValue = Integer.parseInt(textView.getText().toString());
                mode = 1;
                textView.setText("0");
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currValue = Integer.parseInt(textView.getText().toString());
                mode = 2;
                textView.setText("0");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currValue = Integer.parseInt(textView.getText().toString());
                mode = 3;
                textView.setText("0");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int secondValue = Integer.parseInt(textView.getText().toString());
                int result;
                switch (mode) {
                    case 0:
                        result = currValue + secondValue;
                        textView.setText(String.valueOf(result));
                        currValue = result;
                        break;

                    case 1:
                        result = currValue - secondValue;
                        textView.setText(String.valueOf(result));
                        currValue = result;
                        break;

                    case 2:
                        result = currValue * secondValue;
                        textView.setText(String.valueOf(result));
                        currValue = result;
                        break;

                    case 3:
                        if (secondValue == 0) {
                            currValue = 0;
                            textView.setText("0");
                        } else {
                            result = currValue / secondValue;
                            textView.setText(String.valueOf(result));
                            currValue = result;
                        }
                        break;
                    default:
                        break;
                }
            }
        });

        BS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer currTextView = new StringBuffer(textView.getText().toString());
                currTextView.deleteCharAt(currTextView.length() - 1);
                textView.setText(currTextView);
            }
        });

        lunisolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currTextView = Integer.parseInt(textView.getText().toString());
                textView.setText(String.valueOf(0 - currTextView));
            }
        });


    }

    }

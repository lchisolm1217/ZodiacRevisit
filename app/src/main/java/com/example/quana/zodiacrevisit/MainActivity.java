package com.example.quana.zodiacrevisit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    //static Scanner scanner = new Scanner(System.in);
    EditText text;
    EditText text2;
    TextView zodiac;
    static int m;
    static int d;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText) findViewById(R.id.numberMonth);
        text2 = (EditText) findViewById(R.id.numberDay);
        zodiac = (TextView) findViewById(R.id.zodiac);


        final Button button = findViewById(R.id.buttonResult);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String date = text2.getText().toString();
                String month = text.getText().toString();
                m = 0;
                d = 0;

                m = Integer.parseInt(month);
                d = Integer.parseInt(date);


                Log.d("date", date);
                Log.d("month", month);

                determineSign(m, d);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();



    }

    public void determineSign(int month, int day) {

        String zodiacSign = "";

        switch (month) {
            case 1:
                if (day <= 19) {
                    zodiacSign = "Capricorn";
                } else {
                    zodiacSign = "Aquarius";
                }
                break;
            case 2:
                if (day <= 18) {
                    zodiacSign = "Aquarius";
                } else {
                    zodiacSign = "Pisces";
                }
                break;
            case 3:
                if (day <= 19) {
                    zodiacSign = "Pisces";
                } else {
                    zodiacSign = "Aries";
                }
                break;
            case 4:
                if (day <= 19) {
                    zodiacSign = "Aries";
                } else {
                    zodiacSign = "Taurus";
                }
                break;
            case 5:
                if (day <= 20) {
                    zodiacSign = "Taurus";
                } else {
                    zodiacSign = "Gemini";
                }
                break;
            case 6:
                if (day <= 20) {
                    zodiacSign = "Gemini";
                } else {
                    zodiacSign = "Cancer";
                }
                break;
            case 7:
                if (day <= 22) {
                    zodiacSign = "Cancer";
                } else {
                    zodiacSign = "Leo";
                }
                break;
            case 8:
                if (day <= 22) {
                    zodiacSign = "Leo";
                } else {
                    zodiacSign = "Virgo";
                }
                break;
            case 9:
                if (day <= 22) {
                    zodiacSign = "Virgo";
                } else {
                    zodiacSign = "Libra";
                }
                break;
            case 10:
                if (day <= 22) {
                    zodiacSign = "Libra";
                } else {
                    zodiacSign = "Scorpio";
                }
                break;
            case 11:
                if (day <= 21) {
                    zodiacSign = "Scorpio";
                } else {
                    zodiacSign = "Sagittarius";
                }
                break;
            case 12:
                if (day <= 21) {
                    zodiacSign = "Sagittarius";
                } else {
                    zodiacSign = "Capricorn";
                }
                break;
        }

        Log.d("tag", zodiacSign);

        zodiac.setText(zodiacSign);
    }

}



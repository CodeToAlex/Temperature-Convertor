package com.example.temperatureconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    private EditText cel, kel, fehr;
    String celsius, kelvin, fehrenheit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cel = findViewById(R.id.editTextCelsius);
        kel = findViewById(R.id.editTextKelvin);
        fehr = findViewById(R.id.editTextFahreinheit);

        cel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kel.setText("");
                fehr.setText("");
            }
        });

        kel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cel.setText("");
                fehr.setText("");
            }
        });

        fehr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kel.setText("");
                cel.setText("");
            }
        });


        mButton = findViewById(R.id.buttonConvert);
        mButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view)
            {
                celsius = cel.getText().toString();
                kelvin = kel.getText().toString();
                fehrenheit = fehr.getText().toString();
                ConvertTemp cv = new ConvertTemp();

                if(celsius != "" && kelvin.equals("") && fehrenheit.equals("")) {
                    kel.setText("" + cv.celsiusToKelvin(Double.parseDouble(celsius)));
                    fehr.setText("" + cv.celsiusToFahrenheit(Double.parseDouble(celsius)));
                } else if(celsius.equals("") && kelvin != "" && fehrenheit.equals("")) {
                    cel.setText("" + cv.kelvinToCelsius(Double.parseDouble(kelvin)));
                    fehr.setText("" + cv.kelvinToFehrenit(Double.parseDouble(kelvin)));
                } else if(celsius.equals("") && kelvin.equals("") && fehrenheit != "") {
                    cel.setText("" + cv.fehrToCelsius(Double.parseDouble(fehrenheit)));
                    kel.setText("" + cv.fehrToKelvin(Double.parseDouble(fehrenheit)));
                }
            }
        });
    }
}
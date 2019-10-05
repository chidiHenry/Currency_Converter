package com.chidi_pc.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CalcculatorActivity extends AppCompatActivity {

    Button convertButton;
    TextView rateView, EuroView,convertCur_tv, convertedFigure,rateFin;
    EditText rateFigure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcculator);

        convertButton = (Button)findViewById(R.id.convertFromEuroButton);
        rateView = (TextView)findViewById(R.id.rateView) ;
        EuroView =(TextView) findViewById(R.id.EUR_tv);
        convertCur_tv = (TextView) findViewById(R.id.ConvertedCur_tv);
        convertedFigure = (TextView) findViewById(R.id.ConvertedFigure_tv);

        rateFigure = (EditText)findViewById(R.id.rateFigure_ed);
        rateFin = (TextView) findViewById(R.id.rateFin);

         String currencyName = getIntent().getStringExtra("CurrencyName");
        final Double currencyRate = getIntent().getDoubleExtra("Rate",0);
        rateFin.setText(currencyName);

        rateView.setText("1:   "+currencyRate);

        convertCur_tv.setText(currencyName);

        // String typedRate =  rateFigure.getText().toString();

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rateFigure.getText().toString().length()==0){
                    return;
                }

                double inputAmount;
                try
                {
                    inputAmount = Double.parseDouble(rateFigure.getText().toString());
                }
                catch (NumberFormatException e){
                    rateFigure.setText("");
                    return;
                }
              double outPutAmount = inputAmount * currencyRate;

                DecimalFormat decimalFormat = new DecimalFormat("#,###.##");
                convertedFigure.setText(decimalFormat.format(outPutAmount));








            }
        });




    }
}

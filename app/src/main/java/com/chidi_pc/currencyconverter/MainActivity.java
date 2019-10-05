package com.chidi_pc.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements Callback<CurrencyExchange>{

TextView baseCurrencyText1, baseCurrencyText2, convertedCurrencyText2,convertedCurrencyText1;
Spinner baseCurrencySpinner, convertedCurrencySpinner;
Button convert;
Currency currency;
private List<Currency> currencyList;
Context ctx;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadExchangeRate();
        baseCurrencyText1 = (TextView) findViewById(R.id.baseCurrencytext1);
        baseCurrencyText2 = (TextView)findViewById(R.id.baseCurrencytext2) ;
        convertedCurrencyText2 = (TextView) findViewById(R.id.ConvertedCurrencytext2);
        convertedCurrencyText1 = (TextView) findViewById(R.id.ConvertedCurrencytext1);
        baseCurrencySpinner = (Spinner) findViewById(R.id.baseCurrency);
        convertedCurrencySpinner =(Spinner) findViewById(R.id.convertedCurrency);
        convert = (Button) findViewById(R.id.convertButton);
        //custom context object for testing and error handling in Toasts
        ctx = getApplicationContext();

    }

    @Override
    protected void onStart() {
        super.onStart();

        loadExchangeRate();
    }
     //Retrofit HTTP Call
    private void loadExchangeRate(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://data.fixer.io/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CurrencyExchangeInterface service = retrofit.create(CurrencyExchangeInterface.class);
        Call<CurrencyExchange> call =service.loadCurrencyExchange();
        call.enqueue(this);
    }
      //Call back for CurrencyExchange Interface
    @Override
    public void onResponse(Call<CurrencyExchange> call, Response<CurrencyExchange> response) {
       //Toast.makeText(this, response.body().getBase(),Toast.LENGTH_LONG).show();
        // Get Currency to Convert and Set it to Converted Currency Spinner
        final CurrencyExchange currencyExchange = response.body();

        ArrayAdapter<Currency> adapter = new ArrayAdapter<Currency>(this, android.R.layout.simple_spinner_item, currencyExchange.getCurrency());
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        convertedCurrencySpinner.setAdapter(adapter);




        convertedCurrencySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              // String myItem =  parent.getItemAtPosition(position).toString();
                Currency c = (Currency)parent.getItemAtPosition(position);
               convertedCurrencyText1.setText(Double.toString(c.getRate()));

                final String selectedName = c.getName();
                final Double selectedRate = c.getRate();
                //convertedCurrencyText1.setText(selectedRate).toString();
                convertedCurrencyText2.setText(selectedName);

                convert.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(ctx, CalcculatorActivity.class);
                        intent.putExtra("CurrencyName", selectedName);
                        intent.putExtra("Rate", selectedRate);

                        startActivity(intent);

                    }
                });
               // convertedCurrencyText1.setText();

              Toast.makeText(ctx,selectedName,Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //Get Base Currency and Set it to Base Currency Spinner
        String baseCurrency = currencyExchange.getBase();
        String [] baseArray = new String[]{baseCurrency};
        ArrayAdapter<String> baseAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,baseArray);
        baseCurrencySpinner.setAdapter(baseAdapter);

      //  baseCurrencyText2.setText(currencyExchange.getBase());

    }

    @Override
    public void onFailure(Call<CurrencyExchange> call, Throwable t) {

        //Toast to get error message
        Toast.makeText(this,t.getMessage(),Toast.LENGTH_LONG).show();


    }

   }

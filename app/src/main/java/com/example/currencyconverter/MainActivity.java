package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){


        EditText editText = findViewById(R.id.editText);
        String amountInPounds = editText.getText().toString();

        double amountInPoundsDouble = Double.parseDouble(amountInPounds);
        double amountInDollarsDouble = amountInPoundsDouble *1.3;

        String amountInDollarsString = String.format("%.2f", amountInDollarsDouble);
        Log.i("Amount in dollars",amountInDollarsString );
        Toast.makeText(this, "\u00a3" + amountInPounds + " is $" + amountInDollarsString, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

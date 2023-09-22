package com.example.gasapp;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gasapp.model.Fuel;
import com.example.gasapp.util.CalculateDiff;

public class MainActivity extends AppCompatActivity {

    private Fuel fuel;
    private TextView textViewMessage;
    private EditText edtGas, edtEth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtGas = findViewById(R.id.edtPriceGas);
        edtEth = findViewById(R.id.edtPriceEthanol);

        textViewMessage = findViewById(R.id.txtMessage);

        Button btnCalc = findViewById(R.id.btnCalc);
        Button btnSave = findViewById(R.id.btnSave);
        Button btnClear = findViewById(R.id.btnClear);
        Button btnFinish = findViewById(R.id.btnFinish);

        btnCalc.setOnClickListener(view -> {
            if (validateEdtTxt(edtGas)) {
                if (validateEdtTxt(edtEth)) {
                    double priceGas = Double.parseDouble(edtGas.getText().toString());
                    double priceEth = Double.parseDouble(edtEth.getText().toString());
                    String recomendation = CalculateDiff.calculateDiffGasEthanol(priceGas, priceEth);
                    textViewMessage.setText(recomendation);
                }
            } else {
                Toast.makeText(this, "Please insert correct data", Toast.LENGTH_SHORT).show();
            }
        });

        btnClear.setOnClickListener(view -> _clear());

        btnSave.setOnClickListener(view -> {
        });

        btnFinish.setOnClickListener(view -> {
            finish();
        });
    }

    private boolean validateEdtTxt(EditText editText) {
        if (TextUtils.isEmpty(editText.getText())) {
            editText.setError(getString(R.string.insert_data));
            editText.requestFocus();
            return false;
        }
        return true;
    }

    private void _clear() {
        edtGas.setText("");
        edtEth.setText("");
    }


}
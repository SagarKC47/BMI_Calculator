package com.example.bmi_calculator;

import android.support.v4.app.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.bmi_calculator.Bmimodel;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView txtweight, txtBMI,txtheight;
    private Button btncalculatebmi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtweight=findViewById(R.id.enter_weight);
        txtheight=findViewById(R.id.enter_height);
        txtBMI = findViewById(R.id.disp_bmi);
        btncalculatebmi = findViewById(R.id.btn_calcbmi);

        btncalculatebmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculateBMI();
            }
        });
    }
    private void CalculateBMI(){
        float weight=Float.parseFloat(txtweight.getText().toString());
        float height=Float.parseFloat(txtheight.getText().toString())/100;
        Bmimodel bmim=new Bmimodel(weight,height);
        float result=bmim.getWeight()/(bmim.getHeight()*bmim.getHeight());

        if (result<18.5){
            txtBMI.setText("Your BMI: "+result+ " \nUnderweight");
            Toast.makeText(MainActivity.this,"Underweight",Toast.LENGTH_LONG).show();
        }
        else if (result>=18.5 && result<=24.9){
            txtBMI.setText("Your BMI: "+result+" \nNormal Weight");
            Toast.makeText(MainActivity.this,"Normal Weight",Toast.LENGTH_LONG).show();
        }
        else if (result>=25 && result<=29.9){
            txtBMI.setText("Your BMI: "+result+" \nOverWeight");
            Toast.makeText(MainActivity.this,"Overweight",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(MainActivity.this,"Re-correct your Value..",Toast.LENGTH_LONG).show();
        }
    }
}
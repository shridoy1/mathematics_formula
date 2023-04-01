package com.example.hw2141to2145and2321to2325margeall;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ElectricityBill extends AppCompatActivity {

    TextView tvHeader;
    public static String Title = "";
    EditText dataInput;
    LinearLayout submitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricity_bill);
        tvHeader = findViewById(R.id.tvHeader);
        dataInput = findViewById(R.id.dataInput);
        submitbtn = findViewById(R.id.submitbtn);

        //////////////////////////////////////////////////////////////

        tvHeader.setText(Title);


        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (dataInput.length()>0){

                    int unit = Integer.parseInt(dataInput.getText().toString());
                    float bill = 0;

                    if (unit<=50) bill = (float) (unit*0.50);
                    else if (unit<=150) bill = (float) (25 + (unit-50) * 0.75);
                    else if (unit<=250) bill = (float) (25+75+ (unit-150)*1.20);
                    else bill = (float) (25+75+120+ (unit-250) *1.50);

                    bill = (float) (bill+bill*0.20);
                    Anser("Total Electricity bill\n"+bill+"/- Taka");





                }

            }
        });


    }/////////////////////////////////////////////////////////////////////

    public void Anser(String string){
        Dialog dialog = new Dialog(ElectricityBill.this);
        dialog.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations
                = android.R.style.Animation_Dialog;
        dialog.setContentView(R.layout.anserdesply);
        dialog.setCancelable(true);
        TextView tvAnser = dialog.findViewById(R.id.tvAnser);
        tvAnser.setText(""+string);
        dialog.show();
    }



}
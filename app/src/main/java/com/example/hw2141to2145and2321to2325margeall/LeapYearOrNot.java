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

public class LeapYearOrNot extends AppCompatActivity {


    TextView tvHeader, wronginput;
    public static String Title = "";
    EditText dataInput;
    LinearLayout submitbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leap_year_or_not);
        tvHeader = findViewById(R.id.tvHeader);
        dataInput = findViewById(R.id.dataInput);
        submitbtn = findViewById(R.id.submitbtn);
        wronginput = findViewById(R.id.wronginput);

        //////////////////////////////////////////////////////////////

        tvHeader.setText(Title);


        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (dataInput.length()>0){
                    int data = Integer.parseInt(dataInput.getText().toString());

                    if (data%400==0 || data%4==0 && data%100!=0){
                        Anser("Congartulations "+data+" is Leap year");
                    }else {
                        Anser(""+data+" is not Leap year");
                    }
                }else {
                    wronginput.setText("সঠিক তত্ত্ব দিন");
                }

            }
        });






    }/////////////////////////////////////////////////////////////////////

    public void Anser(String string){
        Dialog dialog = new Dialog(LeapYearOrNot.this);
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
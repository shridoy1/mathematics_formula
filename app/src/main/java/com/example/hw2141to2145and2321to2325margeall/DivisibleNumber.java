package com.example.hw2141to2145and2321to2325margeall;


import androidx.appcompat.app.AlertDialog;
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

import soup.neumorphism.NeumorphTextView;

public class DivisibleNumber extends AppCompatActivity {

    TextView tvHeader;
    public static String Title = "";
    EditText dataInput;
    LinearLayout submitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisible_number);
        tvHeader = findViewById(R.id.tvHeader);
        dataInput = findViewById(R.id.dataInput);
        submitbtn = findViewById(R.id.submitbtn);

        //////////////////////////////////////////////////////////////

        tvHeader.setText(Title);


        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (dataInput.length()>0){

                    int mydata =Integer.parseInt(dataInput.getText().toString());

                    if (mydata%5==0 && mydata%11==0){
                        Anser(+mydata+" টি ৫ এবং ১১ দিয়ে বিভাজ্য");
                    }else {
                        Anser(+mydata+" টি ৫ এবং ১১ দিয়ে বিভাজ্য নয়");
                    }

                }


            }
        });




    }//////////////////////////////////////////////

    public void Anser(String string){
        Dialog dialog = new Dialog(DivisibleNumber.this);
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
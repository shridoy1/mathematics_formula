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

public class PalindromeNumber extends AppCompatActivity {

    TextView tvHeader;
    public static String Title = "";
    EditText dataInput;
    LinearLayout submitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome_number);
        tvHeader = findViewById(R.id.tvHeader);
        dataInput = findViewById(R.id.dataInput);
        submitbtn = findViewById(R.id.submitbtn);

        //////////////////////////////////////////////////////////////

        tvHeader.setText(Title);


        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (dataInput.length()>0){

                    int data = Integer.parseInt(dataInput.getText().toString());

                    int num = data;
                    int temp = num;
                    int reverse = 0;

                    while (temp!=0){
                        int remainder = temp%10;
                        reverse = reverse*10+remainder;
                        temp = temp/10;
                    }

                    if (num==reverse) Anser(""+data+" = "+reverse+"\nis a Palindrome number");
                    else Anser(""+data+" = "+reverse+"\nis not a Palindrome number");

                }

            }
        });



    }/////////////////////////////////////////////////////////////////////

    public void Anser(String string){
        Dialog dialog = new Dialog(PalindromeNumber.this);
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
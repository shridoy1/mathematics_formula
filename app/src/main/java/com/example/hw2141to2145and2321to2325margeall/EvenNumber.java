package com.example.hw2141to2145and2321to2325margeall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import soup.neumorphism.NeumorphTextView;

public class EvenNumber extends AppCompatActivity {

    TextView tvHeader;
    public static String Title = "";
    EditText dataInput;
    LinearLayout submitbtn;
    NeumorphTextView npTvDesply, npTvDesply2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_even_number);
        tvHeader = findViewById(R.id.tvHeader);
        dataInput = findViewById(R.id.dataInput);
        submitbtn = findViewById(R.id.submitbtn);
        npTvDesply = findViewById(R.id.npTvDesply);
        npTvDesply2 = findViewById(R.id.npTvDesply2);

        //////////////////////////////////////////////////////////////

        tvHeader.setText(Title);

        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (dataInput.length()>0){

                    int data = Integer.parseInt(dataInput.getText().toString());
                    npTvDesply.setText("");
                    int mul, sum = 0;

                    for (int i=1; i<=data; i++){
                        mul = 2*i;
                        sum = sum+mul;

                        npTvDesply.append(""+mul+" ");
                        npTvDesply2.setText(" = "+sum+"/-");

                    }

                }

            }
        });


    }
}
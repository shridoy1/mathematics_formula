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

import soup.neumorphism.NeumorphTextView;

public class MultiplicationTable extends AppCompatActivity {

    TextView tvHeader;
    public static String Title = "";
    EditText dataInput;
    LinearLayout submitbtn;
    NeumorphTextView npTvDesply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication_table);
        tvHeader = findViewById(R.id.tvHeader);
        dataInput = findViewById(R.id.dataInput);
        submitbtn = findViewById(R.id.submitbtn);
        npTvDesply = findViewById(R.id.npTvDesply);

        //////////////////////////////////////////////////////////////

        tvHeader.setText(Title);

        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (dataInput.length()>0){

                    int i, mul = 0;
                    int Namta = Integer.parseInt(dataInput.getText().toString());
                    String namta = dataInput.getText().toString();
                    npTvDesply.setText("");

                    for (i=1; i<=10; i++){
                        mul = Namta*i;
                        npTvDesply.append(""+namta+" * "+i+" = "+mul+"\n");
                    }


                }

            }
        });


    }/////////////////////////////////////////////////////////////////////

    public void Anser(String string){
        Dialog dialog = new Dialog(MultiplicationTable.this);
        dialog.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations
                = android.R.style.Animation_Dialog;
        dialog.setContentView(R.layout.anserdesply);
        dialog.setCancelable(true);
        TextView tvAnser = dialog.findViewById(R.id.tvAnser);
        tvAnser.setText("");
        tvAnser.append(""+string);
        dialog.show();
    }




}
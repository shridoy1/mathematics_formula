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

public class SubjectsGrade extends AppCompatActivity {

    TextView tvHeader;
    public static String Title = "";
    EditText physics, chemistry, biology, mathematics, computer;
    LinearLayout submitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects_grade);
        tvHeader = findViewById(R.id.tvHeader);
        physics = findViewById(R.id.physics);
        chemistry = findViewById(R.id.chemistry);
        biology = findViewById(R.id.biology);
        mathematics = findViewById(R.id.mathematics);
        computer = findViewById(R.id.computer);
        submitbtn = findViewById(R.id.submitbtn);

        //////////////////////////////////////////////////////////////

        tvHeader.setText(Title);


        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (physics.length()>0 && chemistry.length()>0 && biology.length()>0 && mathematics.length()>0 && computer.length()>0){

                    int phyc = Integer.parseInt(physics.getText().toString());
                    int chemy = Integer.parseInt(chemistry.getText().toString());
                    int bio = Integer.parseInt(biology.getText().toString());
                    int math = Integer.parseInt(mathematics.getText().toString());
                    int comp = Integer.parseInt(computer.getText().toString());

                    int sum = phyc+chemy+bio+math+comp;
                    float percentage = (float) (sum/5.0);


                    if (percentage>=90){
                        Anser("Percentage = "+percentage+ "%" + "\nGrade A");
                    }
                    if (percentage>=80 && percentage<90){
                        Anser("Percentage = "+percentage+ "%" + "\nGrade B");
                    }
                    if (percentage>=70 && percentage<80){
                        Anser("Percentage = "+percentage+ "%" + "\nGrade C");
                    }
                    if (percentage>=60 && percentage<70){
                        Anser("Percentage = "+percentage+ "%" + "\nGrade D");
                    }
                    if (percentage>=40 && percentage<60){
                        Anser("Percentage = "+percentage+ "%" + "\nGrade E");
                    }
                    if (percentage<40){
                        Anser("Percentage = "+percentage+ "%" + "\nGrade F");
                    }
                    if (phyc<40 || chemy<40 || bio<40 || math<40 || comp<40){
                        Anser("Percentage = "+percentage+ "%" + "\nGrade Fall");
                    }

                }

            }
        });


    }/////////////////////////////////////////////////////////////////////

    public void Anser(String string){
        Dialog dialog = new Dialog(SubjectsGrade.this);
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
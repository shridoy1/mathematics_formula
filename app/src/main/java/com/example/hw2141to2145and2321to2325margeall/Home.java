package com.example.hw2141to2145and2321to2325margeall;

import static com.example.hw2141to2145and2321to2325margeall.R.id.gridView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Home extends AppCompatActivity {

    GridView gridView ;
    HashMap<String, String> hashMap;
    ArrayList < HashMap<String, String> > arrayList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        gridView = findViewById(R.id.gridView);


        createTable();

        myAdpter adpter = new myAdpter();
        gridView.setAdapter(adpter);



    }/////////////////////////////////////////////////////////////////////

    //======custom adpter========================

    private class myAdpter extends BaseAdapter{

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myView = layoutInflater.inflate(R.layout.item, parent, false);


            TextView tvTitle = myView.findViewById(R.id.tvTitle);
            LinearLayout itemlly = myView.findViewById(R.id.itemlly);

            //=================================================
            Random rnd = new Random();
            int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            itemlly.setBackgroundColor(color);
            //=================================================


            hashMap = arrayList.get(position);
            String title = hashMap.get("title");


            tvTitle.setText(title);

            if (position==0){
                itemlly.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        DivisibleNumber.Title = title;
                        startActivity(new Intent(Home.this, DivisibleNumber.class));
                    }
                });
            }
            //
            if (position==1){
                itemlly.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        LeapYearOrNot.Title = title;
                        startActivity(new Intent(Home.this, LeapYearOrNot.class));
                    }
                });
            }
            //
            if (position==2){
                itemlly.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        WeekDay.Title = title;
                        startActivity(new Intent(Home.this, WeekDay.class));
                    }
                });
            }
            //
            if (position==3){
                itemlly.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        SubjectsGrade.Title = title;
                        startActivity(new Intent(Home.this, SubjectsGrade.class));
                    }
                });
            }
            //
            if (position==4){
                itemlly.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        ElectricityBill.Title = title;
                        startActivity(new Intent(Home.this, ElectricityBill.class));
                    }
                });
            }
            //
            if (position==5){
                itemlly.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        MultiplicationTable.Title = title;
                        startActivity(new Intent(Home.this, MultiplicationTable.class));
                    }
                });
            }
            //
            if (position==6){
                itemlly.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        EvenNumber.Title = title;
                        startActivity(new Intent(Home.this, EvenNumber.class));
                    }
                });
            }
            //
            if (position==7){
                itemlly.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        NumberSeries.Title = title;
                        startActivity(new Intent(Home.this, NumberSeries.class));
                    }
                });
            }
            //
            if (position==8){
                itemlly.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        SquareNaturalNumber.Title = title;
                        startActivity(new Intent(Home.this, SquareNaturalNumber.class));
                    }
                });
            }
            //
            if (position==9){
                itemlly.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        PalindromeNumber.Title = title;
                        startActivity(new Intent(Home.this, PalindromeNumber.class));
                    }
                });
            }

            return myView;
        }
    }

    //======custom adpter end====================

    //=============Custom method=================

    private void createTable (){

        hashMap = new HashMap<>();
        hashMap.put("title", "Whether a number is divisible by 5 and 11 or not.");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("title", "Whether a year is leap year or not.");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("title", "Week number and output the week day.");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("title", "Marks of five subjects, Calculate percentage and grade");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("title", "Electricity unit charges and calculate total electricity bill");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("title", "Multiplication table of a given integer");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("title", "N terms of even number and their sum");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("title", "Sum of the series upto n terms 9");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("title", "N terms of square natural number and their sum.");
        arrayList.add(hashMap);
        //
        hashMap = new HashMap<>();
        hashMap.put("title", "Check whether a number is palindrome or not");
        arrayList.add(hashMap);

    }

    //=============Custom method end=============


}
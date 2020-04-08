package com.example.dell.myapplication01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class homeActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homework);
    }
    public void homeworkOne(View view){
        //界面跳转
        Intent intent=new Intent(this,operation.class);
        startActivity(intent);
    }
    public void homeworkTwo(View view){
        //界面跳转
        Intent intent=new Intent(this,CheckboxActivity.class);
        startActivity(intent);
    }
}

package com.hadinorouzi.reminder;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    public static int ADD_REMINDER_REQUEST_CODE = 10;

    FloatingActionButton FAB;
    private RecyclerView recyclerView;
    private AlarmAdapter alarmAdapter;
    private ArrayList<AlarmData> alarmInfoArrayList;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FAB = findViewById(R.id.floatingAB);
        recyclerView = findViewById(R.id.recyclerViewMain);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        alarmInfoArrayList = new ArrayList<>();
        alarmAdapter = new AlarmAdapter(this,alarmInfoArrayList);
        recyclerView.setAdapter(alarmAdapter);
    }

    public void FABClicked(View view){
        Intent intent = new Intent(this,AddNewReminder.class);
        startActivityForResult(intent,ADD_REMINDER_REQUEST_CODE);
    }

    @Override
    public void setSupportActionBar(@Nullable Toolbar toolbar) {
        super.setSupportActionBar(toolbar);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == ADD_REMINDER_REQUEST_CODE){
            if(resultCode == Activity.RESULT_OK){
                AlarmData alarmInfo = new AlarmData(data.getStringExtra("title"),data.getStringExtra("description"),new Date(),false);
                Log.d("red",String.valueOf(alarmInfo.getTitle()));
                alarmInfoArrayList.add(alarmInfo);
            }
        }
    }
}

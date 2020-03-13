package com.hadinorouzi.reminder;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton FAB;
    private RecyclerView recyclerView;
    private AlarmAdapter alarmAdapter;
    private ArrayList<AlarmInfo> alarmInfoArrayList;

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
        createListData(); // for add dummy data
    }

    public void FABClicked(View view){
        Intent intent = new Intent(this,AddNewReminder.class);
        startActivity(intent);
    }

    @Override
    public void setSupportActionBar(@Nullable Toolbar toolbar) {
        super.setSupportActionBar(toolbar);
    }
    private void createListData(){
        alarmInfoArrayList.add(new AlarmInfo("emer","nothing",new Date(),false));
        alarmInfoArrayList.add(new AlarmInfo("emer","nothing",new Date(),false));
        alarmInfoArrayList.add(new AlarmInfo("emer","nothing",new Date(),false));
        alarmInfoArrayList.add(new AlarmInfo("emer","nothing",new Date(),false));

    }
}

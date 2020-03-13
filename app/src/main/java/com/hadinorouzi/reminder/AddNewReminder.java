package com.hadinorouzi.reminder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AddNewReminder extends AppCompatActivity {

    FloatingActionButton FAB;
    EditText title;
    EditText description;
    CalendarView calender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_reminder);
        FAB = findViewById(R.id.doneButton);
        title = findViewById(R.id.titleEditText);
        description = findViewById(R.id.desEditText);
        calender = findViewById(R.id.calendar);

        FAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.putExtra("title",title.getText().toString());
                intent.putExtra("description",description.getText().toString());
                intent.putExtra("date",calender.getDate());
                setResult(Activity.RESULT_OK,intent);
                finish();
            }
        });
    }
}

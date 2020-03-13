package com.hadinorouzi.reminder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AlarmAdapter extends RecyclerView.Adapter<AlarmHolder> {

    private Context context;
    private ArrayList<AlarmInfo> alarms;

    public AlarmAdapter(Context context, ArrayList<AlarmInfo> alarms) {
        this.context = context;
        this.alarms = alarms;
    }

    @NonNull
    @Override
    public AlarmHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_template,parent,false);
        return new AlarmHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AlarmHolder holder, int position) {
        AlarmInfo alarmInfo = alarms.get(position);
        holder.setDetails(alarmInfo);

    }

    @Override
    public int getItemCount() {
        return alarms.size();
    }


}

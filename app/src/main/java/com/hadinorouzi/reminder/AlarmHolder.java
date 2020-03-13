package com.hadinorouzi.reminder;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AlarmHolder extends RecyclerView.ViewHolder {

    private TextView title, description, date;
    public AlarmHolder(@NonNull View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.title);
        description = itemView.findViewById(R.id.description);

    }

    public void setDetails(AlarmInfo alarmInfo){

        title.setText(alarmInfo.getTitle());
        description.setText(alarmInfo.getDescription());
    }
}

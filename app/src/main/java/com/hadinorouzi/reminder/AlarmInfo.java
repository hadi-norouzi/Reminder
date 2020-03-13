package com.hadinorouzi.reminder;

import java.util.Date;

public class AlarmInfo {

    private String title;
    private String description;
    private Date date;
    private boolean completed;

    public AlarmInfo(String title, String description, Date date, boolean completed) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.completed = completed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}

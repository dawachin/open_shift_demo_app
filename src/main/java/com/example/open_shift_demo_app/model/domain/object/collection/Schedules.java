package com.example.open_shift_demo_app.model.domain.object.collection;

import com.example.open_shift_demo_app.model.domain.object.reference.content.plan.Schedule;
import lombok.Getter;

import java.util.ArrayList;

public class Schedules {

    @Getter
    private ArrayList<Schedule> schedules;

    @Getter
    private int size;

    public Schedules(ArrayList<Schedule> schedules){
        this.schedules = schedules;
    }

    public Schedules add(Schedule schedule) {
        this.schedules.add(schedule);
        this.size = this.schedules.size();
        return new Schedules(this.schedules);
    }

}

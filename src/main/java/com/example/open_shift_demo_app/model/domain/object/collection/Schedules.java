package com.example.open_shift_demo_app.model.domain.object.collection;

import com.example.open_shift_demo_app.model.domain.object.reference.notebook.content.plan.Schedule;
import lombok.Getter;

import java.util.ArrayList;

public class Schedules {

    @Getter
    private ArrayList<Schedule> schedules;

    @Getter
    private int size;

    public Schedules(ArrayList<Schedule> schedules){

        this.schedules = schedules;
        this.size = this.schedules.size();
    }

    public Schedules add(Schedule schedule) {
        this.schedules.add(schedule);
        return new Schedules(this.schedules);
    }

}

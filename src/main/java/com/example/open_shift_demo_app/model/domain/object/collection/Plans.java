package com.example.open_shift_demo_app.model.domain.object.collection;

import com.example.open_shift_demo_app.model.domain.object.reference.notebook.content.plan.Plan;
import lombok.Getter;

import java.util.ArrayList;

public class Plans {

    @Getter
    private ArrayList<Plan> planList;

    @Getter
    private int size;

    public Plans(ArrayList<Plan> planList) {
        this.planList = planList;
        this.size = this.planList.size();
    }

    public Plans addPlan(Plan plan) {
        this.planList.add(plan);
        return new Plans(this.planList);
    }
}

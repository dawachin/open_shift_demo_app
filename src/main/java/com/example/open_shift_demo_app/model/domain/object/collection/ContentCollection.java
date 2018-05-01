package com.example.open_shift_demo_app.model.domain.object.collection;

import com.example.open_shift_demo_app.model.domain.object.reference.notebook.content.Content;
import com.example.open_shift_demo_app.model.domain.object.reference.notebook.content.plan.Plan;
import lombok.Getter;

import java.util.ArrayList;

public class ContentCollection {

    @Getter
    private ArrayList<Content> contentArrayList;

    @Getter
    private int size;

    public ContentCollection(ArrayList<Content> contentArrayList) {
        this.contentArrayList = contentArrayList;
        this.size = this.contentArrayList.size();
    }

    public ContentCollection addPlan(Plan plan) {
        this.contentArrayList.add(plan);
        return new ContentCollection(this.contentArrayList);
    }
}

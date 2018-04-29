package com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool;

import com.example.open_shift_demo_app.model.domain.object.collection.Pages;
import com.example.open_shift_demo_app.model.domain.object.collection.Plans;
import com.example.open_shift_demo_app.model.domain.object.reference.notebook.content.Content;
import com.example.open_shift_demo_app.model.domain.object.reference.notebook.content.plan.Plan;
import com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.refill.Calendar;
import com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.refill.Refill;

import java.util.ArrayList;

public class Binder {

    /** 綴じているページ */
    private Pages pages;

    /** 綴じているページ */
    private Index index;

    /** 指定されたコンテンツを返す */
    public Refill open(Content content) {
        return new Calendar(new Plans(new ArrayList<Plan>()));
    }

    /** 指定されたコンテンツを綴じる */
    public void close(Content content) {

    }
}

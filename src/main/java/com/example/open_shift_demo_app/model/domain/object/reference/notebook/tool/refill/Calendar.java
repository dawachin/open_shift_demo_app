package com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.refill;

import com.example.open_shift_demo_app.model.domain.object.collection.Plans;
import com.example.open_shift_demo_app.model.domain.object.reference.notebook.content.plan.Plan;
import com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.Pencil;

public class Calendar implements Refill {

    /** すでに登録のある予定 */
    private Plans existingPlans;

    /** コンストラクタ */
    public Calendar(Plans plans){
        this.existingPlans = plans;
    }

    /** 新しい予定をすでにある予定に登録する */
    public Calendar write(Pencil pencil) {

        if (!(pencil.getContent() instanceof Plan)) {
            // 対象のコンテンツでない場合
        }

        Plan writePlan = (Plan)pencil.getContent();

        this.existingPlans.addPlan(writePlan);

        return new Calendar(this.existingPlans);
    }
}

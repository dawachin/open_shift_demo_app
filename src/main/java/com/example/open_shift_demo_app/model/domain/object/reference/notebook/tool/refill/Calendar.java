package com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.refill;

import com.example.open_shift_demo_app.model.domain.object.collection.ContentCollection;
import com.example.open_shift_demo_app.model.domain.object.reference.Owner;
import com.example.open_shift_demo_app.model.domain.object.reference.notebook.content.plan.Plan;
import com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.Pencil;
import com.example.open_shift_demo_app.model.domain.object.value.event.Title;

public class Calendar implements Refill{

    /** すでに登録のある予定 */
    private ContentCollection planList;

    /** コンストラクタ　内部 */
    private Calendar(ContentCollection contentCollection){
        this.planList = contentCollection;
    }

    /** コンストラクタ　外部 */
    public Calendar(Owner owner){
        // 持ち主情報からカレンダー情報を取得してくる
        // demo

        Plan testPlan = new Plan(new Title("試験的べた書きプラン"));
    }

    /** 新しい予定をすでにある予定に登録する */
    public Calendar write(Pencil pencil) {

        if (!(pencil.getContent() instanceof Plan)) {
            // 対象のコンテンツでない場合
        }

        Plan writePlan = (Plan)pencil.getContent();

        this.planList.addPlan(writePlan);

        return new Calendar(this.planList);
    }

    /** 登録されている予定を返す */
    public ContentCollection read() {
        return planList;
    }
}

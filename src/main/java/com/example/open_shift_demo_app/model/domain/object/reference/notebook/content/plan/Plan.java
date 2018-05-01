package com.example.open_shift_demo_app.model.domain.object.reference.notebook.content.plan;


import com.example.open_shift_demo_app.model.domain.object.collection.Schedules;
import com.example.open_shift_demo_app.model.domain.object.reference.notebook.content.Content;
import com.example.open_shift_demo_app.model.domain.object.value.event.Description;
import com.example.open_shift_demo_app.model.domain.object.value.event.Title;
import lombok.Getter;

/**
 * プランクラス
 *
 * 予定そのものを表す。
 *
 */
public class Plan implements Content {

    /** タイトル */
    @Getter
    private Title title;

    /** 説明 */
    @Getter
    private Description description;

    /** 時間・場所 (複数)　*/
    @Getter
    private Schedules schedules;

    public Plan(Title title){
        this.title = title;
        this.description = new Description("試験的べた書き説明");
    }

}

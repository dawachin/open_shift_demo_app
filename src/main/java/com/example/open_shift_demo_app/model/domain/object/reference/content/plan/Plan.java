package com.example.open_shift_demo_app.model.domain.object.reference.content.plan;


import com.example.open_shift_demo_app.model.domain.object.collection.Schedules;
import com.example.open_shift_demo_app.model.domain.object.value.event.Description;
import com.example.open_shift_demo_app.model.domain.object.value.event.Title;
import com.example.open_shift_demo_app.model.domain.object.reference.content.Content;

/**
 * プランクラス
 *
 * 予定そのものを表す。
 *
 */
public class Plan implements Content {

    /** タイトル */
    private Title title;

    /** 説明 */
    private Description description;

    /** 時間・場所 */
    private Schedules schedules;

    public Plan(Title title){
        this.title = title;
    }

}

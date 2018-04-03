package com.example.open_shift_demo_app.model.domain.reference;


import com.example.open_shift_demo_app.model.domain.domainObject.collectionObject.Schedules;
import com.example.open_shift_demo_app.model.domain.domainObject.valueObject.event.Description;
import com.example.open_shift_demo_app.model.domain.domainObject.valueObject.event.Title;

/**
 * プランクラス
 *
 * 予定そのものを表す。
 *
 */
public class Plan {

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

package com.example.open_shift_demo_app.model.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 *
 * スケジュールテーブル
 *
 * */
@AllArgsConstructor
@Entity
public class EventEntity {

    public EventEntity(){};

    /** スケジュールID */
    @Id
    @Getter
    @Setter
    @Column(name="ID")
    private String id;

    /** スケジュール　タイトル */
    @Getter
    @Setter
    @Column(name="TITLE")
    private String title;

    /** スケジュール　説明 */
    @Getter
    @Setter
    @Column(name="DESCRIPTION")
    private String description;

    /** スケジュール　開始日時 */
    @Getter
    @Setter
    @Column(name="START_DATE")
    private Date startDate;

    /** スケジュール　終了日時 */
    @Getter
    @Setter
    @Column(name="END_DATE")
    private Date endDate;

}

package com.example.open_shift_demo_app.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 *
 * スケジュールテーブル
 *
 * */
@AllArgsConstructor
@Document
public class EventEntity {

    public EventEntity(){};

    /** スケジュールID */
    @Id
    @Getter
    private String id;

    /** スケジュール　タイトル */
    @Getter
    private String title;

    /** スケジュール　説明 */
    @Getter
    private String description;

    /** スケジュール　開始日時 */
    @Getter
    private Date startDate;

    /** スケジュール　終了日時 */
    @Getter
    private Date endDate;

}

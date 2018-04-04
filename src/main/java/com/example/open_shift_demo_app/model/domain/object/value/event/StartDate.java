package com.example.open_shift_demo_app.model.domain.object.value.event;


import com.example.open_shift_demo_app.model.domain.object.value.ValueObjectAbstract;
import com.example.open_shift_demo_app.model.domain.object.value.ValueObjectInterface;
import lombok.Getter;

import java.util.Date;


public class StartDate extends ValueObjectAbstract implements ValueObjectInterface {

    @Getter
    private Date startDate;

    @Getter
    private final String NAME = "開始日時";

    /** コンストラク */
    public StartDate(Date startDate) {
        isCheck();
        this.startDate = startDate;
    }

    /** 値チェック */
    protected void isCheck() {

    }

}

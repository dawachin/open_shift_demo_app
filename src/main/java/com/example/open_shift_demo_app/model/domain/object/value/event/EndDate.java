package com.example.open_shift_demo_app.model.domain.object.value.event;


import com.example.open_shift_demo_app.model.domain.object.value.ValueObjectAbstract;
import com.example.open_shift_demo_app.model.domain.object.value.ValueObjectInterface;
import lombok.Getter;

import java.util.Date;


public class EndDate extends ValueObjectAbstract implements ValueObjectInterface {

    @Getter
    private Date endDate;

    @Getter
    private final String NAME = "終了日時";

    /** コンストラク */
    public EndDate(Date endDate) {
        isCheck();
        this.endDate = endDate;
    }

    /** 値チェック */
    protected void isCheck() {

    }

}

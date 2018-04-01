package com.example.open_shift_demo_app.model.domain.valueObject.event;


import com.example.open_shift_demo_app.model.domain.valueObject.ValueObjectAbstract;
import com.example.open_shift_demo_app.model.domain.valueObject.ValueObjectInterface;
import lombok.Getter;
import org.springframework.stereotype.Component;

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

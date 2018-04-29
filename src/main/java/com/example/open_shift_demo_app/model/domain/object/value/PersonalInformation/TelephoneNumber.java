package com.example.open_shift_demo_app.model.domain.object.value.PersonalInformation;

import com.example.open_shift_demo_app.model.domain.object.value.ValueObjectAbstract;
import com.example.open_shift_demo_app.model.domain.object.value.ValueObjectInterface;

public class TelephoneNumber extends ValueObjectAbstract implements ValueObjectInterface{

    private final String NAME = "電話番号";

    private Integer tel1;
    private Integer tel2;
    private Integer tel3;

    public TelephoneNumber(String telephoneNumber) {

    }

    /** 値チェック */
    protected void isCheck() {

    }
}

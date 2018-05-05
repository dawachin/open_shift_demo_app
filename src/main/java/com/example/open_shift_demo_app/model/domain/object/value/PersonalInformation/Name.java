package com.example.open_shift_demo_app.model.domain.object.value.PersonalInformation;

import com.example.open_shift_demo_app.model.domain.object.value.ValueObjectAbstract;
import com.example.open_shift_demo_app.model.domain.object.value.ValueObjectInterface;


public class Name extends ValueObjectAbstract implements ValueObjectInterface{

    private String NAME = "名前";

    private String name;

    public Name(String name) {
        this.name = name;
    }

    /** 値チェック */
    protected void isCheck() {

    }
}

package com.example.open_shift_demo_app.model.domain.domainObject.valueObject.event;


import com.example.open_shift_demo_app.model.domain.domainObject.valueObject.ValueObjectAbstract;
import com.example.open_shift_demo_app.model.domain.domainObject.valueObject.ValueObjectInterface;
import lombok.Getter;

public class Title extends ValueObjectAbstract implements ValueObjectInterface{

    @Getter
    private String title;

    @Getter
    private final String NAME = "タイトル";

    /** コンストラク */
    public Title(String title) {
        isCheck();
        this.title = title;
    }

    /** 値チェック */
    protected void isCheck() {

    }

}

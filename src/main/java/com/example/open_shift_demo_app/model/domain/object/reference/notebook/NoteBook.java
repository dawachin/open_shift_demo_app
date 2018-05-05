package com.example.open_shift_demo_app.model.domain.object.reference.notebook;

import com.example.open_shift_demo_app.model.domain.object.reference.Owner;
import com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.Binder;
import com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.PageIndex;
import com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.refill.Refill;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * 手帳オブジェクト
 *
 *
 * */
public class NoteBook {

    /** 持ち主 */
    private Owner owner;

    /** 結束具 */
    private Binder binder;

    /** コンストラクタ */
    @Autowired
    public NoteBook(Owner owner) {
        this.owner = owner;
        this.binder = new Binder(owner);
    }

    /** 指定されたコンテンツを取り出す */
    public Refill openPageByIndex(PageIndex pageIndex) {
        return binder.open(pageIndex);
    }









}

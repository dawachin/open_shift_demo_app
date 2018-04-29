package com.example.open_shift_demo_app.model.domain.object.reference.notebook;

import com.example.open_shift_demo_app.model.domain.object.reference.Owner;
import com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.Binder;

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
    private NoteBook(Owner owner) {
        this.owner = owner;
    }









}

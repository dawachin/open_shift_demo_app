package com.example.open_shift_demo_app.model.domain.object.collection;

import com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.refill.Refill;

import java.util.ArrayList;

/**
 *
 * ページ
 *
 * リフィルの集合体を扱う
 *
 */
public class Pages {

    /** ページ */
    private ArrayList<Refill> pages;

    /** コンストラクタ */
    public Pages(ArrayList<Refill> pages) {
        this.pages = pages;
    }

    /** ページを追加する */
    public Pages add(Refill refill) {
        this.pages.add(refill);
        return new Pages(this.pages);
    }

}

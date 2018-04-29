package com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool;

import com.example.open_shift_demo_app.model.domain.object.reference.notebook.content.Content;
import com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.refill.Refill;
import lombok.Getter;

/**
 *
 * Pencil
 *
 * リフィルオブジェクトをコンテンツオブジェクトで更新する。
 *
 * */
public class Pencil {

    @Getter
    private Content content;

    private Refill refill;

    public Pencil(Refill refill, Content content) {
        this.refill = refill;
        this.content = content;

    }

    /***
     * リフィルにコンテンツを書き込む
     * @return Refill
     */
    public Refill doWrite() {
        return this.refill.write(this);
    }

}

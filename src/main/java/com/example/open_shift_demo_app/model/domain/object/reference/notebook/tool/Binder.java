package com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool;

import com.example.open_shift_demo_app.model.domain.object.reference.Owner;
import com.example.open_shift_demo_app.model.domain.object.reference.notebook.content.Content;
import com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.refill.Refill;

import java.util.Map;

public class Binder {

    /** 綴じられているリフィル */
    private Map<PageIndex, Refill> bindingRefill;

    /** コンストラクタ */
    public Binder(Owner owner) {
        PageIndex.values();
        for (PageIndex pageIndex : PageIndex.values()) {
            bindingRefill.put(pageIndex, pageIndex.getRefill(owner));
        }
    }


    /** 指定されたコンテンツを返す */
    public Refill open(PageIndex pageIndex) {
        return bindingRefill.get(pageIndex);
    }

    /** 指定されたコンテンツを綴じる */
    public void close(Content content) {

    }
}

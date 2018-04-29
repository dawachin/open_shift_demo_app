package com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool;

import com.example.open_shift_demo_app.model.domain.object.collection.Pages;

import java.util.Map;

public class Index {

    private Map<String, Pages> index;

    public Index() {
        // リポジトリーに問い合わせてページを作っていく
    }

    public Pages getPages(String key){
        return this.index.get(key);
    }


}

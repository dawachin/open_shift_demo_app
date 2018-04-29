package com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.refill;

import com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.Pencil;

public class FileFolder implements Refill{
    public FileFolder write(Pencil pencilencil) {
        return new FileFolder();
    }
}

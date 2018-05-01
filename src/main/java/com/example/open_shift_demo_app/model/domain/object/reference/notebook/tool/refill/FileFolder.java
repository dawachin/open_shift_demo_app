package com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.refill;

import com.example.open_shift_demo_app.model.domain.object.collection.ContentCollection;
import com.example.open_shift_demo_app.model.domain.object.reference.Owner;
import com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.Pencil;

public class FileFolder implements Refill{
    private ContentCollection fileList;
    public FileFolder(Owner owner){}
    private FileFolder(){}
    public FileFolder write(Pencil pencil) {
        return new FileFolder();
    }
    public ContentCollection read() {
        return fileList;
    }

}

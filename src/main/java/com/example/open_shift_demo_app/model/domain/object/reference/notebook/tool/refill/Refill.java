package com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.refill;

import com.example.open_shift_demo_app.model.domain.object.collection.ContentCollection;
import com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.Pencil;

public interface Refill {

    Refill write(Pencil pencil);
    ContentCollection read();
}

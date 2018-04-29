package com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.refill;

import com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.Pencil;

public class AddressBook implements Refill {

    public AddressBook write(Pencil pencil) {
        return new AddressBook();
    }
}

package com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.refill;

import com.example.open_shift_demo_app.model.domain.object.collection.ContentCollection;
import com.example.open_shift_demo_app.model.domain.object.reference.Owner;
import com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.Pencil;

public class AddressBook implements Refill {

    /** すでに登録のある予定 */
    private ContentCollection addressList;

    public AddressBook(Owner owner){

    }

    private AddressBook() {

    }
    public AddressBook write(Pencil pencil) {
        return new AddressBook();
    }
    /** 登録されているAddressを返す */
    public ContentCollection read() {
        return addressList;
    }

}

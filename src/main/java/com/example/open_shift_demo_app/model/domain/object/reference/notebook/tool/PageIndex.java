package com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool;

import com.example.open_shift_demo_app.model.domain.object.reference.Owner;
import com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.refill.AddressBook;
import com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.refill.Calendar;
import com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.refill.FileFolder;
import com.example.open_shift_demo_app.model.domain.object.reference.notebook.tool.refill.Refill;

public enum PageIndex {


    CALENDAR{
        @Override
        public Refill getRefill(Owner owner){
            return new Calendar(owner);
        }
    },
    FILE_FOLDER{
        @Override
        public Refill getRefill(Owner owner){
            return  new FileFolder(owner);
        }
    },
    ADDRESS_BOOK{
        @Override
        public Refill getRefill(Owner owner){
            return  new AddressBook(owner);
        }
    };

    private PageIndex(){

    }

    public abstract Refill getRefill(Owner owner);

}
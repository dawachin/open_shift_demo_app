package com.example.open_shift_demo_app.model.domain.conductor;

import com.example.open_shift_demo_app.model.domain.object.reference.Owner;
import com.example.open_shift_demo_app.model.domain.object.reference.notebook.NoteBook;
import com.example.open_shift_demo_app.model.domain.object.value.PersonalInformation.Name;
import com.example.open_shift_demo_app.model.domain.object.value.PersonalInformation.TelephoneNumber;
import org.springframework.beans.factory.annotation.Autowired;



public class NotebookConductor {

    private NoteBook noteBook;

    @Autowired
    private Owner owner;

    public NotebookConductor(){
        owner = new Owner(new Name("試験　太郎"), new TelephoneNumber("03-123-123"));
    }
}

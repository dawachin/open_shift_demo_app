package com.example.open_shift_demo_app.model.domain.object.reference;

import com.example.open_shift_demo_app.model.domain.object.value.PersonalInformation.Name;
import com.example.open_shift_demo_app.model.domain.object.value.PersonalInformation.TelephoneNumber;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Owner {

    private Name name;

    private TelephoneNumber telephoneNumber;


}

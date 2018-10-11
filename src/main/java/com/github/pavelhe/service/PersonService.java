package com.github.pavelhe.service;

import com.github.pavelhe.model.*;
import org.springframework.integration.annotation.*;
import org.springframework.stereotype.*;

@Service
public class PersonService {

    @ServiceActivator(inputChannel = "personName")
    public String getPersonName(Person person) {
        return person.getName();
    }

    @ServiceActivator(inputChannel = "personAge")
    public int getPersonAge(Person person){
        return person.getAge();
    }

    @ServiceActivator(inputChannel = "personInfo")
    public String getPersonInfo(Person person){
        return person.toString();
    }
}

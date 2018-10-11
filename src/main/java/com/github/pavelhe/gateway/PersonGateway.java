package com.github.pavelhe.gateway;

import java.util.concurrent.*;

import com.github.pavelhe.model.*;
import org.springframework.integration.annotation.*;

@MessagingGateway
public interface PersonGateway {

    @Gateway(requestChannel = "personName")
    String getPersonName(Person person);

    @Gateway(requestChannel = "personAge")
    int getPersonAge(Person person);

    @Gateway(requestChannel = "personInfo")
    Future<String> asyncPersonInfo(Person person);
}

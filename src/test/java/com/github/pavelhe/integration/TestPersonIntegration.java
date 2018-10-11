package com.github.pavelhe.integration;

import java.util.concurrent.*;

import com.github.pavelhe.*;
import com.github.pavelhe.configuration.*;
import com.github.pavelhe.gateway.*;
import com.github.pavelhe.model.*;
import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.test.context.*;
import org.springframework.test.context.junit4.*;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {SpringIntegrationDemoApplication.class, SpringIntegrationConfiguration.class})
public class TestPersonIntegration {

    @Autowired
    private PersonGateway personGateway;
    private Person person = new Person("Test", 23);

    @Test
    public void testGetPersonName() throws Exception {
        String name = personGateway.getPersonName(person);
        assertNotNull(name);
        assertEquals(person.getName(), name);
    }

    @Test
    public void testGetPersonAge() throws Exception {
        int age = personGateway.getPersonAge(person);
        assertEquals(person.getAge(), age);
    }

    @Test
    public void testPersonInfo() throws Exception {
        Future<String> personInfo = personGateway.asyncPersonInfo(person);
        assertEquals(person.toString(), personInfo.get());
    }

}

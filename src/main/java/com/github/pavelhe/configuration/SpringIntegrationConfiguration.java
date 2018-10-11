package com.github.pavelhe.configuration;

import org.springframework.context.annotation.*;
import org.springframework.integration.annotation.*;
import org.springframework.integration.channel.*;
import org.springframework.integration.dsl.channel.*;

@Configuration
@IntegrationComponentScan
public class SpringIntegrationConfiguration {

    @Bean
    public DirectChannel personName() {
        return MessageChannels.direct().get();
    }

    @Bean
    public DirectChannel personAge() {
        return MessageChannels.direct().get();
    }

    @Bean
    public DirectChannel personInfo() {
        return MessageChannels.direct().get();
    }

}

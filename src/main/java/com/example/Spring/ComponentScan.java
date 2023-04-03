package com.example.Spring;

import com.example.Spring.model.Address;
import com.example.Spring.model.Company;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@org.springframework.context.annotation.ComponentScan(basePackageClasses = Company.class)
public class ComponentScan {

    @Bean
    @Scope("protoType")
    public Address getAddress(){
        return  new Address();
    }
}

package com.example.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 * @author sudhir
 *         Date:7/11/16
 *         Time:3:47 PM
 *         Project:demo
 */
@Configuration
public class ServiceConfig extends ResourceConfig {
    public ServiceConfig(){
        packages("com.example.service");
    }
}

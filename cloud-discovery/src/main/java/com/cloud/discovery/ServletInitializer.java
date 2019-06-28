package com.cloud.discovery;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @program: spring-cloud
 * @description:
 * @author: liuhanru
 * @create: 2019-05-17 08:43
 **/
public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CloudDiscoveryApplication.class);
    }
}
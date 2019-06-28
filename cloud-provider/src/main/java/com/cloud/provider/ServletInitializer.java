package com.cloud.provider;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @program: spring-cloud
 * @description:
 * @author: liuhanru
 * @create: 2019-05-17 08:53
 **/
public class ServletInitializer  extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CloudProviderApplication.class);
    }
}
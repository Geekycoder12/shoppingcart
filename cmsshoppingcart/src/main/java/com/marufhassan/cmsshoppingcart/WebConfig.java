package com.marufhassan.cmsshoppingcart;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("../static/media/**")
                .addResourceLocations("/home/geekycoder/cmsshoppintcart/cmsshoppingcart/src/main/resources/static/media/");
    }
}

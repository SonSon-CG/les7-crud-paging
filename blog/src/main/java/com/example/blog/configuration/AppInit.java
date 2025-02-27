package com.example.blog.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{com.example.customermanagementjpa.configuration.AppConfiguration.class};
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{};
    }
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

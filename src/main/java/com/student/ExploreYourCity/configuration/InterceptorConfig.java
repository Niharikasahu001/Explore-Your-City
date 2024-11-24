package com.student.ExploreYourCity.configuration;

import com.student.ExploreYourCity.interceptor.GeneralInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Autowired
    private GeneralInterceptor generalInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(generalInterceptor);
        registry.addInterceptor(generalInterceptor).addPathPatterns("/user/**");
        registry.addInterceptor(generalInterceptor).addPathPatterns("/eyc/**");
        registry.addInterceptor(generalInterceptor).addPathPatterns("/institutes/**");
    }
}

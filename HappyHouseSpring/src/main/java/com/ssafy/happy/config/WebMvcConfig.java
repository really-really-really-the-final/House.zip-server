package com.ssafy.happy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.ssafy.happy.interceptor.JwtInterceptor;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer{
    
	@Autowired
	private JwtInterceptor interceptor;
	
    public void addInterceptors(InterceptorRegistry registry) {
    
        registry.addInterceptor(interceptor)
                .addPathPatterns("/hi")
                .excludePathPatterns("/*",
                		"/userregist",
                		"/swagger-resources/**",
                		"/swagger-ui/**",
                		"/**/house/list/**",
                		"v2/api-docs"
                		); //로그인 쪽은 예외처리를 한다.
    }

}
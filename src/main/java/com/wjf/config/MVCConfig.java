package com.wjf.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//使用webMVCconfigureAdapter可以扩展MVC的功能
@Configuration
//@EnableWebMvc
public class MVCConfig  extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //super.addViewControllers(registry);
        registry.addViewController("/atguigu").setViewName("success");
    }
}

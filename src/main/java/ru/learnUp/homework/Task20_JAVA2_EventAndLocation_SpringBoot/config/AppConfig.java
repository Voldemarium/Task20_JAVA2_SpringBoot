package ru.learnUp.homework.Task20_JAVA2_EventAndLocation_SpringBoot.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource ms = new ResourceBundleMessageSource();
        ms.setBasename("text");
        ms.setDefaultEncoding("UTF-8");
        return ms;
    }
}

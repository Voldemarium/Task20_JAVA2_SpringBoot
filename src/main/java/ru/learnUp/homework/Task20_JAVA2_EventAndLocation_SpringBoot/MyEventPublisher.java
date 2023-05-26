package ru.learnUp.homework.Task20_JAVA2_EventAndLocation_SpringBoot;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class MyEventPublisher implements ApplicationContextAware {

    private ApplicationContext context;

    public void publishEvent(int eventNumber) {
        context.publishEvent(new MyEvent(eventNumber));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}

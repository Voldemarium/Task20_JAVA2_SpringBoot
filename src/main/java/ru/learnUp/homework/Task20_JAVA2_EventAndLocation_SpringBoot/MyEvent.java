package ru.learnUp.homework.Task20_JAVA2_EventAndLocation_SpringBoot;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent{

    private final int number;

    public MyEvent(int number) {
        super(number);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

}

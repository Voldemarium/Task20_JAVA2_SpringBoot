package ru.learnUp.homework.Task20_JAVA2_EventAndLocation_SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

@SpringBootApplication
public class GuessingGame {

	static int randomNumber = new Random().nextInt(1000);
	static Locale locale = Locale.getDefault();

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(GuessingGame.class, args);
		MyEventPublisher publisher = context.getBean(MyEventPublisher.class);
		MyEventListener listener = context.getBean((MyEventListener.class));
		Scanner scanner = new Scanner(System.in);

		System.out.println(context.getMessage("hello", null, locale));
		while (!listener.getMessage().equals("right")) {
			try {
				publisher.publishEvent(scanner.nextInt());
			} catch (InputMismatchException e) {
				System.out.println(context.getMessage("not an Integer", null, locale));
				scanner.next();
			}
		}
	}

}

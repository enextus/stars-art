package org.example;

import java.time.LocalTime;
import java.util.concurrent.atomic.AtomicInteger;

public class Sterne {

	private static final AtomicInteger count = new AtomicInteger(0);

	public static int getCount() {
		return count.get();
	}

	static {
		System.out.println("static block: count = " + count.get());
	}

	public Sterne() {
		count.incrementAndGet();        //Sterne.count++;
	}

	public void printSterne() {
		for (int i = 1; i <= 7; i++) {

			for (int j = 1; j <= i - 1; j++) {
				System.out.print("*");
			}

			for (int k = 1; k <= 14 - 2 * i; k++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i - 1; j++) {
				System.out.print("+");
			}

			System.out.print("\n");
		}
	}

	public void printTime() {
		LocalTime localTime = LocalTime.now();
		System.out.println("\nLocal time: "
				+ localTime.getHour() + ":"
				+ localTime.getMinute() + ":"
				+ localTime.getSecond());
	}

}

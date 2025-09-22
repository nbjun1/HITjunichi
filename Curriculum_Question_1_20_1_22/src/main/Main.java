package main;

import logic.CurrentTime;
import logic.Message;

public class Main {
	public static void main(String[] args) {
		Message text = new Message("こんにちは！ここは日本です！\n"
				+ "この寿司はうまい\n"
				+ "寿司は和食です");
		
		CurrentTime currentTime = new CurrentTime();
		
		System.out.println(text.getMessage());
		System.out.println(currentTime.getTime());
	}

}

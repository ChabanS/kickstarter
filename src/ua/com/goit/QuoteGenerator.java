package ua.com.goit;

import java.util.Random;

public class QuoteGenerator {
	public String nextQuote() {
		String[] strings = new String[] {
				"∆изнь Ч это чудесное приключение, достойное того, чтобы ради удач терпеть и неудачи.",
				"Ћишь тот достоин жизни и свободы, кто каждый день за них идет на бой.",
				"∆изнь - не те дни, что прошли, а те, что запомнились.",
				"∆изнь Ч это театр, а люди в нем актеры.",
				"∆изнь Ч это то, что случаетс€ с нами, пока мы строим планы на будущее."
		};
		int index = new Random().nextInt(strings.length-1);
		String string = strings[index];
		return string;
	}
}

package ua.com.goit;

import java.util.Random;

public class QuoteGenerator {
	public String nextQuote() {
		String[] strings = new String[] {
				"����� � ��� �������� �����������, ��������� ����, ����� ���� ���� ������� � �������.",
				"���� ��� ������� ����� � �������, ��� ������ ���� �� ��� ���� �� ���.",
				"����� - �� �� ���, ��� ������, � ��, ��� �����������.",
				"����� � ��� �����, � ���� � ��� ������.",
				"����� � ��� ��, ��� ��������� � ����, ���� �� ������ ����� �� �������."
		};
		int index = new Random().nextInt(strings.length-1);
		String string = strings[index];
		return string;
	}
}

package ua.com.goit;

import java.util.Arrays;
import java.util.Scanner;

public class Kickstarter {
	private Categories categories;
	private Projects projects;	
	public Kickstarter(Categories categories, Projects projects) {
		this.categories=categories;
		this.projects = projects;
	}
	

	public void run() {
		QuoteGenerator quoteGenerator = new QuoteGenerator();
		System.out.println(quoteGenerator.nextQuote());
		
		while(true){
			
		askCategory();
		
		int categoryIndex = selectMenu();
		
		Category category = chooseCategory(categoryIndex);
		
		printProjects(category);
		
		
		
		}
	}


	private void printProjects(Category category) {
		//�������� ������ �������� � ����� ���������
		Project[] foundProgect = projects.getProjects(category);
		
		//������� ������ ��������
		for (Project project: foundProgect){
			printProject(project);
		}
	}


	private void printProject(Project project) {
		System.out.println("�������� ������� - " + project.getName());
		System.out.println("�������� ������� - " + project.getDescription());
		System.out.println("������� ���� ������� - " + project.getAmount());
		System.out.println("������� ������� - " + project.getExist());
		System.out.println("�������� ���� - " + project.getDays());
		System.out.println("---------------------------------");
	}


	private void askCategory() {
		//���������� ������� ���������
		System.out.println();
		System.out.println("�������� ���������:");
		System.out.println(Arrays.toString(categories.getCategories()));
	}


	private Category chooseCategory(int categoryIndex) {
		//������� ���������
		Category category=categories.getName(categoryIndex);
		System.out.println("�� ������� ��������� "+ category.getName());
		System.out.println("---------------------------------");
		return category;
	}


	private int selectMenu() {
		//���������� ����� ��������� ���� �������
		Scanner scanner = new Scanner(System.in);
		int categoryIndex = scanner.nextInt();
		return categoryIndex;
	}


	
	
	
}

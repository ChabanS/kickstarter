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
		//получаем спимок проектов в даной категории
		Project[] foundProgect = projects.getProjects(category);
		
		//выводим список проектов
		for (Project project: foundProgect){
			printProject(project);
		}
	}


	private void printProject(Project project) {
		System.out.println("Ќазвание проекта - " + project.getName());
		System.out.println("ќписание проекта - " + project.getDescription());
		System.out.println("—колько надо собрать - " + project.getAmount());
		System.out.println("—колько собрали - " + project.getExist());
		System.out.println("ќсталось дней - " + project.getDays());
		System.out.println("---------------------------------");
	}


	private void askCategory() {
		//предлагаем выбрать категорию
		System.out.println();
		System.out.println("¬ыберите категорию:");
		System.out.println(Arrays.toString(categories.getCategories()));
	}


	private Category chooseCategory(int categoryIndex) {
		//¬ыводим категорию
		Category category=categories.getName(categoryIndex);
		System.out.println("¬ы выбрали категорию "+ category.getName());
		System.out.println("---------------------------------");
		return category;
	}


	private int selectMenu() {
		//спрашиваем какуб категорию надо выбрать
		Scanner scanner = new Scanner(System.in);
		int categoryIndex = scanner.nextInt();
		return categoryIndex;
	}


	
	
	
}

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
	

	public static void main(String[] args) {
		Category category1 = new Category("Photo");
		Category category2 = new Category("Video");
		Category category3 = new Category("Music");
		
		Categories categories = new Categories();
		categories.add(category1);
		categories.add(category2);
		categories.add(category3);
		
		Project project1 = new Project("Фильмы про програмирование", 1000, 15, "описание фильма");
		Project project2 = new Project("Фильмы про танцы", 5000, 10, "описание фильма");
		
		project1.setCategory(category2);
		project2.setCategory(category2);
		
		
		Projects projects = new Projects();
		projects.add(project1);
		projects.add(project2);
		
		Kickstarter app = new Kickstarter(categories, projects);
		app.run();
	}
	
	private void run() {
		QuoteGenerator quoteGenerator = new QuoteGenerator();
		System.out.println(quoteGenerator.nextQuote());
		while(true){
		System.out.println();
		System.out.println("Выберите категорию:");
		System.out.println(Arrays.toString(categories.getCategories()));
		
		Scanner scanner = new Scanner(System.in);
		int categoryIndex = scanner.nextInt();
		Category category=categories.getName(categoryIndex);
		System.out.println("Вы выбрали категорию "+ category.getName());
		System.out.println("---------------------------------");
		Project[] foundProgect = projects.getProjects(category);
//		for (int index=0; index<foundProgect.length; index++){
//			System.out.println(foundProgect[index]);
//		}
		for (Project project: foundProgect){
			System.out.println("Название проекта - " + project.getName());
			System.out.println("Описание проекта - " + project.getDescription());
			System.out.println("Сколько надо собрать - " + project.getAmount());
			System.out.println("Сколько собрали - " + project.getExist());
			System.out.println("Осталось дней - " + project.getDays());
			System.out.println("---------------------------------");

		}
		}
	}


	
	
	
}

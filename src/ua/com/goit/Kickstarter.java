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
		
			while(true){
				askProject();
				int projectIndex = selectMenu();
				Project project= chooseProject(projectIndex);
				printPojectDetails(project);
				
			}
		
		}
	}


	private void askProject() {
		//предлагаем выбрать категорию
		System.out.println();
		System.out.println("¬ыберите проект:");
				
	}


	private void printPojectDetails(Project project) {
		printProject(project);
		System.out.println(project.getHistory());
		System.out.println(project.getDemoVideo());
		System.out.println(project.getQuenstionAnswers());
		
	}


	private Project chooseProject(int projectIndex) {
		Project project=projects.get(projectIndex);
		System.out.println("¬ы выбрали проект - \""+ project.getName()+"\"");
		System.out.println("---------------------------------");
		return project;
	}


	private void printProjects(Category category) {
		//получаем спимок проектов в даной категории
		Project[] foundProgect = projects.getProjects(category);
		
		//выводим список проектов
		for (int index = 0; index < foundProgect.length; index++){
			Project project = foundProgect[index];
			System.out.print(index + " - ");
			printProject(project);
		}
	}


	private void printProject(Project project) {
		System.out.println(project.getName());
		System.out.println("ќписание проекта - " + project.getDescription());
		System.out.print("Ќадо собрать - " + project.getAmount());
		System.out.println(" за " + project.getDays() +" дней ");
		System.out.println("—обрали - " + project.getExist());
		
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
		Category category=categories.get(categoryIndex);
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

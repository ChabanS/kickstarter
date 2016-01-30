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
			if (categoryIndex < 0 || categories.getCategories().length<=categoryIndex){
				System.out.println("Неверный индекс меню " + categoryIndex);
				continue;
			}
			Category category = chooseCategory(categoryIndex);
			Project[] foundProgect = projects.getProjects(category);
			
			
			
			
			printProjects(foundProgect);
		
			while(true){
				askProject();
				int projectIndex = selectMenu();
				if (projectIndex < 0 || foundProgect.length<=projectIndex){
					System.out.println("Неверный индекс меню " + projectIndex);
					continue;
				}
				Project project= foundProgect[projectIndex];
				chooseProject(project);
				printPojectDetails(project);
				
			}
		
		}
	}


	private void askProject() {
		//предлагаем выбрать категорию
		System.out.println();
		System.out.println("Выберите проект:");
	}

	private void printPojectDetails(Project project) {
		printProject(project);
		System.out.println(project.getHistory());
		System.out.println(project.getDemoVideo());
		System.out.println(project.getQuenstionAnswers());
		System.out.println("---------------------------------");
	}

	private void chooseProject(Project project) {
		System.out.println("Вы выбрали проект - \""+ project.getName()+"\"");
		System.out.println("---------------------------------");
	}

	private void printProjects(Project[] foundProgect) {
		//выводим список проектов
		for (int index = 0; index < foundProgect.length; index++){
			Project project = foundProgect[index];
			System.out.print(index + " - ");
			printProject(project);
		}
	}

	private void printProject(Project project) {
		System.out.println(project.getName());
		System.out.println("Описание проекта - " + project.getDescription());
		System.out.print("Надо собрать - " + project.getAmount());
		System.out.println(" за " + project.getDays() +" дней ");
		System.out.println("Собрали - " + project.getExist());
		System.out.println("---------------------------------");
	}


	private void askCategory() {
		//предлагаем выбрать категорию
		System.out.println();
		System.out.println("Выберите категорию:");
		System.out.println(Arrays.toString(categories.getCategories()));
	}


	private Category chooseCategory(int categoryIndex) {
		//Выводим категорию
		Category category=categories.get(categoryIndex);
		System.out.println("Вы выбрали категорию "+ category.getName());
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

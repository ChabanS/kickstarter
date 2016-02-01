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
			if (0 >= categoryIndex   || categories.getCategories().length<=categoryIndex-1){
				System.out.println("�������� ������ ���� " + categoryIndex);
				continue;
			}
			Category category = chooseCategory(categoryIndex);
			Project[] foundProgect = projects.getProjects(category);
			printProjects(foundProgect);
		
			projectMenu(foundProgect);
		}
	}


	private void projectMenu(Project[] foundProgect) {
		while(true){
			askProject(foundProgect);
			int projectIndex = selectMenu();
			if(projectIndex==0){
				break;
			}
			Project project = chooseProject(projectIndex, foundProgect);
			if (project==null){
				continue;
			}
			chooseProject(project);
			printPojectDetails(project);
			
		}
	}

	private Project chooseProject(int projectIndex, Project[] foundProgect) {
		// TODO Auto-generated method stub
		if (0 >= projectIndex   || foundProgect.length<=projectIndex-1){
			System.out.println("�������� ������ ���� " + projectIndex);
			return null;
		}
		return foundProgect[projectIndex-1];
	}


	private void askProject(Project[] foundProgect) {
		//���������� ������� ���������
		System.out.println();
		int from=1;
		int to = foundProgect.length;
		System.out.println("�������� ������ [�� "+ from +" �� " +to+"], 0 - ����� �� ����");
	}

	private void printPojectDetails(Project project) {
		printProject(project);
		System.out.println(project.getHistory());
		System.out.println(project.getDemoVideo());
		String quenstionAnswers = project.getQuenstionAnswers();
		if(quenstionAnswers != null){
		System.out.println(quenstionAnswers);
		}
		System.out.println("---------------------------------");
	}

	private void chooseProject(Project project) {
		System.out.println("�� ������� ������ - \""+ project.getName()+"\"");
		System.out.println("---------------------------------");
	}

	private void printProjects(Project[] foundProgect) {
		//������� ������ ��������
		for (int index = 0; index < foundProgect.length; index++){
			Project project = foundProgect[index];
			System.out.print((index + 1) + " - ");
			printProject(project);
		}
	}

	private void printProject(Project project) {
		System.out.println(project.getName());
		System.out.println("�������� ������� - " + project.getDescription());
		System.out.print("���� ������� - " + project.getAmount());
		System.out.println(" �� " + project.getDays() +" ���� ");
		System.out.println("������� - " + project.getExist());
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
//		if (categoryIndex < 0 || categories.getCategories().length<=categoryIndex){
//			System.out.println("�������� ������ ���� " + categoryIndex);
//			return null;
//		}
		Category category=categories.get(categoryIndex-1);
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

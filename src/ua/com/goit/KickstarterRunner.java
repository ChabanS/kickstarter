package ua.com.goit;

public class KickstarterRunner {

	public static void main(String[] args) {
		Category category1 = new Category("Photo");
		Category category2 = new Category("Video");
		Category category3 = new Category("Music");
		
		Categories categories = new Categories();
		categories.add(category1);
		categories.add(category2);
		categories.add(category3);
		
		Project project1 = new Project("������ ��� ���������������", 1000, 15, "�������� ������", "http://inetshop.com.ua");
		Project project2 = new Project("������ ��� �����", 5000, 10, "�������� ������", "http://manuscura.com.ua");
		
		project1.setCategory(category2);
		project2.setCategory(category2);
		
		project1.setHistory("������� ������� ��������");
		project2.setHistory("������� ������� �������.....");
		
//		project1.setDemoVideo("http://inetshop.com.ua");
//		project2.setDemoVideo("http://manuscura.com.ua");
		
		Projects projects = new Projects();
		projects.add(project1);
		projects.add(project2);
		
		Kickstarter app = new Kickstarter(categories, projects);
		app.run();
	}

}

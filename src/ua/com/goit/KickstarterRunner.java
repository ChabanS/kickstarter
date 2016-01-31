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
		
		Project project1 = new Project("Фильмы про програмирование", 1000, 15, "описание фильма", "http://inetshop.com.ua");
		Project project2 = new Project("Фильмы про танцы", 5000, 10, "описание фильма", "http://manuscura.com.ua");
		
		project1.setCategory(category2);
		project2.setCategory(category2);
		
		project1.setHistory("История первого проектра");
		project2.setHistory("История проекта второго.....");
		
//		project1.setDemoVideo("http://inetshop.com.ua");
//		project2.setDemoVideo("http://manuscura.com.ua");
		
		Projects projects = new Projects();
		projects.add(project1);
		projects.add(project2);
		
		Kickstarter app = new Kickstarter(categories, projects);
		app.run();
	}

}

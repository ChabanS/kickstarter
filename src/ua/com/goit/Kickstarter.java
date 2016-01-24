package ua.com.goit;

import java.util.Arrays;

public class Kickstarter {
	private Categories categories;	
	public Kickstarter(Categories categories2) {
		this.categories=categories2;
	}



	public static void main(String[] args) {
		Category category1 = new Category("Photo");
		Category category2 = new Category("Video");
		Category category3 = new Category("Music");
		
		Categories categories = new Categories();
		categories.add(category1);
		categories.add(category2);
		categories.add(category3);
	
		Kickstarter app = new Kickstarter(categories);
		app.run();
		//System.out.println(Arrays.toString(categories.getCategories()));
	}

	

	
	private void run() {
		QuoteGenerator quoteGenerator = new QuoteGenerator();
		System.out.println(quoteGenerator.nextQuote());
		
		System.out.println();
		System.out.println("Выберите категорию:");
		System.out.println(Arrays.toString(categories.getCategories()));
	}


	
	
	
}

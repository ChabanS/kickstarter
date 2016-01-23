package ua.com.goit;



public class Kickstarter {

	public static void main(String[] args) {
		
	Kickstarter app = new Kickstarter();
	
	app.run();
	
	}

	private void run() {
		QuoteGenerator quoteGenerator = new QuoteGenerator();
		System.out.println(quoteGenerator.nextQuote());
	}


	
	
	
}

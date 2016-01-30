package ua.com.goit;

public class Project {

	private String name;
	private int amount;
	private int days;
	private Category category;
	private String description;
	private int exist;
	
public Project(String name, int amount, int days, String description) {
	this.name = name;
	this.amount = amount;
	this.days = days;
	this.description = description;
	this.exist = 0;
}

public void setCategory(Category category) {
	this.category = category;
	
}

public Category getCategory() {
	// TODO Auto-generated method stub
	return category;
}
	public String getName() {
		return name;
	}

	public int getAmount() {
		return amount;
	}

	public int getDays() {
		return days;
	}

	public String getDescription() {
		return description;
	}

	public int getExist() {
		return exist;
	}

	public String getHistory() {
		// TODO Auto-generated method stub
		return "тут будет история проектка";
	}

	public String getDemoVideo() {
		// TODO Auto-generated method stub
		return "http://inetshop.com.ua";
	}

	public String getQuenstionAnswers() {
		// TODO Auto-generated method stub
		return "Вопросы \nОтветы";
	}


}

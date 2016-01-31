package ua.com.goit;

public class Project {

	private String name;
	private int amount;
	private int days;
	private Category category;
	private String description;
	private int exist;
	private String history;
	private String demoVideo;
	private String quenstionAnswers;
	






public Project(String name, int amount, int days, String description, String demoVideo) {
	this.name = name;
	this.amount = amount;
	this.days = days;
	this.description = description;
	this.exist = 0;
	this.history = null;
	this.demoVideo = demoVideo;
	this.quenstionAnswers = null;
}

public void setCategory(Category category) {
	this.category = category;
	
}

public Category getCategory() {
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
	
	public void setHistory(String history) {
		this.history = history;
	}
	public String getHistory() {
		return history;
	}
	
	public void setDemoVideo(String demoVideo) {
		this.demoVideo = demoVideo;
	}
	public String getDemoVideo() {
		return demoVideo;
	}
	
	public void setQuenstionAnswers(String quenstionAnswers) {
		this.quenstionAnswers = quenstionAnswers;
	}
	public String getQuenstionAnswers() {
		return quenstionAnswers; //"Вопросы \nОтветы";
	}


}

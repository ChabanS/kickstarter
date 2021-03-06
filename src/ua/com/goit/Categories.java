package ua.com.goit;

public class Categories {

	private Category[] categories = new Category[10];
	
	private int count = 0;
	
	public void add(Category category) {
		categories[count]=category;
		count++;
	}
	
	public String[] getCategories(){
		String[] result = new String[count];
		for(int index = 0; index < count; index++){//����� �� ����� ������� � 1
			result[index]=String.valueOf(index+1) + " - " + categories[index].getName();
		}
		return result;
	}

	public Category get(int categoryIndex) {
		return categories[categoryIndex];
	}

}

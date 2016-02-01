package ua.com.goit;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class CategoriesTest {
	@Test
	public void categoriesTestAddCategory (){
		Categories list = new Categories();
		
		Category category = new Category("name1");
		list.add(category);
		
		String[] categories = list.getCategories();
		assertEquals("[1 - name1]", 
				Arrays.toString(categories));
	}

	@Test
	public void categoriesTestAddNoCategory (){
		Categories list = new Categories();
		
		String[] categories = list.getCategories();
		assertEquals("[]", 
				Arrays.toString(categories));
	}
	
	@Test
	public void categoriesTestGetCategoryIndex (){
		Categories list = new Categories();
		Category category1 = new Category("name1");
		list.add(category1);
		
		Category category2 = new Category("name2");
		list.add(category2);
		
		assertSame(category1, list.get(0));
		assertSame(category2, list.get(1));
	}
}

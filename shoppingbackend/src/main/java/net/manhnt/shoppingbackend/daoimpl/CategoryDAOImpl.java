package net.manhnt.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.manhnt.shoppingbackend.dao.CategoryDAO;
import net.manhnt.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static {
		//first category
		Category category = new Category();
		category.setId(1);
		category.setDescription("This is a descriptsion for television");
		category.setName("Television");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		//second category
		category = new Category();
		category.setId(2);
		category.setDescription("This is a descriptsion for mobilephone");
		category.setName("Mobile phone");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		//third category
		category = new Category();
		category.setId(3);
		category.setDescription("This is a descriptsion for laptop");
		category.setName("Laptop");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
		
		
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
		
	}
	
	
	public static void main(String[] args) {
		for (Category category : categories) {
			System.out.println(category.getName());
		}
	}


	@Override
	public Category get(int id) {
		for (Category category : categories) {
			if(category.getId() == id) return category;
		}
		return null;
	}

}

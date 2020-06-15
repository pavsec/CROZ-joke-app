package croz.webapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import croz.webapp.dao.CategoryRepo;
import croz.webapp.model.Category;

@Service
public class CategoryService {
	
	@Autowired
    private CategoryRepo categoryRepo;

	 
	 public List<Category> listAll(){
		 return categoryRepo.findAll();
	 }
}

package croz.webapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import croz.webapp.model.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

	Category findByName(String name);
}

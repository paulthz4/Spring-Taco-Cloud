
// using jdbcTemplate (without Spring Data JPA)
//package tacos.data;
//
//import tacos.Ingredient;
//
//public interface IngredientRepository {
//	
//	Iterable<Ingredient> findAll();
//	
//	Ingredient findOne(String id);
//	
//	Ingredient save(Ingredient ingredient);
//}
package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
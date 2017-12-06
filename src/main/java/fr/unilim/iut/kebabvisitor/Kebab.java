package fr.unilim.iut.kebabvisitor;

import java.util.List;

import fr.unilim.iut.kebabvisitor.ingredients.Ingredient;

public interface Kebab {
	List<Ingredient> getIngredients();
	boolean isVegetarien();
	boolean isPescetarien();
}

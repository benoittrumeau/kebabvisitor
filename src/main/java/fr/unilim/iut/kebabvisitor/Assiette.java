package fr.unilim.iut.kebabvisitor;

import java.util.LinkedList;
import java.util.List;

import fr.unilim.iut.kebabvisitor.ingredients.Ingredient;

public class Assiette implements Kebab {

	public List<Ingredient> getIngredients() {
		return new LinkedList<Ingredient>();
	}

	public boolean isVegetarien() {
		return true;
	}

	public boolean isPescetarien() {
		return true;
	}
}

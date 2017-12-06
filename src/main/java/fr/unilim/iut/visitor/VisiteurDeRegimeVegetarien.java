package fr.unilim.iut.visitor;

import fr.unilim.iut.kebabvisitor.Assiette;
import fr.unilim.iut.kebabvisitor.ingredients.Agneau;
import fr.unilim.iut.kebabvisitor.ingredients.Boeuf;
import fr.unilim.iut.kebabvisitor.ingredients.Crevette;
import fr.unilim.iut.kebabvisitor.ingredients.Fromage;
import fr.unilim.iut.kebabvisitor.ingredients.Oignon;
import fr.unilim.iut.kebabvisitor.ingredients.Pain;
import fr.unilim.iut.kebabvisitor.ingredients.Salade;
import fr.unilim.iut.kebabvisitor.ingredients.Sauce;
import fr.unilim.iut.kebabvisitor.ingredients.Thon;
import fr.unilim.iut.kebabvisitor.ingredients.Tomate;

public class VisiteurDeRegimeVegetarien {
	public boolean visit(Agneau ingredientAgneau){
		return false;
	}
	
	public boolean visit(Boeuf ingredientBoeuf){
		return false;
	}
	
	public boolean visit(Crevette ingredientCrevette){
		return false;
	}
	
	public boolean visit(Fromage ingredientFromage){
		return false;
	}
	
	public boolean visit(Oignon ingredientOignon){
		return false;
	}
	
	public boolean visit(Pain ingredientPain){
		return false;
	}
	
	public boolean visit(Salade ingredientSalade){
		return false;
	}
	
	public boolean visit(Sauce ingredientSauce){
		return false;
	}
	
	public boolean visit(Thon ingredientThon){
		return false;
	}
	
	public boolean visit(Tomate ingredientTomate){
		return false;
	}
	
	public boolean visit(Assiette ingredientAssiette) {
		return false;
	}
}


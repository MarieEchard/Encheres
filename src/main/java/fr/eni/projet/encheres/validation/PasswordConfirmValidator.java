package fr.eni.projet.encheres.validation;

import fr.eni.projet.encheres.bo.Utilisateur;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordConfirmValidator implements

	ConstraintValidator<PasswordValidator, String> {
	
	// Méthode d'initialisation du validateur
	@Override
	public void initialize(PasswordValidator passwordValidator) {
		// aucune initialisation nécessaire.
	}

	// Méthode de validation
	@Override
	public boolean isValid(String contactField, ConstraintValidatorContext cxt) {
		 // Crée une nouvelle instance d'Utilisateur
		Utilisateur util = new Utilisateur(); 
		
		// Compare le champ à valider avec le mot de passe de l'utilisateur
        // Si le champ à valider n'est pas égal au mot de passe de l'utilisateur, la validation réussit.
		return contactField != util.getMot_de_passe();
		
	}

}

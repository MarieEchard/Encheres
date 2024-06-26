package fr.eni.projet.encheres.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Constraint(validatedBy = PasswordConfirmValidator.class)
//Spécifie où l'annotation peut être utilisée. 
//Dans ce cas, elle peut être utilisée sur des méthodes et des champs.
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordValidator {
	String message() default "Error - matching password";
	
	 // Méthodes par défaut pour les groupes et charges utiles de validation
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

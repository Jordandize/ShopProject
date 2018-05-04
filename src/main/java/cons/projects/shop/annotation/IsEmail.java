package cons.projects.shop.annotation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import cons.projects.shop.validator.IsEmailValidator;

@Target    ({ TYPE, FIELD, ANNOTATION_TYPE }) 
@Retention (RUNTIME)
@Constraint(validatedBy = IsEmailValidator.class)
@Documented
public @interface IsEmail {
	
    String message() default "Invalid email";
    
    Class<?>                []  groups() default { }; 
    
    Class<? extends Payload>[] payload() default { };
    
}
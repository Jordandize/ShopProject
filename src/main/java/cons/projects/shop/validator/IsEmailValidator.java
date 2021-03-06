package cons.projects.shop.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import cons.projects.shop.annotation.IsEmail;

public class IsEmailValidator implements ConstraintValidator<IsEmail, String> {
	
	private Pattern pattern;
	
	private Matcher matcher;
	
	private static final String EMAIL_PATTERN = 
			"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	@Override
	public void initialize(final IsEmail constraintAnnotation) { }

	@Override
	public boolean isValid(final String email, final ConstraintValidatorContext context) {
		return validateEmail(email);
	}
	
	private boolean validateEmail(final String email) {
		pattern = Pattern.compile(EMAIL_PATTERN);
		matcher = pattern.matcher(email);
		return matcher.matches();
	}

}

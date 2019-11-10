package pla6.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidarMailReglasValidacion implements ConstraintValidator<ValidarMail, String> {

	@Override
	public void initialize(ValidarMail dni) {
	}

	@Override
	public boolean isValid(String mail, ConstraintValidatorContext cxt) {

		Pattern pat = Pattern.compile("^(.+)@(.+)$");
		Matcher mat = pat.matcher(mail);
		
		return mat.matches();
	}

}
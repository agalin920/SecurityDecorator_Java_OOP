package driver4;

public class PasswordValidatorSaludador implements IPasswordValidator{
	
	
	PasswordValidator myDecoratedValidator;
		
	public PasswordValidatorSaludador() {
		
		myDecoratedValidator = new PasswordValidator();
	}

	public boolean autenticar(String password) {
		
		boolean result = myDecoratedValidator.autenticar(password);
		System.out.println("ingresaste con el password: "+ password);
		return result;
	}
}
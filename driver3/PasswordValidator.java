package driver3;

public class PasswordValidator implements IPasswordValidator{
	
	
	
	
	public boolean autenticar (String password){
		
		
		if (password != null && password.equals("chidoliro"))
			return true;
		else
			return false;
	}
}
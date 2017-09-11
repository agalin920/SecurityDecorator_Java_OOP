package driver3;

import java.lang.reflect.Constructor;
import java.util.ResourceBundle;

public class FabricaObjetos {

	public Object fabricar(String classname) {
		
		String recurso = getRecurso(classname);
		  try {
	           Class<?> cls = Class.forName(recurso);
	           Constructor<?> ct = cls.getConstructor();
	           Object retobj = ct.newInstance();
	           return retobj;
	        }
	        catch (Throwable e) {
	           System.err.println(e);
	        }
	           return null;
		
		
	}
	
	private String getRecurso(String recurso){
	
	/* Leyendo archivo de recursos */
	ResourceBundle appResource = ResourceBundle.getBundle("driver3.recursos");
	
	/* Buscando propiedad coincidente */
	return appResource.getString(recurso);
	}

}

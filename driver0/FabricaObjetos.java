package driver0;

import java.lang.reflect.Constructor;

public class FabricaObjetos {

	public synchronized Object fabricar(String classname) {
		
		  try {
	           Class<?> cls = Class.forName(classname);
	           Constructor<?> ct = cls.getConstructor();
	           Object retobj = ct.newInstance();
	           return retobj;
	        }
	        catch (Throwable e) {
	           System.err.println(e);
	        }
	           return null;
	}

}

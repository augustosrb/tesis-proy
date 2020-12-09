package pe.finan.server.util;

import java.util.ArrayList;
import java.util.Arrays;

public class HelperJDBC {
	
	public static Object[] appendValue(Object[] obj, Object newObj) {

		ArrayList<Object> temp = new ArrayList<Object>(Arrays.asList(obj));
		temp.add(newObj);
		return temp.toArray();

	}

}

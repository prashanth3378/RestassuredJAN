package selizationandDesirlization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoclassesforserlizationanddesirlization.Emp;

public class pojoselization {

	public static void main(String[] args) throws Throwable, Throwable, Throwable {
		// TODO Auto-generated method stub
Emp e=new Emp("prash", "fgh", "ghfhg", 1233);
ObjectMapper ob = new ObjectMapper();
ob.writeValue(new File("./dt.json"), e);


	}	

}

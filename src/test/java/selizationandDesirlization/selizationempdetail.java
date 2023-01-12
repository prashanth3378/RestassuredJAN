package selizationandDesirlization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoclassesforserlizationanddesirlization.Employeedetail;

public class selizationempdetail {

	public static void main(String[] args) throws Throwable, Throwable, Throwable {
		// TODO Auto-generated method stub
		Employeedetail emp=new Employeedetail("prash", "fgh", "ghfhg", 1233,"roj","heloo");
		ObjectMapper map=new ObjectMapper();
		map.writeValue(new File("./dt.json"), emp);

	}

}

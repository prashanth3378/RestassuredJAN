package selizationandDesirlization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoclassesforserlizationanddesirlization.Emp;
import pojoclassesforserlizationanddesirlization.Employeedetail;

public class desirlizationempdetails {

	public static void main(String[] args) throws Throwable, Throwable, Throwable {
		// TODO Auto-generated method stub
		ObjectMapper mapper1 = new ObjectMapper();
		Employeedetail ob = mapper1.readValue(new File("./dt.json"), Employeedetail.class);
		System.out.println(ob.getPhno());
		System.out.println(ob.getEmailId());
	}

	}



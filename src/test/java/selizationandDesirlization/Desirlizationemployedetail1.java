package selizationandDesirlization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoclassesforserlizationanddesirlization.Employedetail1;

public class Desirlizationemployedetail1 {

	public static void main(String[] args) throws Throwable, Throwable, Throwable {
		// TODO Auto-generated method stub
ObjectMapper ob=new ObjectMapper();
Employedetail1 obj = ob.readValue(new File("./emp.json"),Employedetail1.class );
System.out.println(obj.getEmailId());

	}

}

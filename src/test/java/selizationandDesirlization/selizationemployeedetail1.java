package selizationandDesirlization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoclassesforserlizationanddesirlization.Employedetail1;

public class selizationemployeedetail1 {

	public static void main(String[] args) throws Throwable, Throwable, IOException {
		// TODO Auto-generated method stub
		String []arr= {"pash@gmail.com","ffg@gmail.com"};
		int [] ph= {14455,965566};
		Employedetail1 ep1=new Employedetail1("prashi","ty32", arr,ph ,"bangalore");
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(new File("./emp.json"), ep1);
		
	}

}

package nl.home.coemba;

import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local
public class MyEjbTest implements Processor {

	public void parkTask() {
		System.out.println("MyEjbTest task park");
		
	}

	
}

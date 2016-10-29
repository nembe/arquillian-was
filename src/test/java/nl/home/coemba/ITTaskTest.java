package nl.home.coemba;

import javax.ejb.EJB;



import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class ITTaskTest {
	@EJB
	MyEjbTest test3;

	@Deployment
	public static JavaArchive createDeploymentWorkMyEJB() {

	JavaArchive jar = ShrinkWrap.create(JavaArchive.class, "test.jar");

	jar.addClass(Processor.class);
	jar.addClass(MyEjbTest.class);	
	System.out.println(jar.toString(true));
	return jar;
	}

	@Test
	public void checkMyEjbTestBean() throws Exception {
	Assert.assertNotNull("Verify that the MyEjbTest Bean has been injected", test3);

	}
}

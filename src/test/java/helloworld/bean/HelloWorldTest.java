package helloworld.bean;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class HelloWorldTest {
	
	@Inject
	HelloWorld helloWorld;

	@Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
            .addClass(HelloWorld.class)
            .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Test
    public void getTitle() {
    	Assert.assertEquals("CI/CD Demo", helloWorld.getTitle());
    }
    
    @Test
    public void sayHello() {
    	Assert.assertEquals("Hello World!", helloWorld.sayHello());
    }
	
    @Test
    public void getCurrentTimeMillis() {
    	Assert.assertTrue(helloWorld.getCurrentTimeMillis() > 0);
    }
    
}

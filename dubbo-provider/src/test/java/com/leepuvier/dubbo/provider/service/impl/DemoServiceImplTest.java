package  com.leepuvier.dubbo.provider.service.impl; 

import com.leepuvier.dubbo.common.service.DemoService;
import com.leepuvier.dubbo.provider.ProviderApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
* DemoServiceImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>06/12/2020</pre> 
* @version 1.0 
*/

@RunWith( SpringJUnit4ClassRunner.class )
@SpringBootTest(classes = ProviderApplication.class )
public class DemoServiceImplTest {

    @Autowired
    private DemoService demoService;

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: sayHello(String name) 
* 
*/ 
@Test
public void testSayHello() throws Exception {
    String test = demoService.sayHello("Dubbo");
    Assert.assertEquals(test, "Hello Dubbo");

}


} 

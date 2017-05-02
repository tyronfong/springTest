package pri.tyron.test.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by tyron on 4/24/2017.
 */
public class Main {

//    @Autowired
//    private static Hello hello;

    public static void main(String... args){
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello = (Hello)factory.getBean("hello");//map.get("hello")
        System.out.print(hello.getName());
    }
}

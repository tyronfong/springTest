package pri.tyron.test.spring;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
/**
 * Created by tyron on 5/2/2017.
 */
@ContextConfiguration("/applicationContext.xml")
public class TestConfigurationContext {
    @Test
    public void sampleTest(){
        System.out.println("Start print ClassWithStaticBlock.env: ");
    }
}

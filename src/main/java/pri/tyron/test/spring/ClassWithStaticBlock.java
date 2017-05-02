package pri.tyron.test.spring;

import java.util.Map;

/**
 * Created by tyron on 4/25/2017.
 */
public class ClassWithStaticBlock {
    private static String env;
    static {
        env = System.getenv().get("JAVA_HOME")+" ;";

    }
}

package testng;

import org.testng.annotations.*;

public class TestNGExampleTest3 {

    @Test (retryAnalyzer = Retry.class)
    public void dependsOn() {
        throw new NullPointerException();
    }

    @Test
    public void anotherMethod() {
        throw new NullPointerException();
    }

    @Test(alwaysRun = true, dependsOnMethods = {"dependsOn", "anotherMethod"})
    public void test1() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

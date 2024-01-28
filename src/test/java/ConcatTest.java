import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConcatTest {
    @Test
    @Feature("First Test")
    public void test1() {
        Concat concat = new Concat();
        Assert.assertEquals("Ridiculous", Concat.concatinate("Ridi", "culous"));
    }

    @Test
    @Feature("Second Test")
    public void test2() {
        Assert.assertEquals("Sectumsempra", Concat.concatinate("Sectum", "sempra"));
    }

    @Test
    @Feature("Third Test")
    public void test3() {
        Assert.assertEquals("yesyes", Concat.concatinate("yes", "yes"));
    }

    @Test
    @Feature("FOurth Test")
    public void test4() {
        Assert.assertEquals("sukanahui", Concat.concatinate("suka", "nahui"));
    }
}

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConcatTest {
    @Test
    public void test1() {
        Concat concat = new Concat();
        Assert.assertEquals("Ridiculous", Concat.concatinate("Ridi", "culouss"));
    }
}

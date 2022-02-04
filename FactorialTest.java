
import org.junit.*;
import static org.junit.Assert.*;

public class FactorialTest {
    
    @Test
    public void test1() {
        Factorial fact = new Factorial();
        assertEquals(5, fact.Fact(3));
    }
}

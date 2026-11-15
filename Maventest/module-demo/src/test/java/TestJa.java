import org.junit.Test;
import org.test.ja;
import static org.junit.Assert.assertEquals;

public class TestJa {
    @Test
    public void testsay(){
        ja ja = new ja();
        ja.say("World");
        assertEquals("Hello World!", ja.say("World"));
    }
}

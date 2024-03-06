import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JobTest {

    @Test
    public void testAdd1et5(){
        int result = Job.add(1,5);
        Assertions.assertEquals(6, result);
    }

}

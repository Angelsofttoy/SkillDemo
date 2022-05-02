import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest{

    @Test
    public void subtractionTest(){
        SkillDemo.subtraction(3, 2);

        assertEquals(2, SkillDemo.subtraction(3, 2));
    }

}

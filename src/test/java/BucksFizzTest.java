import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BucksFizzTest {

    BucksFizz bucksFizz;

    @Before
    public void before(){
        bucksFizz = new BucksFizz(100);
    }

    @Test
    public void canGetNumbers(){
        assertEquals(100, bucksFizz.getNumbers());
    }
}

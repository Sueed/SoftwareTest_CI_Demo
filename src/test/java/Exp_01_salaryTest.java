import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exp_01_salaryTest {

    @Test
    void commission_test() {
        Exp_01_salary test_target = new Exp_01_salary();
        assertEquals(-1,test_target.commission(-1,-2,3));
        assertEquals(94, test_target.commission(10,10,5));
        assertEquals(205, test_target.commission(15,10,50));
        assertEquals(280, test_target.commission(20,10,50));
    }

}
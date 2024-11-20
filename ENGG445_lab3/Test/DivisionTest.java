import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DivisionTest {
    @Test
    void divideByZero() throws Exception {
        java.lang.ArithmeticException thrown = assertThrows(java.lang.ArithmeticException.class, () -> {
            Division.division(10, 0);
        });

    }

    @Test
    void divisionUsingLoopValidArgs() throws Exception {
        long res = Division.divisionUsingLoop(10, 5);
        assertEquals(2, res);
    }

    @Test
    void divisionUsingLoopNegativeArgs() throws Exception {
        long res = Division.divisionUsingLoop(-6, 2);
        assertEquals(-3, res);
    }

    @Test
    void divisionUsingRecursionValidArgs() throws Exception {
        long res = Division.divisionUsingRecursion(10, 5);
        assertEquals(2, res);
    }
    @Test
    void divisionUsingShiftValidArgs() throws Exception {
        long res = Division.divisionUsingShift(10, 5);
        assertEquals(2, res);
    }
    @Test
    void divisionUsingLogsValidArgs1() throws Exception {
        long res = Division.divisionUsingLogs(10, 5);
        assertEquals(2, res);
    }

    @Test
    void divisionUsingLogsValidArgs2() throws Exception {
        long res = Division.divisionUsingLogs(14, 2);
        assertEquals(7, res);
    }

    @Test
    void divisionUsingMultiplicationValidArgs() throws Exception {
        long res = Division.divisionUsingMultiplication(10, 5);
        assertEquals(2, res);
    }
}



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceTest {
    @Test
    void distanceSameVectors() throws Exception{
        long[] v1 = {1, 2};
        long[] v2 = {1, 2};
        long result = Distance.chebyshevDistance(v1, v2);
        assertEquals(0, result);
    }

    @Test
    void distanceDiffVectors() throws Exception {
        long[] v1 = {1, 2};
        long[] v2 = {1, 3};
        long result = Distance.chebyshevDistance(v1, v2);
        assertNotEquals(0, result);

    }

    @Test
    void squaredDistanceConstantInput() {
        double x1 = 9999999;
        double x2 = 9999999;
        double y1 = 9999999;
        double y2 = 9999999;

        double result = Distance.squaredDistance(x1, y1, x2, y2);
        assertEquals(0.0, result);

    }

    @Test
    void euclideanDistanceTest() {
        double x1 = 5;
        double x2 = 3;
        double y1 = 14;
        double y2 = 7;

        double sqrt = Math.round(Distance.euclideanDistance(x1, y1, x2, y2));
        assertEquals(7, sqrt);
    }
}
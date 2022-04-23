import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WatermelonProblemTest {

    @Test
    void OddNumberInvalid() {
        var watermelon = new WatermelonProblem();
        assertEquals("NO" , watermelon.Check_Divisibility(9));

    }

    @Test
    void EvenNumberValid() {
        var watermelon = new WatermelonProblem();
        assertEquals("YES" , watermelon.Check_Divisibility(30));

    }

    @Test
    void GreaterThan100OutofRange() {
        var watermelon = new WatermelonProblem();
        assertEquals("Weight is out of range" , watermelon.Check_Divisibility(106));

    }

    @Test
    void NegativeOddOutofRange() {
        var watermelon = new WatermelonProblem();
        assertEquals("Weight is out of range" , watermelon.Check_Divisibility(-3));

    }

    @Test
    void NegativeEvenOutofRange() {
        var watermelon = new WatermelonProblem();
        assertEquals("Weight is out of range" , watermelon.Check_Divisibility(-8));

    }

    @Test
    void OneisInvalid() {
        var watermelon = new WatermelonProblem();
        assertEquals("NO" , watermelon.Check_Divisibility(1));

    }

}
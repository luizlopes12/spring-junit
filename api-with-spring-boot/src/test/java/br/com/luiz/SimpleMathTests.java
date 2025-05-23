package br.com.luiz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@DisplayName("Classe SimpleMathTest")
class SimpleMathTests {

    private final SimpleMath math = new SimpleMath();

    @Test
    @DisplayName("Teste soma - 8D + 2D = 10D")
    void testSum_EightAddTwoEqualTen() {
        assertEquals(10D, math.sum(8D, 2D));
    }

    @Test
    @DisplayName("Teste subtração - 20D - 13D = 7D")
    void testSub_TwentyMinusThirteenEqualsSeven() {
        assertEquals(7D, math.sub(20D, 13D));
    }

    @Test
    @DisplayName("Teste multiplicação - 4D * 5D = 20D")
    void testMul_FourTimesFiveEqualsTwenty() {
        assertEquals(20D, math.mul(4D, 5D));
    }

    @Test
    @DisplayName("Teste divisão - 20D / 4D = 5D")
    void testDiv_TwentyDividedByFourEqualsFive() {
        assertEquals(5D, math.div(20D, 4D));
    }

    @Test
    @DisplayName("Teste divisão por zero - deve lançar exceção")
    void testDiv_ByZeroShouldThrowException() {
        Exception exception = assertThrows(ArithmeticException.class, () -> math.div(10D, 0D));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

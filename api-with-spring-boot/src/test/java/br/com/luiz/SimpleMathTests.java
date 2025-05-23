package br.com.luiz;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SimpleMathTests {

    @Test
    void sum() {
        SimpleMath math = new SimpleMath();

        double actual = math.sum(8D, 2D);
        double expected = 10D;

        assertEquals(expected, actual);
    }

}

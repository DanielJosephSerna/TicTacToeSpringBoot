package cognizant.tictactoe.domain;

import cognizant.tictactoe.model.HealthCheck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TicTacToeDomainTest {

    private TicTacToeDom ticTacToeDom;

    @BeforeEach
    void setUp() {
        ticTacToeDom = new TicTacToeDom();
    }

    @Test
    void testHealthCheck() {
        // setup
        HealthCheck expected = new HealthCheck("Hello World!");

        // implement the test
        final HealthCheck actual = ticTacToeDom.healthCheck();

        // verify the results
        Assertions.assertEquals(expected, actual);
    }
}

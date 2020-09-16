package cognizant.tictactoe.service;

import cognizant.tictactoe.domain.TicTacToeDom;
import cognizant.tictactoe.model.HealthCheck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

class TicTacToeServiceTest {

    @Mock
    private TicTacToeDom ticTacToeDom;

    @InjectMocks
    private TicTacToeServ ticTacToeServ;

    @BeforeEach
    void setUp() {
        initMocks(this);
    }

    @Test
    void testHealthCheck() {
        // setup
        HealthCheck expected = new HealthCheck("Hello World!");
        when(ticTacToeDom.healthCheck()).thenReturn(expected);

        // run the tests
        final HealthCheck actual = ticTacToeServ.healthCheck();

        // verify the results
        Assertions.assertEquals(expected, actual);
    }
}

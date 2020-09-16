package cognizant.tictactoe.controller;

import cognizant.tictactoe.model.HealthCheck;
import cognizant.tictactoe.service.TicTacToeServ;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

class TicTacToeControllerTest {

    @Mock
    private TicTacToeServ ticTacToeServ;

    @InjectMocks
    private TicTacToe ticTacToe;

    @BeforeEach
    void setUp() {
        initMocks(this);
    }

    @Test
    void testHealthCheck() {
        // setup
        HealthCheck expected = new HealthCheck("Hello World!");
        when(ticTacToeServ.healthCheck()).thenReturn(expected);

        // run the test
        final ResponseEntity<HealthCheck> actual = ticTacToe.healthCheck();

        // verify the results
        Assertions.assertEquals(expected.getTestString(), actual.getBody().getTestString());
    }
}

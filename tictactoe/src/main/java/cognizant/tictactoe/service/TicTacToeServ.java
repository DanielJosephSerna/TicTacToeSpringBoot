package cognizant.tictactoe.service;

import cognizant.tictactoe.domain.TicTacToeDom;
import cognizant.tictactoe.model.HealthCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicTacToeServ implements  TicTacToeServInterface{

    @Autowired
    private TicTacToeDom ticTacToeDom;

    public HealthCheck healthCheck() {
        return ticTacToeDom.healthCheck();
    }
}

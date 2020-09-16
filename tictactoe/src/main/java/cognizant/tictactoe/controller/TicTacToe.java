package cognizant.tictactoe.controller;

import cognizant.tictactoe.model.HealthCheck;
import cognizant.tictactoe.service.TicTacToeServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TicTacToe {

    @Autowired
    private TicTacToeServ ticTacToeServ;

    @GetMapping(value="health-check", produces="application/json")
    public ResponseEntity<HealthCheck> healthCheck() {
        return new ResponseEntity<>(ticTacToeServ.healthCheck(), HttpStatus.OK);
    }
}

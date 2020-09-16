package cognizant.tictactoe.domain;

import cognizant.tictactoe.model.HealthCheck;
import org.springframework.stereotype.Component;

@Component
public class TicTacToeDom implements TicTacToeDomInterface {

    public HealthCheck healthCheck() {
        return new HealthCheck("Hello World!");
    }

}

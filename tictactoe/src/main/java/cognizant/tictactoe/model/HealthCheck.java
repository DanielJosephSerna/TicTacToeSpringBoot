package cognizant.tictactoe.model;

import lombok.Data;

@Data
public class HealthCheck {

    String testString;

    public String getTestString() {
        return testString;
    }

    public HealthCheck(String testString) {
        this.testString = testString;
    }
}

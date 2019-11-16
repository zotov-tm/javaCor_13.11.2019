package lesson1;

import lesson1.obstacle.Water;
import lesson1.participant.Human;

public class Team {
    String commandName;

    Competitor[] competitors ;

    public Team(String commandName) {
        this.commandName=commandName;
        this.competitors = new Competitor[]{new Human("Боб"), new Water.Cat("Барсик"), new Water.Dog("Бобик"), new Water.Cat("Мурзик")};
    }

    public void showResults() {
        for (Competitor c : competitors) {
            c.info();
        }
    }
}
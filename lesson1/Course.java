package lesson1;

import lesson1.obstacle.Cross;
import lesson1.obstacle.Obstacle;
import lesson1.obstacle.Wall;
import lesson1.obstacle.Water;

public class Course {
    Obstacle[] courses;

    public Course() {
        this.courses =new  Obstacle[]{new Cross(80), new Wall(1), new Water(2)};

    }

    public void doIt(Competitor[] competitors) {

        for (Competitor c : competitors) {
            for (Obstacle o : courses) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }
}

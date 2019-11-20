package lesson1;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        Team team = new Team("а");

        course.doIt(team.competitors);
        team.showResults();
    }
}

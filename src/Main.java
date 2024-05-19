import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Person.fromCsv("C:\\Users\\ydmidny\\IdeaProjects\\zad4\\src\\family.csv");
        System.out.println(people.get(0).generateTree());

    }
}
package project;
import java.util.List;
public class Main {

	public static void main(String[] args) {
       CRUD dbOps  = new CRUD();

        dbOps.createPerson("John Doe", 29);
        dbOps.createPerson("Jane Doe", 25);

        Person person = dbOps.readPerson(1);
        if (person != null) {
            System.out.println("Read Person: " + person.getName() + ", Id: " + person.getId());
        }

        dbOps.updatePerson(1, "John Smith", 30);

        dbOps.deletePerson(2);

        <Person> people = dbOps.listPeople();
        for (Person p : people) {
            System.out.println("Person ID: " + p.getId() + ", Name: " + p.getName());
        }
    }
}

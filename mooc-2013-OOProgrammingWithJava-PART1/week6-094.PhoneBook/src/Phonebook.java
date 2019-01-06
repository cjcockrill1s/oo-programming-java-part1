import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> people;

    public Phonebook() {
        this.people = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        this.people.add(new Person(name, number));
    }

    public void printAll() {
        for (Person person : this.people) {
            System.out.println(person.toString());
        }
    }

    public String searchNumber(String name) {
        for (Person person : this.people) {
            if (person.getName() == name) {
                return person.getNumber();
            }
        }
        return "Number not known";
    }
}

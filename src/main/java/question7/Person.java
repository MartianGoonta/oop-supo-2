package src.main.java.question7;

public class Person {
    private String firstName;
    private String surname;

    public Person(String firstName, String surname)
    {
        this.firstName = firstName;
        this.surname = surname;
    } 

    public String toString()
    {
        return firstName + " " + surname;
    }

    public static void testOutput()
    {
        Person p = new Person("Joe", "Bloggs");
        System.out.println("person details: " + p);
    }


    public static void main(String[] args)
    {
        testOutput();
    }
}

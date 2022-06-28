import javafx.util.Pair;

import java.util.Scanner;
import java.util.Vector;

public class Person
{
    private String name;
    private Vector<Pair<Integer, Integer>> slots;

    public Person(String name, Vector<Pair<Integer, Integer>> slots) {
        this.name = name;
        this.slots = slots;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector<Pair<Integer, Integer>> getSlots() {
        return slots;
    }

    public void setSlots(Vector<Pair<Integer, Integer>> slots) {
        this.slots = slots;
    }

    public static Person addPerson()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = sc.nextLine();

        int n;
        System.out.println("Enter numbers of slots have to added that are already full");
        n = sc.nextInt();

        Vector<Pair<Integer, Integer>> test = new Vector<>();

        for (int i = 0; i < n; i++) {
            int start, end;
            System.out.println("Enter slots");
            System.out.println("start :");
            start = sc.nextInt();
            System.out.println("end");
            end = sc.nextInt();

            Pair<Integer, Integer> p = new Pair<>(start, end);

            test.add(p);
        }
        Person person = new Person(name,test);

        return person;
    }
}

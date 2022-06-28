import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        List<Person> lst = new ArrayList<>();

        outer: while(true)
        {
            System.out.println("1. Enter person Detail");
            System.out.println("2. Search for Slots");
            System.out.println("3. Exit");
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1 :  Person person = Person.addPerson();
                    lst.add(person);
                    break;
                case 2 :   System.out.println("Enter name to search:");
                    sc.nextLine();
                    String name = sc.nextLine();

                    Vector<Pair<Integer,Integer>> slts = new Vector<Pair<Integer, Integer>>();
                    int flag = 0;
                    for (Person person1:lst)
                    {
                        if(person1.getName().equals(name))
                            slts = person1.getSlots();
                    }

                    int[] time = new int[10000];

                    for(Pair<Integer,Integer> pr : slts)
                    {
                        flag=1;
                        int start = pr.getKey();
                        int end = pr.getValue();

                        for (int j = start; j < end; j++)
                        {
                            time[j] = 1;
                        }
                    }

                    if(flag==0) {
                        System.out.println("No detail present yet!!!");
                        break;
                    }
                    int queries;
                    System.out.println("No. of slots to be searched for availability (say 2 for (10,11) (13,14) ): ");
                    queries = sc.nextInt();

                    Calender calender = new Calender();

                    for (int i = 0; i < queries; i++)
                    {
                        int start, end;
                        System.out.println("enter start time :");
                        start = sc.nextInt();
                        System.out.println("enter end time :");
                        end = sc.nextInt();

                        boolean isAvailable = calender.isSlotAvailable(time,start,end);

                        if (isAvailable)
                            System.out.println("Slot Available");
                        else
                            System.out.println("Slot Not Available");
                    }
                    break;
                case 3 :   break outer;
            }
        }
    }
}

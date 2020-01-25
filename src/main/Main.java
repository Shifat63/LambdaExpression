package main;

import domain.Person;
import functioanlInterfaces.Find;
import functioanlInterfaces.PrintList;
import functioanlInterfaces.SortList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Author: Shifat63

public class Main {
    public static void main(String[] args)
    {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Khotimova", "Emma", new Float(25.4)));
        people.add(new Person("Zuha", "Karim", new Float(24.5)));
        people.add(new Person("Maha", "Chowdhury", new Float(28.1)));
        people.add(new Person("Vinit", "Solanki", new Float(26.8)));
        people.add(new Person("Torikul", "Islam", new Float(27.4)));
        people.add(new Person("Saiful", "Islam", new Float(28.4)));
        people.add(new Person("Emtazul", "Haque", new Float(27.3)));
        people.add(new Person("Saidul", "Tuhin", new Float(27.8)));
        people.add(new Person("Saiful", "Alam", new Float(28.3)));

        Comparator<Person> comparatorLambda = (o1, o2) -> {
            if(o1.getFirstName().compareTo(o2.getFirstName()) < 0)
            {
                return -1;
            }
            else if(o1.getFirstName().compareTo(o2.getFirstName()) > 0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        };

        SortList sortListLambda = (comparator, personList) -> {
            personList.sort(comparator);
            return personList;
        };

        PrintList printListLambda = personList -> {
            for (Person person : personList) {
                System.out.println(person.toString());
            }
        };

        Find findLambda = (value, personList) -> {
            List<Person> foundPerson = new ArrayList<>();
            for (Person person : personList) {
                if(person.getFirstName().toLowerCase().contains(value.toLowerCase()))
                {
                    foundPerson.add(person);
                }
            }
            return foundPerson;
        };

        System.out.println("Before soring:");
        printListLambda.printList(people);
        System.out.println("After soring:");
        people = sortListLambda.sortList(comparatorLambda, people);
        printListLambda.printList(people);
        System.out.println("After finding:");
        people = findLambda.find("sa", people);
        printListLambda.printList(people);
    }
}

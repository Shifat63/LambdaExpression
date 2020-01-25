package functioanlInterfaces;

import domain.Person;
import java.util.List;

// Author: Shifat63

@FunctionalInterface
public interface PrintList {
    void printList(List<Person> personList);
}

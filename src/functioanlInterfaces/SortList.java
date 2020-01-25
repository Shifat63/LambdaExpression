package functioanlInterfaces;

import domain.Person;
import java.util.Comparator;
import java.util.List;

// Author: Shifat63

@FunctionalInterface
public interface SortList {
    List<Person> sortList(Comparator<Person> comparator, List<Person> personList);
}

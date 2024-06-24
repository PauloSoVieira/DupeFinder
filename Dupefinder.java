package mindera;

import java.util.*;

public class Dupefinder<T extends Comparable<T>> {

    private List<T> fruitsList;


    public Dupefinder(List<T> fruitsList, T fruit) {

        this.fruitsList = new ArrayList<>(fruitsList);
        this.fruitsList.add(fruit);
    }


    public List<T> getDupes() {
        Set<T> set = new HashSet<>();
        List<T> dupes = new ArrayList<>();

        for (T fruit : fruitsList) {
            if (!set.add(fruit)) {
                dupes.add(fruit);
            }
        }
        return dupes;
    }

    public int countDupes() {
        return getDupes().size();
    }

    public List<T> sortedDupes() {
        List<T> duplicates = getDupes();

        duplicates.sort(Comparator.reverseOrder());

        return duplicates;
    }


}

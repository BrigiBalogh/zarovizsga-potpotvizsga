package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.*;

public class UniqueFinder {
    public List<Character> uniqueChars(String s) {

        if (s == null ) {
            throw new IllegalArgumentException("Invalid data !");
        }

        Set<Character> uniques = new LinkedHashSet<>();

        for (char c : s.toCharArray()) {
            uniques.add(c);
        }
        return new ArrayList<>(uniques);
    }
}

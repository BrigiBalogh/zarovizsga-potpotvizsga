package hu.nive.ujratervezes.zarovizsga.aquarium;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aquarium {

    private List<Fish> fishes = new ArrayList<>();

    public List<String> getStatus() {
        List<String> result = new ArrayList<>();
        for (Fish fish : fishes) {
            result.add(fish.status());
        }
        return result;
    }

    public void addFish(Fish fish) {
        fishes.add(fish);
    }

    public void removeFish() {
        Iterator<Fish> it = fishes.iterator();
        while (it.hasNext()) {
            Fish fish = it.next();
            if (fish.getWeight() >= 11) {
                it.remove();
            }
        }
    }

    public void feed() {
        for (Fish fish : fishes) {
            fish.feed();
        }
    }
}

/* List<String> names = new ArrayList<>(List.of("John Doe", "Jack Doe", "John Smith"));
Iterator<String> it = names.iterator();
while (it.hasNext()) {
    String name = it.next();
    if (name.startsWith("John")) {
        it.remove();
    }
}  */
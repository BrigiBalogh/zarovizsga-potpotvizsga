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
        Iterator<Fish> iter = fishes.iterator();
        while(iter.hasNext()) {
            Fish fish = iter.next();
            if (fish.getWeight() >= 11) {
                iter.remove();
            }
        }
    }

    public void feed() {
        for (Fish fish : fishes) {
            fish.feed();
        }
    }
}

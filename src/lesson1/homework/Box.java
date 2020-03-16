package lesson1.homework;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public void addFruits(ArrayList<T> fruits) {
        this.fruits.addAll(fruits);
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public float getWeight() {
        float weight = 0f;
        if (!(fruits.size() > 0))
            weight = 0f;
        else if (fruits.get(0) instanceof Apple)
            weight = 1f;
        else if (fruits.get(0) instanceof Orange)
            weight = 1.5f;
        return weight * fruits.size();
    }

    public boolean compare(Box<?> secondBox) {
        return Math.abs(getWeight() - secondBox.getWeight()) < 0.01;
    }

    public void shiftFruits(Box<T> secondBox) {
        if (this != secondBox) {
            secondBox.addFruits(getFruits());
            fruits.clear();
        }
    }

}

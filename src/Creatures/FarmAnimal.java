package Creatures;

public class FarmAnimal extends Animal /*implements Edible*/ {

    public FarmAnimal(String species) {
        super(species);
    }


    public void beEaten() {

    }

    @Override
    public void feed(double foodWeight) {
        if (weight > 0) {
            weight += foodWeight;
            System.out.print("Animal weight is now " + this.weight + "\n");
        } else
            System.out.print("This animal died.\n");
    }

}

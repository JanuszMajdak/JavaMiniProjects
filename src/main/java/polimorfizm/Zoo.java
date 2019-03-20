package polimorfizm;

public class Zoo {
    public static void main(String[] args) {
       /* Animal dog = new Dog("Mikado");
        Animal cat = new Cat("Mruczek");
        Animal wolf = new Animal("Pado");
*/
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Mikado");
        animals[1] = new Cat("Mruczek");
        animals[2] = new Animal("Pado");


        changeAnimalName(animals[0], "Pogon");


        for (Animal animal : animals) {
            animal.giveSound();
        }


        Animal dog = new Dog("Burek");
        Animal cat = new Cat("Mlekuś");


        Dog specificDog = (Dog) dog;
        specificDog.bark();

        ((Dog) dog).bark();
        ((Cat)cat).meow();


    }

    private static void changeAnimalName(Animal animal, String newName) {
        animal.setName(newName);
    }

}

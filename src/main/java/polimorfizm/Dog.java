package polimorfizm;

public class Dog extends Animal{


    public Dog(String name) {
        super(name);
    }

    @Override
    public void giveSound() {
        System.out.println("I am a dog and my name is: "+getName());
    }

    public void bark(){
        System.out.println("Hau, hau, hau");
    }



}

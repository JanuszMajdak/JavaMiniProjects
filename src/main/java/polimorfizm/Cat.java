package polimorfizm;



public class Cat extends Animal {


    public Cat(String name) {
        super(name);
    }

    @Override
    public void giveSound() {
        System.out.println("I ma cat and my name is: "+getName());
    }

    public void meow(){
        System.out.println("Miiaaaaauuuuu");
    }

}

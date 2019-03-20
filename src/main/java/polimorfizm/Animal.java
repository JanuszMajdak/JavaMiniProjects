package polimorfizm;


//Stwórzmy trzy klasy: Animal (zwierzę) oraz Dog (pies) i Cat (kot), które będą rozszerzać tę pierwszą.
// W każdej zadeklarujmy pole name, a także metodę giveSound(), która sprawi, że zwierzak wyda dźwięk i się przedstawi.

public class Animal {
    private String name;


    public Animal(String name){
        setName(name);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }



    public void giveSound(){
        System.out.println("I am animal: and my name is: "+getName());
    }
}

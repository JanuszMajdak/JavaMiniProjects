package konstrukcjasuper;

public class Apple extends Fruit {
    private String appleType;

    public Apple(String appleType) {
         this.appleType = appleType;
    }


    public String getAppleType() {
        return appleType;
    }

    public void setAppleType(String appleType) {
        this.appleType = appleType;
    }


    public void printInfo() {
        super.printInfo();
        System.out.println("Apple: " + appleType);
    }
}

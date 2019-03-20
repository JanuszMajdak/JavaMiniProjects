package client;

public class Client {

    private String firstName;
    private String lastName;
    private boolean premiumClient;


    public Client(String firstName, String lastName, boolean premiumClient) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.premiumClient = premiumClient;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;

    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public boolean isPremiumClient (){
        return premiumClient;
    }

    public void setPremiumClient(boolean premiumClient){
       this.premiumClient=premiumClient;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", premiumClient=" + premiumClient +
                '}';
    }
}

package client;


//Rozróżniamy dwa typy klientów:
//
//standardowy - zniżka 10% dla zakupów powyżej 1000zł,
//klient premium, który otrzymuje dodatkowy rabat 5% niezależnie od wysokości zakupów.


public class DiscountService {


    public double calculateDiscountPrice(Client client, double price) {
        if (client.isPremiumClient()) {
            return calculatePremiumClientDiscount(price);
        } else
             return calculateStadardClientDiscount(price);

    }


    public double calculateStadardClientDiscount(double price) {
        if (price > 1000) {
            return price = 0.9 * price;
        } else return price;
    }


    public double calculatePremiumClientDiscount(double price) {
        if (price > 1000) {
            return price = 0.85 * price;
        } else {
            return price = 0.9 * price;
        }
    }


}

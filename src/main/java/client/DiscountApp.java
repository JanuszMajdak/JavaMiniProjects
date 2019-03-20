package client;


public class DiscountApp {
    public static void main(String[] args) {


        //ordinary customer
        Client client1 = new Client("John", "Walter", true);
        double price1 = 2000;
        DiscountService discountService1 = new DiscountService();
        System.out.println("Premium customer");
        System.out.println("Price before discount: ="+price1);
        System.out.println(client1);
        System.out.println("Price after discounts="+discountService1.calculateDiscountPrice(client1,price1));


        System.out.println("-----------------------------------------------------");
        //premium customer
        Client client2 = new Client("Jan", "Nowak", false);
        double price2 = 2000;

        DiscountService discountService2 = new DiscountService();


        System.out.println("Ordinary customer");
        System.out.println(client2);
        System.out.println("Price before discount=" + price2);
        System.out.println("Price after discount" + discountService2.calculateDiscountPrice(client2, price2));

    }

    PrintService printService=new PrintService();
   // printService.printSummary(Client client, );



}

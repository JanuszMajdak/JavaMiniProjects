package enumprzyklad;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {

        System.out.println("Available pizzas:");
        for (Pizza p : Pizza.values()) {
            System.out.println(p);
        }

        Scanner scanner=new Scanner(System.in);
        System.out.println("What pizza would you like to order?");
        Pizza pizza=Pizza.valueOf(scanner.nextLine());  //zamienia nam to co wprowadzi użytkownik na enum, zapobiega tym samym, że ktoś zamówi pizze,
        //która nie istnieje, bo zamawiac możemy tylko i wyłącznie pośrdó pizz określonych w enum.

        System.out.println("Thank you for ordering "+pizza.name());

    }
}

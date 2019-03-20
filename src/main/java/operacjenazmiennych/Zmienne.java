package operacjenazmiennych;


//Zadanie
//Napisz program, w którym zadeklarujesz dwie zmienne typu int o nazwach x oraz y. Przypisz do nich dowolne liczby,
// a następnie za pomocą operatorów logicznych i matematycznych wyświetl wynik następujących zdań logicznych:
//
//Czy x jest większe od y?
//Czy x pomnożone przez 2 jest większe od y?
//Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2?
//Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operację modulo)
//Wynik każdego zdania logicznego przypisuj przed wypisaniem do zmiennej typu boolean o nazwie result.


import java.util.Random;

public class Zmienne {



    public static void main(String[] args) {

        Random random=new Random();
        int x=random.nextInt(10);
        System.out.println("X="+x);
        int y=random.nextInt(10);
        boolean result=(x>y);
        System.out.println("Y="+y);
        System.out.println("X is bigger than Y is: "+result);

        result=(x*2)>y;
        System.out.println("X*2)>y"+result);

        result=(y<(x+3)&&y>2*x);
        System.out.println("Case number 3:"+result);
              result =(x*y)%2==0;
        System.out.println("Iloczyn liczb: "+x+" , "+ y+" jest parzysty: "+result);

    }

}

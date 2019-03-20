package klasy_4.app2;

import klasy_4.controller.PointController;
import klasy_4.date.Point;

public class PointApplication {
    public static void main(String[] args) {

        Point p1 = new Point(10, 20);

        PointController pc = new PointController();


        System.out.println("Punkt: x=" + p1.getX() + ", y=" + p1.getY());
        pc.addX(p1);
        System.out.println("Punkt addX: x=" + p1.getX() + ", y=" + p1.getY());
        pc.addY(p1);
        System.out.println("Punkt addY: x=" + p1.getX() + ", y=" + p1.getY());
        pc.minusX(p1);
        System.out.println("Punkt minusX: x=" + p1.getX() + ", y=" + p1.getY());
        pc.minusY(p1);
        System.out.println("Punkt minusY: x=" + p1.getX() + ", y=" + p1.getY());

        System.out.println("------------------------------------------------------");

        final  int addx = 1;
        final int addy = 2;
        final int minusx = 3;
        final int minusy = 4;


        int action = 3;

        switch (action) {
            case 1:
                pc.addX(p1);
                System.out.println("Punkt addX: x=" + p1.getX() + ", y=" + p1.getY());
                break;
            case 2:
                pc.addY(p1);
                System.out.println("Punkt addY: x=" + p1.getX() + ", y=" + p1.getY());
                break;
            case 3:
                pc.minusX(p1);
                System.out.println("Punkt minusX: x=" + p1.getX() + ", y=" + p1.getY());
                break;
            case 4:
                pc.minusY(p1);
                System.out.println("Punkt minusY: x=" + p1.getX() + ", y=" + p1.getY());
                break;
            default:
                System.out.println("Give the number from 1-4");
        }


    }


}

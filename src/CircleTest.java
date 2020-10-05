import java.util.Scanner;

class Circle {
    private int radius;

    Circle (int a) {radius=a;}
    int getRadius() {return radius;}
    void setRadius(int a) {radius=a;}

    int diameter() {return 2*radius;}
    String area() {return "pi*"+Math.pow(radius,2);}
}

public class CircleTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите радиус окружности: ");
        Circle cir=new Circle(scan.nextInt());

        System.out.println("Диаметр: "+cir.diameter());
        System.out.println("Площадь: "+cir.area());
    }
}

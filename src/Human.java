import java.util.ArrayList;
import java.util.Scanner;

class Head {
    private String hairColor;
    private String eyeColor;
    Head (String a, String b) {
        hairColor=a;
        eyeColor=b;
    }

    @Override
    public String toString() {
        return hairColor + " цвет волос\n" +
                eyeColor + " цвет глаза\n";
    }
}

class Hand {
    private boolean have;
    private String side;

    Hand (boolean a, String b) {
        have=a;
        side=b;
    }

    void get() {
        if (have==true) {
            System.out.println("Есть "+side+" рука");
        } else {
            System.out.println("Нет "+side+" руки");
        }
    }
}

class Leg {
    private boolean have;
    private String side;

    Leg (boolean a, String b) {
        have=a;
        side=b;
    }

    void get() {
        if (have==true) {
            System.out.println("Есть "+side+" нога");
        } else {
            System.out.println("Нет "+side+" нога");
        }
    }
}

public class Human {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String male, hairColor, eyeColor;
        int a;

        System.out.print("Пол: ");
        male=scan.nextLine();
        System.out.print("Цвет глаз: ");
        eyeColor=scan.nextLine();
        System.out.print("Цвет волос: ");
        hairColor=scan.nextLine();

        Head golova=new Head(hairColor, eyeColor);

        System.out.print("Сколько рук у человека? ");
        Hand ruka1 = null; Hand ruka2 = null;
        switch (scan.nextInt()) {
            case 2:
                scan.nextLine();
                ruka1 = new Hand(true, "правая");
                ruka2 = new Hand(true, "левая");
            break;
            case 1:
                scan.nextLine();
                System.out.print("Какой руки нет? ");
                ruka1 = new Hand(false, scan.nextLine());
                System.out.print("Какая рука есть? ");
                ruka2 = new Hand(true, scan.nextLine());
            break;
        }

        System.out.print("Сколько ног у человека? ");
        Leg noga1 = null; Leg noga2 = null;
        switch (scan.nextInt()) {
            case 2:
                scan.nextLine();
                noga1 = new Leg(true, "правая");
                noga2 = new Leg(true, "левая");
                break;
            case 1:
                scan.nextLine();
                System.out.print("Какой ноги нет? ");
                noga1 = new Leg(false, scan.nextLine());
                System.out.print("Какая нога есть? ");
                noga2 = new Leg(false, scan.nextLine());
                break;
        }

        System.out.println("Пол: "+male);
        System.out.println(golova);
        ruka1.get();ruka2.get();
        noga1.get();noga2.get();
    }
}

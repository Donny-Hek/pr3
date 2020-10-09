import java.util.Scanner;

class Human{
    private Head golova;
    private Hand ruka1;
    private Hand ruka2;
    private Leg noga1;
    private Leg noga2;
    private String male;

    Human(String male, String hairColor, String eyeColor, int a, int b) {
        this.male=male;
        golova=new Head(hairColor, eyeColor);
        hands(a);
        legs(b);
    }

    void hands(int c){
        Scanner scan=new Scanner(System.in);
        switch (c) {
            case 2:
                ruka1 = new Hand(true, "правая");
                ruka2 = new Hand(true, "левая");
                break;
            case 1:
                System.out.print("Какой руки нет? ");
                ruka1 = new Hand(false, scan.nextLine());
                System.out.print("Какая рука есть? ");
                ruka2 = new Hand(true, scan.nextLine());
                break;
        }
    }

    void legs(int d){
        Scanner scan=new Scanner(System.in);
        switch (d) {
            case 2:
                noga1 = new Leg(true, "правая");
                noga2 = new Leg(true, "левая");
                break;
            case 1:
                System.out.print("Какой ноги нет? ");
                noga1 = new Leg(false, scan.nextLine());
                System.out.print("Какая нога есть? ");
                noga2 = new Leg(true, scan.nextLine());
                break;
        }
    }

    void getHuman() {
        System.out.println("---\nПол: "+male);
        System.out.println(golova);
        ruka1.get(); ruka2.get();
        noga1.get(); noga2.get();
    }
}

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
                eyeColor + " цвет глаз\n";
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

public class HumanTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String male, hairColor, eyeColor;
        int a, b;
        System.out.print("Пол: "); male=scan.nextLine();
        System.out.print("Цвет глаз: "); eyeColor=scan.nextLine();
        System.out.print("Цвет волос: "); hairColor=scan.nextLine();

        System.out.print("Сколько рук у человека? "); a=scan.nextInt();
        System.out.print("Сколько ног у человека? "); b=scan.nextInt();

        Human human=new Human(male,hairColor,eyeColor, a, b);
        human.getHuman();
    }
}

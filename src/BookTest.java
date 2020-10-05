import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String name1, name2;
        int year, n=1;

        System.out.print("Введите название книги: "); name1= scan.nextLine();
        System.out.print("Введите автора книги: "); name2= scan.nextLine();
        System.out.print("Введите год написания книги: "); year= scan.nextInt();
        Book book=new Book(name2,name1,year);

        while (n!=0) {
            System.out.println("Все верно?\n0-да\n1-неверный автор\n2-неверное название\n3-неверный год");
            n= scan.nextInt();
            scan.nextLine();
            switch (n){
                case 1: book.setAuthor(scan.nextLine());
                break;
                case 2: book.setName(scan.nextLine());
                break;
                case 3: book.setYear(scan.nextInt());
                break;
            }
        }

        System.out.println(book);
    }
}

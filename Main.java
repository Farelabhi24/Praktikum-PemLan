package praktic.geometry.mains;
import java.util.Scanner;

public class Main {
    static String BLUE = "\u001B[94m";
    static String WHITE = "\u001B[0m";
    static String YELLOW = "\u001B[33m";

    
    static void garisPembatas() {
        System.out.println("===========================");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle(3, 4, 5);

        garisPembatas();
        System.out.print(WHITE + "Nama : " );
        String nama = input.nextLine();

        System.out.print("NIM : " );
        long NIM = input.nextLong();

        garisPembatas();
        System.out.println(BLUE + "Circle");

        garisPembatas();
        System.out.print("Isikan ID : ");
        int ID = input.nextInt();

        System.out.print("Isikan Radius : " );
        double radius = input.nextDouble();
        
        circle.setID(ID);
        circle.setRadius(radius);

        garisPembatas();
        circle.infoCircle();
        
        garisPembatas();
        System.out.println(YELLOW + "Rectangle");

        garisPembatas();
        System.out.print("Isikan ID : ");
        int Id = input.nextInt();

        System.out.print("Isikan Panjang : ");
        double panjang = input.nextDouble();

        System.out.print("Isikan Lebar : ");
        double lebar = input.nextDouble();

        rectangle.getID(Id);
        rectangle.getPanjang(panjang);
        rectangle.getLebar(lebar);

        garisPembatas();
        rectangle.infoRectangle();
        garisPembatas();
    }
}
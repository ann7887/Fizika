import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fizika telo = new Fizika(3);
        Dinamika sila = new Dinamika(50);
        //Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();

        System.out.println("Скорость: " + telo.v);
        System.out.println("Сила: " + sila.F);
        Mkt gaz = new Mkt(5);
        gaz.n();
        gaz.count();
        System.out.println("×10^(-23) Па");
        telo.s(3);
        telo.s(2, 5);
    }
}
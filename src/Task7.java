import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        final int x = 10;
        final int y = 15;
        final int z = 20;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scan.nextInt();
        switch (number) {
            case x:
            case y:
            case z:
                System.out.println("Данное значение имеется в константах");
                break;
            default:
                System.out.println("Такой константы нет!");
                break;
        }
        scan.close();
    }
}
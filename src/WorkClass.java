// LabWork-03-3
// < Левків Роман>
// Лабораторна робота № 3.3
// Розгалуження, задане графіком функції.
// Варіант 11
import java.util.Scanner;

public class WorkClass {
    public static void main(String[] args) {
        double x; // вхідний аргумент
        double R; // вхідний параметр
        double y; // результат обчислення виразу
        Scanner skan = new Scanner(System.in);

        System.out.println("R =");
        R = skan.nextDouble();
        System.out.println("x =");
        x = skan.nextDouble();

        // розгалуження в повній формі
        if (x<=-1-R) {
            y = x + 1 + R;
        }
        else if (-1-R < x && x <= -1) {
            y = Math.abs(Math.pow(R, 2)-Math.pow(x + 1, 2));
        }
        else if (-1 < x && x <= 1) {
            y = R;
        }
        else if (1 < x && x <= 2) {
            y = R + (-1 - R)/(2 - 1)*(x - 1);
        }
        else {
            y = -1;
        }
        System.out.println(y);
    }
}

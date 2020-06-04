import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");

        int count = scanner.nextInt();

        int minimal = 1000;
        int maximal = -1000;
        int composition = 1;


        for (int i = 0; i < count; i++) {
            System.out.print("Число № " + (i+1) + ": ");
            int number = scanner.nextInt();
            if(number < minimal)
                minimal = number;
            if(number > maximal)
                maximal = number;
            composition *= number;
        }

        System.out.println("Минимальное значение = " + minimal);
        System.out.println("Максимальное значение = " + maximal);
        System.out.println("Произведение = " + composition);


    }
}

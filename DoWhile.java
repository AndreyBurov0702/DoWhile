import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);
        int value;
        do {
            System.out.println("Введите 7");
            value = scaner.nextInt();
        }while (value!=7);
        System.out.println("Вы ввели 7");
    }
}

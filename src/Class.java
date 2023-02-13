import java.util.Scanner;

public class Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int input = scanner.nextInt();
        int sum = 0;
        while (input <100) {
            input = scanner.nextInt();
            if (sum > 100)
                break;
            input++;
        }
        System.out.println("more than 100");
    }
}
/**
 *
 * Version 2
 */
//        int i = 0;
//        int num = 0;
//        Scanner scan = new Scanner (System.in);
//        while (i<99) {
//            System.out.println ("Enter your number,if the number is greater than 100. then the loop stops");
//            num = scan.nextInt ();
//            if (num>99)
//                break; //если num меньше нуля, то завершить цикл
//            i++;
//        }
//        System.out.println("more than 100");
//    }


package calculatingMachine;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Calculate calculate = new Calculate();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 : 더하기 , 2 : 빼기");
            int choice = scanner.nextInt();

            int number = scanner.nextInt();

            if (choice == 1) {
                calculate.add(number);
                System.out.println(number + "더해서"+ calculate.totalValue);

            } else if (choice == 2){
                calculate.subtraction(number);
                System.out.println(number + "빼서"+calculate.totalValue);

            }
        }
    }
}

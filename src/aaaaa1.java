import java.util.Scanner;

public class aaaaa1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // -----------------------------------------------------------------
        // 카페 음료 주문 시스템
        // size가 'S', 'M', 'L' 중 하나가 아니면 "잘못된 입력"을 출력한다
        // 정상적인 입력일 경우,
        // isHot이 true이면 기본가격에 500원을 추가한다
        // size가 'M'이면 기본가격에 1000원을, 'L'이면 2000원을 추가한다
        System.out.print("음료 크기를 입력하세요(S/M/L): ");
        char size = scanner.next().charAt(0);
        System.out.print("따뜻한 음료인가요?(true/false): ");
        boolean isHot = scanner.nextBoolean();
        int basePrice = 3000;
        // 아래에 코드 작성
        int totalPrice = basePrice;

        if (size == 'S' || size == 'M' || size == 'L') {
            if (isHot) {
                totalPrice = basePrice + 500;
            }

            if (size == 'M') {
                totalPrice = totalPrice + 1000;
            } else if (size == 'L') {
                totalPrice = totalPrice + 2000;
            }
            System.out.println(totalPrice);
        }else {
            System.out.println("잘못된 입력");
        }

    }
}

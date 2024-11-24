package ref;


import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[num];

        for (int i = 0; i < orders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String name = scanner.nextLine();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            orders[i] = createOrder(name,price,quantity);
        }

        printOrders(orders);
        int total = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + total);

    }
    static ProductOrder createOrder(String name, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = name;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders){
        int totalAlmount = 0;
        for (ProductOrder order : orders) {
            totalAlmount += order.price * order.quantity;
        }
        return totalAlmount;
    }
}

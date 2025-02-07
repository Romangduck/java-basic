package class1.ref.ex;

import java.util.Scanner;
public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine();



        ProductOrder[] productOrders = new ProductOrder[n];
        for(int i=0; i<productOrders.length; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명 : ");
            String productName = scanner.nextLine();
            System.out.print("가격 : ");
            int price = scanner.nextInt();
            System.out.print("수량 : ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

    productOrders[i] = createOrder(productName,price,quantity);

        }

//        productOrders[0] = createOrder("두부",2000,2);
//        productOrders[1] = createOrder("김치",5000,3);
//        productOrders[2] = createOrder("콜라",2000,1);


//        int totalAmount = 0;
//        for (ProductOrder order : productOrders) {
//            System.out.println("상품명 : " + order.productName + " 상품 가격 : " + order.price + " 상품 수량 : " + order.quantity);
//            totalAmount += order.price * order.quantity;
//        }
//
//        System.out.println("총 결제 금액 : " + totalAmount);
        printOrders(productOrders);
        getTotalAmount(productOrders);
    }

    static ProductOrder createOrder(String productName, int price , int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] productOrders) {
        for(ProductOrder order:productOrders) {
            System.out.println(order.productName + order.price + order.quantity );
        }
    }

    static int getTotalAmount(ProductOrder[] productOrders) {
        int totalAmount =0;
        for(ProductOrder order:productOrders) {
             totalAmount += order.price * order.quantity;
            System.out.println(totalAmount);
        }
        return totalAmount;
    }
}

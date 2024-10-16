package class1.ref.ex;
public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        productOrders[0] = createOrder("두부",2000,2);
        productOrders[1] = createOrder("김치",5000,3);
        productOrders[2] = createOrder("콜라",2000,1);


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

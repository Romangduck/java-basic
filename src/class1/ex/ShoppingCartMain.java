package class1.ex;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart= new ShoppingCart();

        Item item1 = new Item("콜라", 3000, 3);
        Item item2 = new Item ("과자" , 2000 ,5);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.displayItems();
    }
}

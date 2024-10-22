package oop1.ex;

public class Account {
    int total;

    void getAmount(int amount) {
        total += amount;
    }

    void lostAmount(int amount) {
        if(total >= amount) {
            total -= amount;
        } else {
            System.out.println("잔액 부족");
        }
    }
}

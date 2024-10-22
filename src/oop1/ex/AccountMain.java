package oop1.ex;
import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Account acc = new Account();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("입금은 1, 출금은 2, 종료는 3을 눌러주세요.");
            int n = scanner.nextInt();

            if (n == 1) {
                System.out.println("입금할 금액을 입력해주세요.");
                int depositAmount = scanner.nextInt();
                acc.getAmount(depositAmount);
                System.out.println("현재 잔액: " + acc.total);

            } else if (n == 2) {
                System.out.println("출금할 금액을 입력해주세요.");
                int withdrawAmount = scanner.nextInt();
                acc.lostAmount(withdrawAmount);
                System.out.println("현재 잔액: " + acc.total);

            } else if (n == 3) {
                System.out.println("프로그램을 종료합니다.");
                running = false;

            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

        scanner.close();
    }
}

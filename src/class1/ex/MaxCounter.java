package class1.ex;

public class MaxCounter {
    private int count =0;
    private int max;

    MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if(count >= max) {
            System.out.println("최댓값을 초과할 수 없습니다.");
        } else {
            count++;
        }
    }

    public int getCount () {
        return count;
    }
}



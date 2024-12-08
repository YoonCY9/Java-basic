package access.ex;

public class MaxCounter {
    private int count =  0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (count >= max) {
            System.out.println("최대 카운트 입니다.");
            return;
        }
        this.count += 1;
    }
    public int getCount() {
        return count;
    }


}

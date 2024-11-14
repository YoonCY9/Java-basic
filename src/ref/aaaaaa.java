package ref;

public class aaaaaa {

    public static void main(String[] args) {

        int num = sayHello(3);
        System.out.println(num);

    }
    public static int sayHello(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("안녕하세요");
        }
        return num;
    }
}

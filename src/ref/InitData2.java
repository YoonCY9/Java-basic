package ref;

public class InitData2 {

    public static void main(String[] args) {
        InitData data = new InitData();

        System.out.println(data.value1);
        data.value1 = 2;
        System.out.println(data.value2);
        System.out.println(data.value1);
    }
}

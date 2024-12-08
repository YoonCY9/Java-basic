package access.a;

public class AccessInnerMain {

    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

        data.defaultField = 2;
        data.defaultMethod();

        // 프라이빗은 호출 불가능 호출코드 생략

        data.innerAccess();
    }
}

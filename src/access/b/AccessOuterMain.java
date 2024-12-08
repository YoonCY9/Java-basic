package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        data.publicField = 1;
        data.publicMethod();

//        다른 패키지이므로 default 호출 불가
//        data.defaultField = 2;
//        data.defaultMethod();

        // 프라이빗은 호출 불가능 호출코드 생략

        data.innerAccess();
    }

}

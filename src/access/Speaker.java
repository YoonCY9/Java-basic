package access;

public class Speaker {

    private int volume;

    Speaker(int volume) {
        if (volume<= 100) {
            this.volume = volume;
        }else {
            System.out.println("100이하만 설정 가능합니다.");
            this.volume = 0;
        }

    }

    void  volumeUp() {
        if (volume >= 100 ) {
            System.out.println("증가할 수 없습니다. 최대음량입니다.");
        }else {
            volume += 10;
            System.out.println("음량을 10 올립니다.");
        }

    }
    void volumeDown() {
        volume -= 10;
        System.out.println("음량을 10 내립니다.");
    }
    void showVolume() {
        System.out.println("현재음량: " + volume);
    }
}

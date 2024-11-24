package oop1;

public class MusicplayerMain2 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 켜기
        on(data);
        //볼륨 조절
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);

        showStatus(data);

        // 음악 플레이어 끄기
        off(data);
    }
    public static void  showStatus(MusicPlayerData data){
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);

        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
    public static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("볼륨: " + data.volume);
    }
    public static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("볼륨: " + data.volume);
    }
    public static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어 시작");
    }
    public static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어 종료");
    }
}

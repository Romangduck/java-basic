package oop1;

public class MusicPlayer {

    int volume = 0;
    boolean isOn =  false;

     void on( ) {
        isOn = true;
        System.out.println(" 음악 플레이어를 시작합니다.");
    }
     void off( ) {
        isOn = false;
        System.out.println(" 음악 플레이어를 종료합니다.");
    }

     void up() {
        volume++;
        System.out.println(" 음악 플레이어 볼륨 : " + volume);
    }

     void down() {
        volume--;
        System.out.println(" 음악 플레이어 볼륨 : " + volume);
    }

     void status() {
        System.out.println(" 음악 플레이어 상태 확인 ");
        if(isOn) {
            System.out.println(" 음악 플레이어 ON, 볼륨 : " + volume);
        } else {
            System.out.println(" 음악 플레이어 OFF");
        }
    }
}

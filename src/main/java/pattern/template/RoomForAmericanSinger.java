package pattern.template;

/**
 * @author yzz
 * @create 2022-04-28 10:11
 */
public class RoomForAmericanSinger extends KTVRoom {
    @Override
    protected void orderSong() {
        System.out.println("Let's sing a English song!");
    }
}

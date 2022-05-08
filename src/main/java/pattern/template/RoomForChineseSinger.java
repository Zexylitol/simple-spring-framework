package pattern.template;

/**
 * @author yzz
 * @create 2022-04-28 10:08
 */
public class RoomForChineseSinger extends KTVRoom {

    @Override
    protected void orderSong() {
        System.out.println("Let's sing a Chinese song!");
    }

    @Override
    protected void orderExtra() {
        System.out.println("One more!");
    }
}

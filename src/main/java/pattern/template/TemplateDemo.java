package pattern.template;

/**
 * @author yzz
 * @create 2022-04-28 10:13
 */
public class TemplateDemo {
    public static void main(String[] args) {
        KTVRoom room1 = new RoomForChineseSinger();
        room1.procedure();
        KTVRoom room2 = new RoomForAmericanSinger();
        room2.procedure();
    }
}

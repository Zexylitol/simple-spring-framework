package pattern.template;

/**
 * @author yzz
 * @create 2022-04-28 9:54
 */
public abstract class KTVRoom {

    public void procedure() {
        openDevice();
        orderSong();
        orderExtra();
        pay();
    }

    /**
     * 模板自带方法，使用前必须得打开设备
     */
    private void openDevice() {
        System.out.println("Turn on video and audio!");
    }

    /**
     * 子类必须实现的方法，选歌
     */
    protected abstract void orderSong();

    /**
     * 钩子，额外开销视情况选择
     */
    protected void orderExtra(){};

    /**
     * 模板自带方法，付款
     */
    private void pay() {
        System.out.println("Pay this consumption bill!");
    }
}

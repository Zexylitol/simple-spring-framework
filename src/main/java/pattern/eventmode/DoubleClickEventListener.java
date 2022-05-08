package pattern.eventmode;

/**
 * @author yzz
 * @create 2022-05-08 10:57
 */
public class DoubleClickEventListener implements EventListener {
    @Override
    public void processEvent(Event event) {
        if ("doubleclick".equals(event.getType())) {
            System.out.println("Double Click Event");
        }
    }
}

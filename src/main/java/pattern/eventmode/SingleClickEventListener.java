package pattern.eventmode;

/**
 * @author yzz
 * @create 2022-05-08 10:53
 */
public class SingleClickEventListener implements EventListener {
    @Override
    public void processEvent(Event event) {
        if ("singleclick".equals(event.getType())) {
            System.out.println("Single Click Event");
        }
    }
}

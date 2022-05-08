package pattern.eventmode;

/**
 * @author yzz
 * @create 2022-05-08 11:02
 */
public class EventModeDemo {
    public static void main(String[] args) {
        EventSource eventSource = new EventSource();
        SingleClickEventListener singleClickEventListener = new SingleClickEventListener();
        DoubleClickEventListener doubleClickEventListener = new DoubleClickEventListener();
        Event event = new Event();
        event.setType("doubleclick");
        eventSource.register(singleClickEventListener);
        eventSource.register(doubleClickEventListener);
        eventSource.publishEvent(event );
    }
}

package pattern.eventmode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yzz
 * @create 2022-05-08 10:58
 */
public class EventSource {
    private List<EventListener> listenerList = new ArrayList<>();
    public void register(EventListener listener) {
        listenerList.add(listener);
    }

    public void publishEvent(Event event) {
        for (EventListener listener : listenerList) {
            listener.processEvent(event);
        }
    }
}
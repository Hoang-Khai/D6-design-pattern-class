package observer;

import java.util.*;

public class Timer implements Publish {

    List<Action> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Action actor) {
        subscribers.add(actor);
    }

    @Override
    public void unsubscribe(Action actor) {
        for (int i = 0; i < subscribers.size(); i++) {
            Action subscriber = subscribers.get(i);
            if (subscriber.toString().equals(actor.toString())) {
                subscribers.remove(i);
            }
        }
    }

    public void checkTime() {
        for (int i = 0; i < 60; i++) {
            try {
                Thread.sleep(1000);
                if (new Date().after(new Date(2022 - 1900, 1, 28, 18, 20, 00))) { // Trigger: Đến thời điểm // Có video mới // Người dùng nhấn nút // Sau mỗi khi gọi hàm A
                    for (Action action : subscribers) {
                        action.action();
                    }
                    break;
                }
            } catch (Exception e) {

            }
        }
    }
}

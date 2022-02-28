package observer;

public interface Publish {
    public void subscribe(Action actor);
    public void unsubscribe(Action actor);
}

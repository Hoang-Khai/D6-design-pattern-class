package composite;

public interface FileComposite {
    default void expand() {}
    String getName();
    int getSize();
}

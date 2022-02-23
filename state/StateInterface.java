package state;

public interface StateInterface {
    default void createForm() {
        System.out.println("Wrong action.");
    }

    default void editForm() {
        System.out.println("Wrong action.");
    }

    default void approve() {
        System.out.println("Wrong action.");
    }

    default void reject() {
        System.out.println("Wrong action.");
    }

    default void abcxyz() {
        System.out.println("Wrong action.");
    }
}

package observer;

import java.util.Date;
import java.util.*;

public class Main {
    static List<Action> actions = new ArrayList();
    public static void main(String... args) {
        Action a = new Abc();
        actions.add(a);
    }
}

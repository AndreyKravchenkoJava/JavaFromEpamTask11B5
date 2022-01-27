package project;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Console console = new Console(list);

        console.run();
    }
}

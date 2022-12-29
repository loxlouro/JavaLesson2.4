import java.util.ArrayList;

import static javafx.scene.input.KeyCode.T;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> obj = new ArrayList<>();
        obj.add("");
        obj.add(12);
        obj.add("A"+23);
        BeginsWithA<Object> parameter = new BeginsWithA<>();
        ArrayList<Object> newList = parameter.filter(obj);
        System.out.println(newList);
    }
}
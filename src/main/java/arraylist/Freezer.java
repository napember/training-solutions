package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {
    List<String> list;

    public List<String> getList() {
        return list;
    }

    public Freezer() {
        list = new ArrayList<>();
    }

    public void add(String elem) {
        list.add(elem);
    }
    public void remove(String elem) {
        list.remove(elem);
    }
}

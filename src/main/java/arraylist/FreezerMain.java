package arraylist;

import java.util.List;

public class FreezerMain {
    public static void main(String[] args) {
        Freezer freezer = new Freezer();

        freezer.add("bab");
        freezer.add("borsó");
        freezer.add("alma");
        freezer.add("répa");
        freezer.add("sóska");
        System.out.println(freezer.getList());

        List<String> l = freezer.getList();
        System.out.println(l.size());

        freezer.remove("bab");
        System.out.println(l.size());

        freezer.remove("répa");
        System.out.println(l.size());

        System.out.println(freezer.getList());


    }
}

package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();

        Dog d1 = new Dog("Pofi",1,"Yellow");
        Dog d2 = new Dog("Nyafi",2,"White");
        Dog d3 = new Dog("Csau",3,"Brown");

        dogList.add(d1);
        dogList.add(d2);
        dogList.add(d3);
        System.out.println(dogList);

        Dog d4 = dogList.get(1);
        d4.setColour("Black");
        System.out.println(dogList);

        Dog d5 = new Dog("Vacak",1,"Grey");
        System.out.println(d5);

        d5=dogList.get(1);
        System.out.println(d5);

        dogList.add(d5);

        Dog d6 = d4;
        System.out.println(dogList);

        d4.setColour("Purple");

        List<Dog> dogList2 = new ArrayList<>(dogList);

        Dog d7 = d4;

        d7.setColour("Green");
        System.out.println(dogList2);



    }
}

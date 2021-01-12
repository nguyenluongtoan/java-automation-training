package ArrayList;

import java.util.ArrayList;

public class Prob1 {
    public static void main(String []args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("LQA");
        list.add("FPT");
        list.add("Java");
        list.add("Python");
        System.out.println("Elements of list are: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}

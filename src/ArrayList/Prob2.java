package ArrayList;

import java.util.ArrayList;

public class Prob2 {
    public static void main(String []args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println("Elements of list are: ");
        for (int i = list.size()-1; i >= 0 ; i--) {
            System.out.println(list.get(i));
        }
    }
}





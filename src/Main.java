/**
@author Esteban Andres Murcia Acuña
 @version: 09/01/2023
**/
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CArrayList list = new CArrayList();
        System.out.println(list.size());
        System.out.println(list.toString());
        System.out.println(list.isEmpty());
        for(int i=1;i<15;i++) {
            list.add(i);
            System.out.println(list.toString());
            System.out.println(list.size());
            System.out.println(list.isEmpty());
        }
        list.add(0,23);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.remove();

        System.out.println(list.toString());
        list.remove(2);
        System.out.println(list.toString());
        list.removeAll();
        System.out.println(list.toString());

        list.addAll(1,5,2,6);
        System.out.println(list);
    }
}
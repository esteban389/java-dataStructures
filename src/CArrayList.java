import java.util.Arrays;
import java.util.Iterator;

public class CArrayList implements Iterable{
    private int list[];
    private int size;
    public CArrayList(){
        this.list  = new int[10];
        this.size = list.length;
    }

    public int size(){
        return size;
    }
    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public String toString() {
        return "CArrayList{" +
                Arrays.toString(list) +
                '}';
    }
}

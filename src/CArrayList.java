import java.util.Arrays;
import java.util.Iterator;
/**
   This class defines a simple implementation of the ArrayList class (Custom ArrayList)
 **/
public class CArrayList implements Iterable{
    // Class attributes
    private int list[];
    private int size;
    private int highestIndex;
    public CArrayList(){
        this.list  = new int[0];
        this.size = list.length;
        highestIndex = 0;
    }

    /**
        @return Returns the current Size of the internal list of the implementation
     **/
    public int size(){
        return size;
    }

    public void add(int value){
        if(size<=highestIndex){
            growArray();
            size = list.length;
        }
        list[highestIndex++]=value;
    }

    public void add(int index, int value){
        list[index]=value;
    }

    public void addAll(int... values){
        for(int value: values){
            add(value);
        }
    }
    public int get(int index) {
        return list[index];
    }
    public int getFirst(){
        return list[0];
    }
    public int getLast(){
        return list[highestIndex-1];
    }
    public void remove(){
        list[--highestIndex]=0;
    }

    public void remove(int index){
        int[] firstSplitList = new int[index];
        int[] secondSplitList = new int[size-index];
        list[index]=0;
    }

    public void removeAll(){
        list = new int[0];
    }
    public boolean isEmpty(){
        return size==0;
    }
    private void growArray(){
        int newSize[] = new int[size+size/2+1];
        for(int i=0; i<list.length;i++){
            newSize[i]=list[i];
        }
        list = newSize;
    }
    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public String toString() {
        return
                Arrays.toString(list)
                ;
    }
}

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.IntConsumer;
/**
   This class defines a simple implementation of the ArrayList class (Custom ArrayList)
 **/
public class CArrayList implements Iterable<Integer>{
    // Class attributes
    private int[] list;
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
        highestIndex--;
        trimSize(highestIndex);
    }

    public void remove(int index){
        if(index>highestIndex || index<0) throw new IndexOutOfBoundsException("Index is out of bounds");
        int i=index;
        while(i<(size-index)){
            list[i]=list[++i];
        }
        highestIndex--;
        trimSize(highestIndex);
    }

    public void removeAll(){
        list = new int[0];
        size = list.length;
        highestIndex=0;
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
        size = list.length;
    }

    public void trimSize(int newSize){
        int newArray[] = new int[newSize];
        for(int i=0;i<newArray.length;i++){
            newArray[i] = list[i];
        }
        list=newArray;
        size = list.length;
    }

    public void sort(){

    }

    public void forEach(IntConsumer action) {
        for (int i = 0; i < size; i++) {
            action.accept(list[i]);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IntIterator();
    }

    private class IntIterator implements Iterator<Integer> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return list[currentIndex++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Remove operation is not supported.");
        }
    }

    @Override
    public String toString() {
        return
                Arrays.toString(list)
                ;
    }

    private class DQuickSort {

    }
}

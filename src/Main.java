import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        Heap heap = new Heap(10);

        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);

        heap.printHeap();

        heap.sort();
        heap.printHeap();

//        MinIntHeap mh = new MinIntHeap();
//        mh.add(80);
//        mh.add(75);
//        mh.add(60);
//        mh.add(68);
//        mh.add(55);
//        mh.add(40);
//        mh.add(52);
//        mh.add(67);
//
//        mh.printHeap();
//
//        System.out.println("--------------------");
//
//
//        mh.printItems();
    }




}

import java.util.Random;

public class Ex8 {

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        Random rd = new Random();
        
        list.addLast(rd.nextInt(100));
        list.addLast(rd.nextInt(100));
        list.addLast(rd.nextInt(100));
        list.addLast(rd.nextInt(100));
        list.addLast(rd.nextInt(100));

        list.print();

        MyLinkedList<Integer> sortList = new MyLinkedList<>();

        sortList.addSortedList(rd.nextInt(100));
        sortList.addSortedList(rd.nextInt(100));
        sortList.addSortedList(rd.nextInt(100));
        sortList.addSortedList(rd.nextInt(100));
        sortList.addSortedList(rd.nextInt(100));

        sortList.print();
    }    
}

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

        System.out.print("Sort ");
        sortList.print();

        int countEvenNumber = 0;
        Node<Integer> nodeEvenNumber = sortList.getHead();
        while (nodeEvenNumber != null) {
            if (nodeEvenNumber.getData() % 2 == 0) {
                countEvenNumber++;
            }
            nodeEvenNumber = nodeEvenNumber.getNext();
        }
        System.out.println("Even numbers in sorted list is: " + countEvenNumber);

        int sumAllNumber = 0;
        Node<Integer> nodeAllNumber = sortList.getHead();
        while (nodeAllNumber != null) {
            sumAllNumber += nodeAllNumber.getData();
            nodeAllNumber = nodeAllNumber.getNext();
        }
        System.out.println("Sum all numbers in sorted list is: " + sumAllNumber);
    }    
}

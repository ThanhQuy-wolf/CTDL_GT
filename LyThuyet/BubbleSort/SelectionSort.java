public class SelectionSort {
    public static void sort(MyLinkedList<Integer> list) {
        if (list.isEmpty())
            return;

        Node<Integer> head = list.getHead();
        Node<Integer> curr = head.getNext();
        boolean isMin;
        while (curr.getNext() != null) {
            do {
                isMin = false;
                int min = curr.getData();
                if (curr.getNext().getData() < min) {
                    min = curr.getNext().getData();
                    curr = curr.getNext();
                }
                isMin = true;
            } while (isMin);

            head
        }
    }

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        
    }
}

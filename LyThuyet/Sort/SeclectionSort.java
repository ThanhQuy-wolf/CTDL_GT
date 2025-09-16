public class SeclectionSort {
    public static void sort(MyLinkedList<Integer> list) {
        if (list.isEmpty() || list.size() <= 1)
            return;

        Node<Integer> current = list.getHead();

        while (current != null) {
            Node<Integer> minNode = current;
            Node<Integer> temp = current.getNext();

            while (temp != null) {
                if (temp.getData() < minNode.getData()) {
                    minNode = temp;
                }
                temp = temp.getNext();
            }

            if (minNode != current) {
                Integer tempData = current.getData();
                current.setData(minNode.getData());
                minNode.setData(tempData);
            }

            current = current.getNext();
        }
    }

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addLast(5);
        list.addLast(2);
        list.addLast(7);
        list.addLast(1);
        list.addLast(8);
        list.addLast(9);
        list.addLast(4);
        list.addLast(3);
        list.addLast(6);

        sort(list);
        list.print();
    }
}

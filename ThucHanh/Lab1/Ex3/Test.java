import java.util.Scanner;

public class Test {
    // Câu a
    public static int countEvenNumber(MyLinkedList<Integer> list) {
        int count = 0;
        if (list.isEmpty())
            return count;

        Node<Integer> newNode = list.getHead();
        while (newNode != null) {
            if (newNode.getData() % 2 == 0) {
                count++;
            }
            newNode = newNode.getNext();
        }

        return count;
    }

    // Câu b
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int countPrimeNumber(MyLinkedList<Integer> list) {
        int count = 0;
        if (list.isEmpty())
            return count;

        Node<Integer> newNode = list.getHead();
        while (newNode != null) {
            int n = newNode.getData();
            if (isPrime(n)) {
                count++;
            }
            newNode = newNode.getNext();
        }

        return count;
    }

    // Câu c
    public static MyLinkedList<Integer> addItemInFirstElement(MyLinkedList<Integer> list, Scanner sc) {
        if (list.isEmpty())
            return null;

        MyLinkedList<Integer> newList = new MyLinkedList<>();
        Node<Integer> newNode = list.getHead();
        while (newNode != null) {
            Node<Integer> currNext = newNode.getNext();
            if (currNext.getData() % 2 == 0) {
                System.out.print("Enter X: ");
                int X = sc.nextInt();
                newList.addAfter(newNode, X);
                break;
            }
            newList.addLast(newNode.getData());
            newNode = newNode.getNext();
        }

        while (newNode != null) {
            newList.addLast(newNode.getData());
            newNode = newNode.getNext();
        }

        return newList;
    }

    // Câu d
    public static int findMaximumNumber(MyLinkedList<Integer> list) {
        if (list.isEmpty())

            return 0;

        Node<Integer> newNode = list.getHead();
        int max = newNode.getData();
        newNode = newNode.getNext();
        while (newNode != null) {
            if (newNode.getData() > max) {
                max = newNode.getData();
            }
            newNode = newNode.getNext();
        }

        return max;
    }

    // Câu e
    public static MyLinkedList<Integer> reverseTemporaryList(MyLinkedList<Integer> list) {
        if (list.isEmpty())
            return null;

        MyLinkedList<Integer> newList = new MyLinkedList<>();
        Node<Integer> newNode = list.getHead();

        while (newNode != null) {
            newList.addFirst(newNode.getData());
            newNode = newNode.getNext();
        }

        return newList;
    }

    // Câu f
    public static void sortAscendingOrder(MyLinkedList<Integer> list) {
        if (list.isEmpty() || list.size() <= 1)
            return;

        boolean swapped;
        do {
            swapped = false;
            Node<Integer> curr = list.getHead();

            while (curr.getNext() != null) {
                if (curr.getData() > curr.getNext().getData()) {
                    int temp = curr.getData();
                    curr.setData(curr.getNext().getData());
                    curr.getNext().setData(temp);
                    swapped = true;
                }
                curr = curr.getNext();
            }
        } while (swapped);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addLast(5);
        list.addLast(2);
        list.addLast(6);
        list.addLast(8);
        list.addLast(10);
        list.addLast(7);
        list.addLast(9);
        list.addLast(3);
        list.addLast(1);
        list.addLast(4);

        list.print();

        // Câu a
        System.out.println("Even number in the list: " + countEvenNumber(list));

        // Câu b
        System.out.println("Prime number in the list: " + countPrimeNumber(list));

        // Câu c
        MyLinkedList<Integer> addXIntoList = addItemInFirstElement(list, sc);
        System.out.println("Add item X before the first even element: ");
        addXIntoList.print();

        // Câu d
        System.out.println("Maximum number in the list: " + findMaximumNumber(list));

        // Câu e
        MyLinkedList<Integer> reverseList = reverseTemporaryList(list);
        System.out.println("Reverse the list without using temporary list: ");
        reverseList.print();

        System.out.println("Sort the list in ascending order: ");
        sortAscendingOrder(list);
        list.print();

        sc.close();
    }
}

public class Test {
    public static void main(String[] args) {
        CharLinkedList listChar = new CharLinkedList();
    
        listChar.addFirst('A');
        listChar.addFirst('b');
        listChar.addFirst('c');
        listChar.addFirst('d');

        listChar.addAfterFirstKey('F', 'A');

        System.err.println(listChar.largestCharPostition());

        listChar.printList();
    }
}
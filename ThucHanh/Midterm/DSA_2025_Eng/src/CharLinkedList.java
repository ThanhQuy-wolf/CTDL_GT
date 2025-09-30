class CharLinkedList implements ListInterface {
    private Node head;

    public CharLinkedList() {
    }

    @Override
    public Node getHead() {
        return head;
    }

    @Override
    public void addFirst(char data) {
        head = new Node(data, head);
    }

    @Override
    public boolean addAfterFirstKey(char data, char key) {
        if (head == null) return false;

        Node prev = head;
        while (prev != null) {
            if (prev.getData() == key) {
                Node newNode = new Node(data, prev.getNext());
                prev.setNext(newNode);
                return true;
            }
            prev = prev.getNext();
        }
        return false;
    }

    @Override
    public int largestCharPostition() {
        if (head == null) return -1;

        int pos = 0;
        int bestPos = 0;
        char best = head.getData();

        for (Node p = head; p != null; p = p.getNext()) {
            if (p.getData() > best) {
                best = p.getData();
                bestPos = pos;
            }
            pos++;
        }

        return bestPos;
    }

    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.getData());
            if (curr.getNext() != null) {
                System.out.print(" -> ");
            }
            curr = curr.getNext();
        }
        System.out.println(); // xuống dòng
    }

}

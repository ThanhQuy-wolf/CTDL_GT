public class CirculeLink {
    private class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node last;
    private int size;

    public CirculeLink() {
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return last == null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        
        if (isEmpty()) {
            last = newNode;
            last.next = last; // Point to itself to create circular structure
        } else {
            newNode.next = last.next; // New node points to the first node
            last.next = newNode;      // Last node points to new node
            last = newNode;           // Update last to the new node
        }
        size++;
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        
        if (isEmpty()) {
            last = newNode;
            last.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
        }
        size++;
    }

    public void delete(int value) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node current = last.next; // Start from first node
        Node prev = last;

        // If list has only one node
        if (current == last && current.data == value) {
            last = null;
            size--;
            return;
        }

        // Search for the node to delete
        do {
            if (current.data == value) {
                prev.next = current.next;
                
                // If deleting the last node
                if (current == last) {
                    last = prev;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        } while (current != last.next);

        System.out.println("Value " + value + " not found in the list");
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node current = last.next; // Start from first node
        System.out.print("Circular Linked List: ");
        
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != last.next);
        
        System.out.println();
    }

    public int size() {
        return size;
    }

    public boolean search(int value) {
        if (isEmpty()) {
            return false;
        }

        Node current = last.next;
        do {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        } while (current != last.next);

        return false;
    }

    public void clear() {
        last = null;
        size = 0;
    }

    // Method to demonstrate the circular nature
    public void displayWithLimit(int limit) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node current = last.next;
        System.out.print("Circular List (showing " + limit + " elements): ");
        
        for (int i = 0; i < limit; i++) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("...");
    }

    // Main method for testing
    public static void main(String[] args) {
        CirculeLink list = new CirculeLink();
        
        System.out.println("=== Circular Linked List Demo ===");
        
        // Test adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(5);
        
        list.display();
        System.out.println("Size: " + list.size());
        
        // Test search
        System.out.println("Search 20: " + list.search(20));
        System.out.println("Search 100: " + list.search(100));
        
        // Demonstrate circular nature
        list.displayWithLimit(8);
        
        // Test deletion
        list.delete(20);
        System.out.println("After deleting 20:");
        list.display();
        
        list.delete(5);
        System.out.println("After deleting 5:");
        list.display();
        
        list.delete(100); // Try to delete non-existent element
    }
}
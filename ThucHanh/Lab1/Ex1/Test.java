public class Test {
    public static void main(String[] args) {
        MyLinkedList<Fraction> list = new MyLinkedList<>();
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(5, 1);
        Fraction f3 = new Fraction(1, 6);
        Fraction f4 = new Fraction(1, 6);

        list.addFirst(f1);
        list.addLast(f2);
        list.addLast(f3);

        list.print();
        System.out.println(list.contains(f4));
    }
}

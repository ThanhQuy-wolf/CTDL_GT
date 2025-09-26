package Stack;

public class Test {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        stack.print();

        int pop = stack.pop();
        System.out.println(pop);

        int peek = stack.getPeek();
        System.out.println(peek);

        stack.print();

        System.err.println(stack.size());
    }
}

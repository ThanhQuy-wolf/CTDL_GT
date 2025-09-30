import java.util.Stack;

public class Question3 {
    private static boolean isNumber(String str) {
        return str != null && str.matches("(0|[1-9][0-9]*)");
    }

    public static int calculate(String[] expression) {
        Stack<Integer> s = new Stack<>();

        for (String token : expression) {
            if (isNumber(token)) {
                s.push(Integer.parseInt(token));
            } else {
                if (s.size() < 2)
                    throw new IllegalArgumentException("Thiếu toán hạng cho toán tử: " + token);
                int b = s.pop();
                int a = s.pop();

                switch (token) {
                    case "+":
                        s.push(a + b);
                        break;
                    case "-":
                        s.push(a - b);
                        break;
                    case "*":
                        s.push(a * b);
                        break;
                    case "/":
                        if (b == 0)
                            throw new ArithmeticException("Chia cho 0");
                        s.push(a / b); // chia nguyên
                        break;
                    default:
                        throw new IllegalArgumentException("Toán tử không hợp lệ: " + token);
                }
            }
        }

        if (s.size() != 1)
            throw new IllegalStateException("Biểu thức không hợp lệ");
        return s.pop();
    }

    public static void main(String args[]) {
        System.out.println(calculate(new String[] { "0", "12", "+" }));
    }
}
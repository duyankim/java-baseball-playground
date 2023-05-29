package calculator;

public class Operator {

    int plus(int sum, int i) {
        return sum + i;
    }

    int minus(int sum, int i) {
        return sum - i;
    }

    int multiply(int sum, int i) {
        return sum * i;
    }

    int divide(int sum, int i) {
        return sum / i;
    }

    void checkOperator(String s, int sum, int i) {
        if (s.equals("+")) {
            plus(sum, i);
        }
        if (s.equals("-")) {
            minus(sum, i);
        }
        if (s.equals("*")) {
            multiply(sum, i);
        }
        if (s.equals("/")) {
            if (i == 0) {
                System.out.println("cannot divide in 0");
            } else {
                divide(sum, i);
            }
        }
    }
}

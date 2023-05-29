package calculator;

public class Calculation {
    public static int currentResult = 0;
    public static int i;

    public static void main(String[] args) {
        StringProcessor sp = new StringProcessor();
        String[] values = sp.getValues();

        for (String value : values) {
            try {
                i = Integer.parseInt(value);
            } catch (NumberFormatException e) {
                Operator op = new Operator();
                op.checkOperator(value, currentResult, i);
            }
        }
    }
}

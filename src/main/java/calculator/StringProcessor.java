package calculator;

import java.util.Scanner;

public class StringProcessor {

    String[] getValues() {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        return line.split(" ");
    }
}

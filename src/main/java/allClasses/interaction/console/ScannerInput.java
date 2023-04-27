package allClasses.interaction.console;

import java.util.Scanner;

public class ScannerInput {
    private final static Scanner scanner = new Scanner(System.in);


    public Long nextLong(String inputText) {
        Long value = null;
        boolean wasInput = false;
        while (!wasInput) {
            System.out.print(inputText);
            String inputValue = scanner.nextLine();
            if (!inputValue.isBlank())
                value = Long.valueOf(inputValue);
            wasInput = true;
        }
        return value;
    }

    public Double nextDouble(String inputText) {
        Double value = null;
        boolean wasInput = false;
        while (!wasInput) {
            System.out.print(inputText);
                String inputValue = scanner.nextLine();
                if (!inputValue.isBlank())
                    value = Double.valueOf(inputValue);
                wasInput = true;
        }
        return value;
    }

    public Float nextFloat(String inputText) {
        Float value = null;
        boolean wasInput = false;
        while (!wasInput) {
            System.out.print(inputText);
                String inputValue = scanner.nextLine();
                if (!inputValue.isBlank())
                    value = Float.valueOf(inputValue);
                wasInput = true;
        }
        return value;
    }

    public Integer nextInt(String inputText) {
        Integer value = null;
        boolean wasInput = false;
        while (!wasInput) {
            System.out.print(inputText);
            String inputValue = scanner.nextLine();
            if (!inputValue.isBlank())
                value = Integer.valueOf(inputValue);
            wasInput = true;
        }
        return value;
    }

    public String nextLine(String inputText) {
        String value = null;
        boolean wasInput = false;
        while (!wasInput) {
            System.out.print(inputText);
                value = scanner.nextLine();
                wasInput = true;
        }
        return value;
    }
}

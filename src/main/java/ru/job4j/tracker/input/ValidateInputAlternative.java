package ru.job4j.tracker.input;

import ru.job4j.tracker.output.Output;

public class ValidateInputAlternative implements Input {
    private final Output output;
    private final Input input;

    public ValidateInputAlternative(Output output, Input input) {
        this.output = output;
        this.input = input;
    }

    @Override
    public String askStr(String question) {
        return input.askStr(question);
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            String result = input.askStr(question);
            if (!isNumber(result)) {
                output.println("Пожалуйста, введите корректные данные");
                continue;
            }
            value = Integer.parseInt(result);
            invalid = false;
        } while (invalid);
        return value;
    }

    private boolean isNumber(String value) {
        boolean result = true;
        char[] check = value.toCharArray();
        for (char number : check) {
            if (number < 48 || number > 57) {
                result = false;
                break;
            }
        }
        return result;
    }
}

package Calculator;

class Cal {
    //Метод, все считающий
    static int calculate(int firstNumber, String operand, int secondNumber) {
        int result = switch (operand) {
            case "-" -> firstNumber - secondNumber;
            case "+" -> firstNumber + secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> firstNumber / secondNumber;
            default -> throw new IllegalArgumentException("Проверьте знак операции");
        };
        return result;
    }
}


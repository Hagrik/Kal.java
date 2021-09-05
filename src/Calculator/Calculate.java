package Calculator;
import java.util.Scanner;
/*
Здравствуйте, не уверен, что правильно засплитил, изначально был рабочий вариант
без всяких пробелов при вводе, но в чате сказали, что пробел нужен, да и в примерах
как будто бы все с пробелами, если будет нужно - переделаю, заранее спасибо)
*/
public class Calculate {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int firstNumber, secondNumber;
        String operator;

        System.out.println("Введите числа через пробел");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        operator = numbers[1];

        //Тут вычисление для арабских
        if (input.matches(".*\\d.*")) {
            firstNumber = Integer.parseInt(numbers[0]);
            secondNumber = Integer.parseInt(numbers[2]);
            if (firstNumber > 10 || secondNumber > 10) {
                throw new IllegalArgumentException("Слишком большие числа");
            }
            int result = Cal.calculate(firstNumber, operator, secondNumber);
            System.out.println(result);

            //Тут для римских
        } else {
            firstNumber = RomanToArabic.romanToNumber(numbers[0]);
            secondNumber = RomanToArabic.romanToNumber(numbers[2]);
            int result = Cal.calculate(firstNumber, operator, secondNumber);
            if (result <= 0) {
                throw new IllegalArgumentException("В римской системе исчисления нет нуля и отрицательных чисел");
            }
            System.out.println(Roman.values()[result]);
        }
    }
}





package operators;

public class LogicalOperator {
    static void main(String[] args) {
        int number1 = 100;
        int number2 = 300;
        int number3 = 500;
        System.out.println((number1==number2)&&(number2==number3));
        System.out.println((number1<number2)&&(number2>number3));
        System.out.println((number1<number2)&&(number2<number3));

        System.out.println((number1==number2)||(number2==number3));
        System.out.println((number1<number2)||(number2>number3));
        System.out.println((number1<number2)||(number2<number3));

        System.out.println(!(number1==number2));

    }
    }


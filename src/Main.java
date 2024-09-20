public class Main {
    public static void main(String[] args)
    {
        int intOperandA = 12;
        int intOperandB = 8;
        int intSum = 3;
        int intProduct = 4;
        int intDifference = 5;
        int intQuotient = 6;
        int intModulo = 7;

        double doubleOperandA = 5.50;
        double doubleOperandB = 0.50;
        double doubleSum = 3;
        double doubleProduct = 4;
        double doubleDifference = 5;
        double doubleQuotient = 6;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " + " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " * " + intOperandB + " is " + intProduct);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " + intOperandA + " - " + intOperandB + " is " + intDifference);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + intOperandA + " / " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo using ints of " + intOperandA + " % " + intOperandB + " is " + intModulo);

        //New line in output to separate int and double outputs
        System.out.println("");

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " + " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " * " + doubleOperandB + " is " + doubleProduct);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " - " + doubleOperandB + " is " + doubleDifference);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles of " + doubleOperandA + " / " + doubleOperandB + " is " + doubleQuotient);

        double myLunchCost = 10.50;
        int kidsInFamily = 3;
        boolean isRaining = false;
        double gasPrice = 3.19;
        int favNumber = 3;
        double shoeSize = 10.50;
        String birthMonth = "May";
        String fullName = "Dawson Bruce";
    }
}
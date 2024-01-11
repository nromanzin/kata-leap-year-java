public class Kata {
    public static void main(String[] args) {
        System.out.println("Welcome to the Dojo");
    }

    public static boolean isLeapYear(int input) {
        return isDivisibleBy(input, 400)
            || !(isDivisibleBy(input, 100) && !isDivisibleBy(input, 400))
            || (isDivisibleBy(input, 4) && !isDivisibleBy(input, 100));
    }

    private static boolean isDivisibleBy(int input, int divider) {
        return input % divider == 0;
    }
}

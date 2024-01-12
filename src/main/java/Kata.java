public class Kata {
    public static void main(String[] args) {
        System.out.println("Welcome to the Dojo");
    }

    public static boolean isLeapYear(int input) {
        if (isDivisibleBy(input, 400)) {
            return true;
        }
        if (isDivisibleBy(input, 100)) {
            return false;
        }
        return isDivisibleBy(input, 4);
    }

    private static boolean isDivisibleBy(int input, int divider) {
        return input % divider == 0;
    }
}

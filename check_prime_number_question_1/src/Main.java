public class Main {
    public static void primeNumberChecking(int num) {
        if (num <= 1) {
            System.out.println("Not a prime number");
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("Not a prime number");
                return;
            }
        }
        System.out.println("Prime number");
    }

    public static void main(String[] args) {
        primeNumberChecking(53);
    }
}
public class First10Primes {
    public static void main(String[] args) {
        int count = 0;  // Counter for the number of primes found
        int num = 2;    // Starting number to check for primality

        // Loop until we find 10 prime numbers
        while (count < 10) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

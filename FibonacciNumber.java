 class Fibonacci {
    // Recursive method to find Fibonacci number
    public static int fib(int n) {
        if (n == 0) {
            return 0;  // Base case F(0) = 0
        }
        if (n == 1) {
            return 1;  // Base case F(1) = 1
        }
        // Recursive calls for F(n-1) and F(n-2)
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 4; // Example input
        System.out.println("F(" + n + ") = " + fib(n));
    }
}


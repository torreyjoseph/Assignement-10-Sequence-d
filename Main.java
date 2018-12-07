public class Main {

    public static void main(String[] args) {
        perfect_square(1);
        perfect_cube(1);
        fibonacci(1, 0);
        primes(2, 1);
        triangles(1, 2, 1);
    }
    private static void perfect_square(int x){
        System.out.print("\nFirst 10 Square Numbers: ");
        while (x <= 10){
            x = x + 1;
            int n = x - 1;
            int ans = n * n;
            System.out.print(ans+" ");
        }
    }
    private static void perfect_cube(int x){
        System.out.print("\nFirst 10 Cube Numbers: ");
        while (x <= 10){
            x = x + 1;
            int n = x - 1;
            int ans = n * n * n;
            System.out.print(ans+" ");
        }
    }
    private static void fibonacci(int x, int y){
        System.out.print("\nFirst 10 Fibonacci Numbers from 1: ");
        while (x <= 34){
            x = x + 1;
            int ans = (x-1) + y;
            x = y;
            y = ans;
            System.out.print(ans+" ");
        }
    }
    private static void primes(int x, int y) {
        System.out.print("\nFirst 10 Prime Numbers: ");
        while (y <= 10) {
            int divisor = 2;
            boolean isPrime = true;
            while (divisor < x) {
                if (x % divisor != 0) {
                    divisor = divisor + 1;
                } else {
                    isPrime = false;
                    divisor = divisor + 1;
                }
            }
            if (isPrime) {
                System.out.print(x + " ");
                x = x + 1;
                y = y + 1;
            } else {
                x = x + 1;
            }
        }
    }
    private static void triangles(int x, int y, int z){
        System.out.print("\nFirst 10 Triangle Numbers: ");
        while (z <= 9) {
            x = x + y;
            y = y + 1;
            z = z + 1;
            System.out.print(x + " ");
        }
    }
}
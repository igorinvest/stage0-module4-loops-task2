package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 0;
        while (i <= printToInclusive) {
            if(isPrime(i)) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static boolean isPrime(int n){
        int factors = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0) // ensure that you mod n not i
                factors++;
        }
        // if factors count is equals to 2 then it is prime number else it's not prime number
        if(factors == 2)
            return true;
        else
            return false;
    }
}

package Basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IsPrimeNumber {
    ArrayList<Integer> sieveOfEratosthenes(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] isPrime = new boolean[n + 1];

        // Step 1: Assume all numbers are prime
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Step 2: Start sieving
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 3: Collect primes
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) list.add(i);
        }

        return list;
    }

    public static void main(String[] args) {
        IsPrimeNumber sol = new IsPrimeNumber();

        // Test input
        int n = 20;

        // Call the function and print result
        ArrayList<Integer> list = sol.sieveOfEratosthenes(n);

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }




    }


}

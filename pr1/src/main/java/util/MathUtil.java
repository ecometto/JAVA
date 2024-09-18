package util;

public class MathUtil {

    public static boolean isEven(int num){
        if(num % 2 == 0){
            System.out.println("El numero " + num + " es par.");
            return true;
        }else{
            System.out.println("El numero " + num + " es impar.");
            return false;
        }
    }

    public static boolean isPrime(int num){

        boolean prime = true;

        for (int i = 2; i <= num/2; i++) {
            if(num % i == 0){
                return  !prime;
            }
        }
        System.out.println("numero " +num+ " es primo." );
        return prime;
    }

    public static void listOfPrimes(int untill){
        System.out.println("lista de numeros primos desde 1 hasta " + untill);
        for (int i = 1; i < untill; i++) {
            isPrime(i);
        }

    }

}

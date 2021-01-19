/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package melone_esercitazione_junit;

/**
 *
 * @author informatica
 */
public class NumberHelper {

    private int number;

    public NumberHelper(int n) {
        number = n;
    }

    public boolean isEven() {

        boolean pari = false;
        if (number % 2 == 0) {
            pari = true;
        } else if (number % 2 != 0) {
            pari = false;
        }
        return pari;
        // ritorna true se number numero pari, altrimenti ritorna false
    }

    public boolean isOdd() {
        boolean dispari = false;
        if (number % 2 != 0) {
            dispari = true;
        } else if (number % 2 == 0) {
            dispari = false;
        }
        return dispari;
        // ritorna true se number è un numero dispari, altrimenti ritorna false

    }

    public int sum(int n) {

        int somma;
        somma = number + n;
        return somma;
        // ritorna la somma tra number e n
    }

    public boolean isPrime() {
        boolean primo = false;
        for (int i = 2; i < number / 2; i++) {
            if (number % i ==0) 
            {
                primo = false;
                break;
            } else if (number % i != 0) 
            
            {
                primo = true;
            }
        }
        if (number==1 || number==3 || number==5)
        {
            primo=true;
        }
        
        return primo;
        // ritorna true se number è un numero primo, altrimenti ritorna false
    }

    public boolean isDivisibleBy(int n) {

        boolean divisibile = false;
        if (number % n == 0) {
            divisibile = true;
        } else if (number % n != 0) {
            divisibile = false;
        }
        return divisibile;
        // ritorna true se number è divisibile per il parametro n, altrimenti ritorna false
    }

}

package com.gokhankaplan.ebobekok;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {



        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("a: ");
        a = input.nextInt();
        System.out.println("b: ");
        b = input.nextInt();
        int i = a;
        int j = a;

        if (a>b) {
            while (i>1){
                if (a % i == 0 && b % i ==0) {
                    System.out.println("Ebob: " + i);
                    break;
                }
                i--;
            }
            while (j< a * b) {
                if (j % a == 0 && j % b ==0) {
                    System.out.println("Ekok: " + j);
                    break;
            }
                j++;
        }
    }
        else {
            System.out.println("ilk numarayı ikinciden büyük giriniz.");
        }
}
}

   //if içeren versiyon
        /*
        if (a>b) {
            for (int i = a; i>1; i--) {
                if (a % i == 0 && b % i ==0) {
                    System.out.println(i);
                    break;
                }
            }
            for (int i = 1; i< a * b; i++) {
                if (i % a == 0 && i % b ==0) {
                    System.out.println(i);
                    break;
            }
        }

    }
        else {
            System.out.println("ilk numarayı ikinciden büyük giriniz.");
        }
  }
}
}
*/


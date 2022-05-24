//Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
//https://app.patika.dev/gazellhatice

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int number = scan.nextInt();

        for (int i = 1; i <= number; i++){
            int a = number - i;

            for (int k = i; k >= 1; k--){
                System.out.print(" ");
            }

            for (int j = 1; j <= 2*a+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

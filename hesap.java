package java101;

import java.util.Scanner;
/*Java döngüler ile 0'dan girilen sayıya
 kadar olan sayılardan 3 ve 4'e tam bölünen sayıların
 ortalamasını hesaplayan programı yazınız.
 */

public class hesap {
    public static void main(String[] args) {
        int sayi,avr,k=0,toplam=0;
        Scanner inp=new Scanner(System.in);
        System.out.println("Sayi giriniz...");
        sayi=inp.nextInt();

        for(int i=1; i<=sayi; i++){
            if(i%3==0 && i%4==0){
                toplam=toplam+i;
                k++;
            }
        }
        avr=toplam/k;
        System.out.println("-3 E VE 4 E BOLUNEN SAYILARIN ORTALAMASI:  "+avr);
    }
}

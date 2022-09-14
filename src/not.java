
import  java.util.Scanner;
//Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

public class not {
    public static void main(String[] args) {
        int mat,fizik,kimya,tarih,tr,muzik,ders=0,toplam=0;
        double avr;
        Scanner inp=new Scanner(System.in);

        System.out.println("Notlarınız giriniz...");
        System.out.print("Matematik:");
        mat=inp.nextInt();
        System.out.print("Fizik:");
        fizik=inp.nextInt();
        System.out.print("Kimya:");
        kimya=inp.nextInt();
        System.out.print("Tarih:");
        tarih =inp.nextInt();
        System.out.print("Turkçe:");
        tr=inp.nextInt();
        System.out.print("Müzik:");
        muzik=inp.nextInt();

        if(mat>0 && mat<100){
            toplam=toplam+mat;
            ders++;
        }if(fizik>0 && fizik<100){
            toplam=toplam+fizik;
            ders++;
        }if(tarih>0 && tarih<100){
            toplam=toplam+tarih;
            ders++;
        }if(kimya>0 && kimya<100){
            toplam=toplam+kimya;
            ders++;
        }if(muzik>0 && muzik<100){
            toplam=toplam+muzik;
            ders++;
        }if(tr>0 && tr<100){
            toplam=toplam+tr;
            ders++;
        }
        avr=toplam/ders;

        if(avr>55){

            System.out.println("Geçtiniz");
        }else{
            System.out.println("Kaldınız");
        }
        System.out.println("Ortalamanız:"+avr);
    }
}

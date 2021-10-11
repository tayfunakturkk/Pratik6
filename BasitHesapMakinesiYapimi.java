package Pratik6;
import java.util.Scanner;
public class BasitHesapMakinesiYapimi {
    public static void main(String[] args) {
        double n1,n2;
        int select;
        Scanner input= new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz:");
        n1 = input.nextDouble();

        System.out.print("İkinci Sayıyı Giriniz:");
        n2 =input.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiniz:");
        select=input.nextInt();

        switch (select){
            case 1:
                System.out.println("Sonuç:" +(n1 + n2));
                break;

            case 2:
                System.out.println("Sonuç:" +(n1-n2));
                break;

            case 3:
                System.out.println("Sonuç:" +(n1*n2));
                break;

            case 4:
                if (n1==0){
                    System.out.println("0 herhangi bir sayıya bölünemez.");
                }
                else
                System.out.println("Sonuç:" +(n1/n2));
                break;

            default:
                System.out.println("Yanlış Sayı Girdiniz.");

        }


    }

}

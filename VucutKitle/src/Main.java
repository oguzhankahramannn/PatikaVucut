import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının
         "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

                 Formül Kilo (kg) / Boy(m) * Boy(m) */

        double boy;
        double kilo,indeks;
        Scanner scan = new Scanner(System.in);
        System.out.println("Boyunuzu giriniz : ");
        boy = scan.nextDouble();
        System.out.println("Kilonuzu giriniz : ");
        kilo = scan.nextDouble();
        indeks = kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz : " + indeks);

    }
}
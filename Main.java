import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diziBoyutu;
        
        System.out.print("Dizinin boyutu n: ");
        diziBoyutu = sc.nextInt();
        int[] dizi = new int[diziBoyutu];
        System.out.println("Dizinin elemanlarını giriniz: ");

        for(int i=0;i<diziBoyutu;i++){
            System.out.print((i+1)+". Elemanı: ");
            dizi[i] = sc.nextInt();
        }
        Arrays.sort(dizi);
        System.out.print("Sıralama: "+Arrays.toString(dizi));
    }
}
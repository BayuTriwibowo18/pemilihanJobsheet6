import java.util.Scanner;
public class Latihan1_07 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        int bil1, bil2, bil3;
        int bilBesar;

        System.out.println("masukkan bil1: ");
        bil1 = sc.nextInt();
        System.out.println("masukkan bil2: ");
        bil2 = sc.nextInt();
        System.out.println("masukkan bil3: ");
        bil3 = sc.nextInt();
        

        if (bil1 >= bil2) {
            if (bil1 >= bil3) {
                System.out.println("Bilangan terbesar: " + bil1);
            } else {
                System.out.println("Bilangan terbesar: " + bil3);
            }
        } else {
            if (bil2 >= bil3) {
                System.out.println("Bilangan terbesar: " + bil2);
            } else {
                System.out.println("Bilangan terbesar: " + bil3);
            }
        }
    

}
}

import java.util.Scanner;
public class Pemilihan2Percobaan207 {
    public static void main(String[] args){
        Scanner input07 =new Scanner(System.in);
        float  sudut1, sudut2, sudut3, totalSudut;

        System.out.println("Masukkan Sudut1 :");
        sudut1 = input07.nextInt();
        System.out.println("Masukkan Sudut2 :");
        sudut2 = input07.nextInt();
        System.out.println("Masukkan Sudut3 :");
        sudut3 = input07.nextInt();
        totalSudut = sudut1 + sudut2+ sudut3;
        System.out.println("Total sudut" + totalSudut);
         

        if (totalSudut == 180 ){
            if (( sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)){
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
           
            } else {
                System.out.println("Segitiga tersebut adakah bukan segitiga siku-siku");
            
            } 
         } else {
            System.out.println("Bukan segitiga");
         }
                
            }
            }

        




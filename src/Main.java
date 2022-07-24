import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayi giriniz :");
        int n = input.nextInt();
        for (int i=(n-1);i>=0;i--){
            for(int k=1;k<=(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
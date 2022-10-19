import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int max=1,min=1,number;


        Scanner input =new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz :");
        int counter= input.nextInt();
        for (int i=1; i<=counter;i++){
            System.out.print(i+".Sayıyı giriniz :");
            number = input.nextInt();
            if (i==1){
                min=number;
                max=number;
            }
            else {
                if (number>max){
                    max=number;
                }
                if (number<min){
                    min=number;
                }

            }

        }
        System.out.println("En büyük sayı :"+max);
        System.out.println("En küçük sayı :"+min);
    }

}
import java.util.Scanner;


public class katlar {

    public static void main(String[] args) {
        int i,j,sayı;

        Scanner inp= new Scanner(System.in);
        System.out.print("Bir sayı giriniz =");
        sayı=inp.nextInt();

        System.out.println("5 in katları------");
        for (i=1; i<=sayı;i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("4 ün katları------");
        for (j=1; j<=sayı;j++){

            if (j%4 == 0){

                System.out.println(j);
            }
        }
    }
}

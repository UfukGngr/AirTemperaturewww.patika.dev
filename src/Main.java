import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double temp=0;
        String result="";
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Hava Sıcaklığını Giriniz:");
        temp=scan.nextDouble();

        //Çözüm 1
        if (temp<5){
            System.out.println("Hava kayak yapmanız için uygun");
        }else if (temp>5 && temp<15) {
            System.out.println("Hava siname için mükemmel");
        }else if (temp>15 && temp>25){
            System.out.println("Hava piknik için on numara");
        }else
            System.out.println("Hava yüzmek için çok uygun");


        //Çözüm 2 Ternary İf Kullanımı

        result=(temp<5)?"Hava kayak yapmanız için uygun":(temp>5 && temp<15)?"Hava siname için mükemmel":(temp>15 && temp<25)?"Hava piknik için on numara":"Hava yüzmek için çok uygun";

        System.out.println(result);
    }
}
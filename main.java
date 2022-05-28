import java.util.Scanner;
public class main {
    public static void main(String[] args){
        double armutF=2.14,elmaF=3.67,domatesF=1.11,muzF=0.95,patlıcanF=5.00;
        double armutK,elamK,domatesK,muzK,patlıcanK;
        Scanner imput=new Scanner(System.in);
        System.out.print("Armut Kaç Kilo :");
        armutK= imput.nextDouble();
        System.out.print("Elam Kaç Kilo :");
        elamK = imput.nextDouble();
        System.out.print("Domates Kaç Kilo :");
        domatesK = imput.nextDouble();
        System.out.print("Muz Kaç Kilo :");
        muzK =imput.nextDouble();
        System.out.print("Patlıcan Kaç Kilo :");
        patlıcanK = imput.nextDouble();
        double toplama=((armutF*armutK)+(elamK*elmaF)+(domatesF*domatesK)+(muzF*muzK)+(patlıcanF*patlıcanK));
        System.out.print("Toplama Tutar :"+toplama);

    }
}

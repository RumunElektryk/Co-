import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ile dostałeś/dostałaś punktów?");
        int pkt = scan.nextInt();


        if (pkt < 50)
            System.out.println("Musisz sie jeszcze dużo nauczyć");
        else if (pkt < 70) {
            System.out.println("Średni wynik, ale jesteś na dobrej drodze.");

        } else if (pkt > 70) {
            System.out.println("Świetnie! Dobrze ci poszło");



        }
    }
}//tak
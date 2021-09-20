package Main;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static String[] cisla;
    public static void main(String[] args) {
        System.out.println("Vítej");
        System.out.println("co chceš");
        System.out.println("1. úkol");
        System.out.println("2. úkol");
        System.out.println("3. úkol");
        int vyber = sc.nextInt();

        System.out.println("jak dlouhé pole chcete ?");
        int dylka = sc.nextInt();
        for (int i = 1; i <= dylka; i++) {
            System.out.println("napiš si " + i + ". číslo");
            /*String input = String.valueOf(sc.nextInt());
            cisla[i] = input;*/
        }
        switch (vyber){
            case 1:
                a();
                break;
            case 2:
                b(dylka);
                int pocetShod = 0;
                System.out.println("které číslo chcete porovnávat ?");
                int porovnavaciCislo = sc.nextInt();
                for (int i = 0; i < dylka; i++) {
                    if (String.valueOf(cisla[i]) == String.valueOf(porovnavaciCislo));{
                        pocetShod =+1;
                    }
                }
                System.out.println(pocetShod);
                break;
            case 3:
                c();
                break;
        }
        for (int i = 0; i < cisla.length; i++) {
            System.out.print(cisla + ", ");
        };
    }
    public static void a(){

    }
    public static void b(int dylka){
        for (int i = 0; i < dylka; i++) {

        }
    }
    public static void c(){

    }
}

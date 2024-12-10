import java.util.Scanner;


public class Main {
    public  static  void afficher_menu(){
        System.out.println("********* Menu **********");
        System.out.println("1-Addition (+)");
        System.out.println("2-substraction (-)");
        System.out.println("3-Multiplication (*)");
        System.out.println("4-Division  (/)");
        System.out.println("5-Puissance  ");
        System.out.println("6-Racine carre  ");
        System.out.println("7-Factorielle   ");
        System.out.println("8-Quitter  ");
        System.out.print("Entrez votre choix : ");
    }
    public static double[] demande_deux_nombre(Scanner sc) {
        System.out.println("Enter la premiere nombre :");
        double a= sc.nextDouble();
        System.out.println("Enter la deuxieme nombre :");
        double b= sc.nextDouble();
        return new double[]{a,b};
    }
    public static double addition(double a,double b){
        return a+b;
    }
    public static double substraction(double a,double b){
        return a-b;
    }
    public static double multiplication(double a,double b){
        return a*b;
    }
    public static double division(double a,double b){
        if (b!=0)
            return a/b;
        else
            return 0;
    }

    public static double puissance(double a,int b){
        return  Math.pow(a, b);
    }
    public static double racineCarree(double a) {
        if (a < 0) {
            System.out.println("Erreur : Impossible de calculer la racine carrée d'un nombre négatif.");
            return 0;
        }
        return Math.sqrt(a);
    }
    public static long factorielle(int a) {
        if (a == 0 || a == 1) return 1;
        return a * factorielle(a - 1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean continuer = true;

        while (continuer){
            afficher_menu();
            int choix= sc.nextInt();
            switch (choix){
                case 1:
                    double[] num1 = demande_deux_nombre(sc);
                    System.out.println("Résultat : " + addition(num1[0], num1[1]));
                    break;
                case 2:
                    double[] num2 = demande_deux_nombre(sc);
                    System.out.println("Résultat : " + substraction(num2[0], num2[1]));
                    break;


            }
        }
    }
}
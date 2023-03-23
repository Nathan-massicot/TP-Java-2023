import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix = 0;
        do {
            System.out.println("=== Menu TP1 ===");
            System.out.println("1. Exercice 1");
            System.out.println("2. Exercice 2");
            System.out.println("3. Exercice 3");
            System.out.println("4. Quitter");

            System.out.print("Entrez votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Vous avez choisi  : Exercice 1.");
                    Point p0, p1;
                    p0 = new Point();
                    p0.x = 3.1;
                    p0.y =  5.3;

                    p1 = new Point( 1.2, 2.3);

                    System.out.println("P1("+p1.x+","+p1.y+")");
                    System.out.println("Distance 1"+ Point.distanceStat(p0,p1));

                    //Partie exercice 2 rectangle
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Saisir la longueur :");
                    int lon = Integer.parseInt(sc.nextLine());
                    System.out.print("Saisir la largeur :");
                    int larg = Integer.parseInt(sc.nextLine());

                    Rectangle r = new Rectangle(0,0,lon,larg);

                    System.out.print("Périmètre :"+ r.perimetre()+"\n"); // println != print
                    System.out.println("Surface :" + r.surface());
                    break;
                case 2:
                    System.out.println("Vous avez choisi  : Exercice 2.");
                    // Ajoutez votre code ici
                    break;
                case 3:
                    System.out.println("Vous avez choisi  : Exercice 3.");
                    // Ajoutez votre code ici
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez entrer un choix valide.");
                    break;
            }
            System.out.println();
        } while (choix != 4);
    }
}

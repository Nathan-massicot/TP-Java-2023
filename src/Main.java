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
            System.out.println("4. Exercice 4");
            System.out.println("5. Quitter");

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

                    // creation premiere date
                    int j,m,a;
                    Scanner sc1 = new Scanner(System.in); // Donne un nom autre que "sc" au scanner car "sc" deja utilisé
                    System.out.print("Saisir le jour :");
                    j = Integer.parseInt(sc1.nextLine());
                    System.out.print("Saisir le mois :");
                    m = Integer.parseInt(sc1.nextLine());
                    System.out.print("Saisir le annee :");
                    a = Integer.parseInt(sc1.nextLine());

                    Date d1 = new Date(j,m,a);
                    d1.afficher();

                    // creation deuxième date
                    j = Integer.parseInt(sc1.nextLine());
                    System.out.print("Saisir le mois :");
                    m = Integer.parseInt(sc1.nextLine());
                    System.out.print("Saisir le annee :");
                    a = Integer.parseInt(sc1.nextLine());

                    Date d2 = new Date(j,m,a);
                    d2.afficher();

                    //comparaison des deux dates
                    d1.comparerDates(d2);

                    System.out.println("D1 D2 = " + d1.comparerDates(d2));
                    System.out.println("====END==== ");

                    break;
                case 3:
                    System.out.println("Vous avez choisi  : Exercice 3.");

                    String marque ;
                    int vitesseMax;


                    Vehicule monVehicule = new Vehicule();
                    Scanner sc2 = new Scanner(System.in);
                    // premiere marque et vitesse
                    System.out.print("Saisir la premiere marque :");
                    marque = sc2.nextLine();
                    System.out.print("Saisir la  premiere Vitesse Max :");
                    vitesseMax = Integer.parseInt(sc2.nextLine());

                    monVehicule.setMarque(marque);
                    monVehicule.setVitessemaximale(vitesseMax);

                    monVehicule.afficher();

                    monVehicule.demarrer();
                    monVehicule.eteindre();

                    // deuxieme marque et vitesse
                    Vehicule tonVehicule = new Vehicule();
                    System.out.print("Saisir la deuxieme marque :");
                    marque = sc2.nextLine();
                    System.out.print("Saisir la  deuxieme Vitesse Max :");
                    vitesseMax = Integer.parseInt(sc2.nextLine());

                    tonVehicule.setMarque(marque);
                    tonVehicule.setVitessemaximale(vitesseMax);

                    //
                    if(tonVehicule.Estdemarer()){
                        tonVehicule.eteindre();
                    }

                    tonVehicule.afficher();

                    System.out.println("Nombre ="+ Vehicule.getNombre());
                    break;
                case 4:
                    System.out.println("Vous avez choisi  : Exercice 4.");

                    break;
                case 5:
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

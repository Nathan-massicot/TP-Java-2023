public class Client {
    int ID;
    String nom;
    String prénom;
    CompteBancaire compte;

    Client(int ID,String nom,String prénom)
    {
        this.nom = nom;
        this.prénom = prénom;
        this.ID = ID;
        this.compte= new CompteBancaire();
    }

    Client(int ID,String nom,String prénom,CompteBancaire cmp)
    {
        this.nom = nom;
        this.prénom = prénom;
        this.ID = ID;
        this.compte= cmp;
    }

    void deposer( double montant)
    {
        compte.deposer(montant);
    }

    boolean retirer(double montant)
    {
        return compte.retirer(montant);
    }

    public void afficher()
    {
        System.out.println("Nom : "+ this.nom);
        System.out.println("Prenom :"+ this.prénom);
        this.compte.afficherSolde();
    }

}


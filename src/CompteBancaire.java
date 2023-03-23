public class CompteBancaire {
    int numerocompte;
    double Solde;
    double interet;

    CompteBancaire()
    {
        Solde = 0.0;
        interet = 0.05;

    }

    CompteBancaire(int numerocompte,double Solde, double interet)
    {
        this.Solde = Solde;
        this.interet = interet;
        this.numerocompte = numerocompte;

    }
    void changertauxinteret(double taux){
        this.interet= taux;
    }
    void ajouterinteret(double taux)
    {
        this.interet += this.interet + taux ;
    }
    void afficherSolde()
    {
        System.out.println("Solde :"+ this.Solde);
    }
    void deposer( double montant)
    {
        this.Solde += montant;
    }

    boolean retirer(double montant)
    {
         if( montant > Solde)
             return false;
        this.Solde -= montant;
        return true;
    }
}


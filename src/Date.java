public class Date {
    int jour, mois ,annee;
    public Date (int jour, int mois , int annee){
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public void afficher()
    {
        System.out.println(("La Date est : "+ jour+"/"+mois+"/"+annee));
    }

    public static int compareDateStat (Date d1, Date d2)
    {
        if(d1.annee == d2.annee)
            if(d1.mois == d2.mois)
                if (d1.jour == d2.jour) return 0;
                else if(d1.jour > d2.jour) return 1;
                else return -1;
            else if(d1.mois > d2.mois) return 1;
            else return -1;
        else if (d1.annee > d2.annee) return 1;
        else return -1;
    }
    public int comparerDates(Date d)
    {
        return Date.compareDateStat(this,d);
    }
}

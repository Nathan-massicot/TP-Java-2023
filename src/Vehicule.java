public class Vehicule{


    private String marque;


    private final int PuissanceFiscale;

    private int vitessemaximale;
    private int vitesseCourante;



    private static int nombre = 0;
    private boolean demarrer;

    Vehicule()
    {
        this.PuissanceFiscale = 0;
        nombre = nombre +1;
    }
    Vehicule(String marque,int PuissanceFiscale, int vitessemaximale)
    {
        this.marque = marque;
        this.PuissanceFiscale = PuissanceFiscale;
        this.vitessemaximale = vitessemaximale;
        nombre = nombre + 1;
    }

    public void demarrer(){
        demarrer = true ;
    }

    public  void eteindre(){
        demarrer = false;
    }

    public boolean Estdemarer(){
        return demarrer;
    }

    public void afficher()
    {
        System.out.println("Marque :"+ marque);
        System.out.println("Puissance fiscale :"+ PuissanceFiscale);
        System.out.println("Vitesse maximale :"+ vitessemaximale);
        System.out.println("Vitesse courante :"+ vitesseCourante);

    }
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getVitessemaximale() {
        return vitessemaximale;
    }

    public void setVitessemaximale(int vitessemaximale) {
        this.vitessemaximale = vitessemaximale;
    }

    public static int getNombre() {
        return nombre;
    }

    public static void setNombre(int nombre) {
        Vehicule.nombre = nombre;
    }
}

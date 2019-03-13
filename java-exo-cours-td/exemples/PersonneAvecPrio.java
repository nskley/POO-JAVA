public class PersonneAvecPrio<P extends Comparable<P>> implements Comparable<PersonneAvecPrio<P>>{
    //attributs
    protected P priorite;
    protected String nom;
    protected String Prenom;
    //contructor
    public PersonneAvecPrio(String nom,String prenom,p prio){
        this.nom=nom;
        this.Prenom=prenom;
        this.priorite=prio;
    }
    //methodes
    //public void compareTo(PersonneAvecPrio<P> pers){
        
    //}
    //equals(Object o)
}
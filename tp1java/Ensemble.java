import java.util.*; 

public class Ensemble {
    protected float boite[];
    protected int size;
    protected int contenance;
    //constructeur
    public Ensemble(int tailleMax){
        this.boite=new float[tailleMax];
        this.size=0;
        this.contenance=tailleMax;
    }
    //methodes
        //ajout d'un element s'il n'existe pas!
        //un ensemnle ne pouvant pas contenir 2 fos le même élément
        //on utilise une boucle while pour eviter de parcourir tout l'ensemble
    public void add(float x){
        int i=0;
        while(i<this.size && this.boite[i]!=x){
            i++;
        }
        if(i==this.size){
            this.boite[this.size]=x;
            this.size++;
        }
    }
        //recuperation de taille et contenance
	public int getSize() {
		return this.size;
    }

    public int getContenance(){
        return this.contenance;
    }
    //constructeur par copie
    public Ensemble( Ensemble E) {
		this.boite=new float[E.contenance];
		this.contenance=E.contenance;			
	}
    
        //test ensemble vide ou pas
    public boolean isEmpty(){
        return this.size==0;
    }
        //supression d'un element
        //on le fait avec une bocle while car on a pas forcément besoin de parcourir tout l'ensemble
    public void remove(float x){
        int n=0;
        while(n<this.size && this.boite[n]!=x){
            n++;
        }
        if(n<this.size){
                for(int j=n; j<this.size-1; j++){
                    this.boite[j]=this.boite[j+1];
                }
                this.size--;
        }

    }
    //test d'appartenance à l'ensemble
    public boolean contains(float x){
        int n=0;
        while(n<this.size && this.boite[n]!=x){
            n++;
        // n=this.size si x n'est pas dans l'ensemble !
        }
        return n!=this.size;
    }

    //recopier les val de p dans this
    public String toString() {
        String s="[";
        if (this.isEmpty()) {
            return s+"]";
        }
        for(int i=0; i<this.size; i++) {
            s=s+this.boite[i]+",";
        }
        s=s.substring(0,s.length()-1)+"]";
        return s;
    }

    //suppression de tous les elements de l'ensemble
    public void clear(){
        for(int i=0; i<this.size; i++){
            this.remove(this.boite[i]);
        }
        this.size=0;
    }

    //nombre aleatoire
    public float random(){
        Random rand = new Random();
        int nbrAleatoire = rand.nextInt(this.size);
        return this.boite[nbrAleatoire];
    }

    //teste d'egalité de deux ensembles
    //deux ensembles sont egaux s'ils ont exactement les memes element
    /* il s'en suit qu'on ne tient pas compte de l'ordre dans lequel les elements sont placés dans
    l'ensemble (comme on l'a fait avec la pile!)*/
    public boolean equals(Ensemble E){
        if(E.size!=this.size){
            return false;
        }
        int i=0;
        while(i<this.size && E.contains(this.boite[i])){
            i++;
        }
        return i==this.size;/*en effet, s'il existe un element de E non contenu dans this.boite,
        alors on sort forcément de la boucle "while" avec une valeur i<this.boite */
        /* par contre , si E contient tous les elements de this.boite, on sort de la boucle
        while avec i=this.size */
    }
    
    public static void main(String args[]) {
        Ensemble p1;
        p1=new Ensemble(10);
		for(float i=0; i<10; i+=2){
            p1.add(i+01);
        }
        System.out.println(p1.random());
  
    }
}
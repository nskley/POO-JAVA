public class FileChainee<E> implements IFileNonBornee<E>{
    private class Cellule{
        E valeur;
        Cellule suivant;
        Cellule(E x){
            valeur=x;
            suivant=null;
        }
    }
    //attributs
    private Cellule premier;
    private Cellule dernier;
    private int size;
    //methodes
    public boolean IsEmpty(){
        return this.taille==0;
    }
    public int getSize(){
        return this.size;
    }
    public void add(E x){
        
    }
}
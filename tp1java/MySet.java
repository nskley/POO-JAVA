import java.util.*;
public  class MySet{
    protected ArrayList<Float> array;
    protected int size;
    public MySet(){
        this.array=new ArrayList<Float>();
        this.size=0;
    }


    public void add(float x){
        if(!contains(x)){
            this.array.add(x);
            this.size++;
        }   
    }

    public int getSize() {
		return this.size;
    }

    //test ensemble vide ou pas
    public boolean isEmpty(){
        return this.size==0;
    }

        //supression d'un element
    //on le fait avec une bocle while car on a pas forcément besoin de parcourir tout l'ensemble

    public void remove(float x){
        int n=0;
        while(n<this.size && this.array.get(n)!=x){
            n++;
        }
        if(n<this.size){
            this.array.remove(n);
            this.size--;
        }
    }
    public boolean contains(float x){
        int n=0;
        while(n<this.size && this.array.get(n)!=x){
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
            s=s+this.array.get(i)+",";
        }
        s=s.substring(0,s.length()-1)+"]";
        return s;
    }
    //la fonction clear est deja predifinie 
    public void clear(){
        this.array.clear();
        this.size=0;
    }

    //nombre aleatoire
    public float random(){
        Random rand = new Random();
        int nbrAleatoire = rand.nextInt(this.size);
        return this.array.get(nbrAleatoire);
    }
    public boolean equals(MySet A){
        if(A.size!=this.size){
            return false;
        }
        int i=0;
        while(i<this.size && A.contains(this.array.get(i))){
            i++;
        }
        return i==this.size;
    }

    public static void main(String args[]) {
        MySet a1,a2;
        a1=new MySet();
		for(float i=0; i<10; i+=2){
            a1.add(i+01);
        }
        a2=new MySet();
		for(float i=0; i<10; i+=2){
            a2.add(i+01);
        }
        //test d'egalité
        System.out.println(a1.equals(a2));
        System.out.println(a1);
        a1.remove(9);
        a1.add(10);
        System.out.println(a1.isEmpty());
        System.out.println(a1.equals(a2));
    }
}
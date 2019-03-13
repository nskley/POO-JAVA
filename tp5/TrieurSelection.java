import java.util.*;

public class TrieurSelection<T extends Comparable<T>> implements Trieur<T>{
    protected ArrayList<T> list = new ArrayList<T>();

    //constructeur par defaut

    //methodes
    public boolean isEmpty(){
        return this.list.size()==0;
    }

    public void swap(int i,int j){
        T temp=this.list.get(i);
        this.list.set(i,this.list.get(j));
        this.list.set(j,temp);
    }

    public void add(int index,T elem){
        this.list.add(index,elem);
    }

    public int sort(){
        int cmpt=0;
        boolean tableau_trié;
        for(int i=0; i<this.list.size()-1; i++){
            tableau_trié = true;
            for(int j=i+1; j<this.list.size(); j++){
                if(this.list.get(i).compareTo(this.list.get(j))>0){
                    this.swap(i, j);
                    tableau_trié = false;
                }
                cmpt++;
            }
            if(tableau_trié){
                break;
            }
        }
        return cmpt;
    }

    public void setData(ArrayList<T> liste){
        for(int i=0; i<liste.size(); i++){
            this.list.add(liste.get(i));
        }
    }


    public ArrayList<T> getData(){
        return this.list;
    }

    public String toString(){
        String s="[";
        if(this.isEmpty()){
            s=s+"]";
        }
        for(int i=0; i<this.list.size(); i++){
            s=s+this.list.get(i)+", ";
        }
        s=s.substring(0,s.length()-2)+"]";
        return s;
    }
}
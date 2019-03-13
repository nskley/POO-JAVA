public class TrieurBulle<T extends Comparable<T>> extends TrieurSelection<T> implements Trieur<T>{
    public int sort(){
        int cmpt=0;
        boolean tableau_trié;
        for(int i=this.list.size()-1; i>=1; i++){
            tableau_trié = true;
            for(int j=0; j<=i-1; j++){
                if(this.list.get(j).compareTo(this.list.get(j+1))>0){
                    this.swap(j, j+1);
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
}
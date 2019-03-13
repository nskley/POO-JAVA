public abstract class Figure{
    Dessin draw;
    char signe;
    Position pos;
    //Constructor
    public Figure(int line, int colum, char car, Position pos){
        this.draw=new Dessin(line, colum);
        this.signe=car;
        this.pos=pos;
    }
    //methodes
    public abstract void fill();

    public void tString(){
        String s[]=new String[this.draw.matrice.length];
        for(int i=0; i<this.draw.matrice.length; i++){
            s[i]="";
        }
        for(int i=0; i<this.draw.matrice.length; i++){
            for(int j=0; j<this.draw.matrice[0].length; j++){
                s[i]+=this.draw.matrice[i][j]+" ";
            }
        }
        for(int i=0; i<this.draw.matrice.length; i++){
            System.out.println(s[i]);
        }
    }
}
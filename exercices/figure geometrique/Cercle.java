public class Cercle extends Courbe{
    public Cercle(int line,int colum,char car,Position pos){
        super(line,colum,car,pos);
    }

    public void fill(double rayon){
        Point centre=new Point(0.0,0.0);
        centre.convertPosEnPoint(this.pos);
        for(int i=0; i<this.draw.matrice.length; i++){
            for(int j=0; j<this.draw.matrice[0].length; j++){
                Position posij=new Position(i, j);
                Point pij=new Point(0.0,0.0);
                pij.convertPosEnPoint(posij);
                if(centre.distance(pij)<=rayon){
                    this.draw.matrice[i][j]=this.signe;
                }
            }
        }
    }

    public static void main(String[] args) {
        Position pos=new Position(15,15);
        Cercle r=new Cercle(31,31,'*',pos);
        r.fill(5);
        r.tString();
    }
}
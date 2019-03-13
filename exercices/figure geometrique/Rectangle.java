public class Rectangle extends Quadrilatere{
    public Rectangle(int line,int colum,char car,Position pos){
        super(line,colum,car,pos);
    }
    
    public void fill(Double L, Double l, Angle alpha){//dimension(L,l) et angle d'inclinaison(alpha)
        Point centre=new Point(0.0,0.0);
        centre.convertPosEnPoint(this.pos);
        for(int i=0; i<this.draw.matrice.length; i++){
            for(int j=0; j<this.draw.matrice[0].length; j++){
                Position posij=new Position(i, j);
                Point pij=new Point(0.0,0.0);
                pij.posPointRepereBase(posij,centre,alpha);
                if((pij.x<=L/2 && pij.x>=-L/2) && (pij.y<=l/2 && pij.y>=-l/2)){
                    this.draw.matrice[i][j]=this.signe;
                }
                else{
                    this.draw.matrice[i][j]=' ';
                }
            }
            this.draw.matrice[pos.i][pos.j]='$';
        }
    }


    

    public static void main(String[] args) {
        Position pos=new Position(10,10);
        Rectangle r=new Rectangle(21,21,'*',pos);
        Angle a=new Angle(Math.PI/4/*90.0001*/, "radian");
        r.fill(16.0, 8.0, a);
        r.tString();
    }
}
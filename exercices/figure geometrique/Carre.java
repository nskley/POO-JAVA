public class Carre extends Rectangle{
    public Carre(int line,int colum,char car,Position pos){
        super(line,colum,car,pos);
    }
    public void fill(Double cote,Angle alpha){
        super.fill(cote, cote, alpha);
    }
    public static void main(String[] args) {
        Position pos=new Position(10,10);
        Carre c=new Carre(21,21,'*',pos);
        Angle a=new Angle(9*Math.PI/4/*45.0*/, "radian");
        c.fill(7.7,a);
        c.tString();
    }
}
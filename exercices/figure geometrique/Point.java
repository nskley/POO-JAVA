public class Point{
    Double x;
    Double y;
    public Point(Double x, Double y){
        this.x=x;
        this.y=y;
    }
    public Double getX(){
        return this.x;
    }
    public Double getY(){
        return this.y;
    }
    /*
    public void round(){
        this.x=Math.round(this.x);
        this.y=Math.round(this.y);
    }
    */
    public void convertPosEnPoint(Position pos){
        this.x=pos.j*1.0;
        this.y=-pos.i*1.0;
    }

    public void changeRepere(Point centre){
        this.x=this.x-centre.x;
        this.y=this.y-centre.y;
    }
    
    public void coordBaseAlpha(Angle alpha){
        alpha.mesPrincipale();
        Double temp=this.x;
        this.x=this.x*Math.cos(alpha.angle)+this.y*Math.sin(alpha.angle);
        this.y=-temp*Math.sin(alpha.angle)+this.y*Math.cos(alpha.angle);
    }

    public void posPointRepereBase(Position pos, Point centre, Angle alpha){
        this.convertPosEnPoint(pos);
        this.changeRepere(centre);
        this.coordBaseAlpha(alpha);
    }

    public double distance(Point p){
        Double x=(this.x-p.x)*(this.x-p.x);
        Double y=(this.y-p.y)*(this.y-p.y);
        return (Math.sqrt(x+y));
    }

    /*public boolean memeSituationQue(Point p, FonctionAffine f){
        if(f.estAuDessus(this)){
            return f.estAuDessus(p);
        }
        if(!f.estAuDessus(this)){
            return (!f.estAuDessus(p));
        }
    }

    /** */
    public static void main(String[] args) {
        Angle a=new Angle(/*Math.PI/4*/45.0, "degre");
        System.out.println(a.angle);
        Point p=new Point(5.0, 0.0);
        System.out.println("("+p.x+","+p.y+")");
        p.coordBaseAlpha(a);
        System.out.println(Math.sin(a.angle));
        System.out.println("("+p.x+","+p.y+")");
    }
    /**/
}
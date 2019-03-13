public class Position{
    int i;
    int j;
    public Position(int i, int j){
        this.i=i;
        this.j=j;
    }
    public int getI(){
        return this.i;
    }
    public int getJ(){
        return this.j;
    }

    public static void main(String[] args) {
        Position pos=new Position(5,6);
        System.out.println("("+pos.i+","+pos.j+")");
    }
}
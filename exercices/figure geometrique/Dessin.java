public class Dessin {
    protected char matrice[][];
    public Dessin(Point a){
        this.matrice=new char[a.x][a.y];
    }

    public char getChar(Point a){
        return this.matrice[a.x][a.y];
    }

    // public char setChar
}
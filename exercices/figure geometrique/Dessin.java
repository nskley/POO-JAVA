public class Dessin {
    protected char matrice[][];
    public Dessin(int line, int colum){
        this.matrice=new char[line][colum];
    }
    // public char setChar
    public void setChar(int x, int y , char car){
        this.matrice[x][y]=car;
    }
    public char getChar(int x, int y){
        return this.matrice[x][y]; 
    }

}
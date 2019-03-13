public class MySortedSet extends MySet {

    //constructeur
    public MySortedSet() {
        super();
    }

    public void add(float x) {
        if (!this.contains(x)) {
            int i = 0;
            while (i < this.size && this.array.get(i) < x) {
                i++;
            }
            if (i < this.size) {
                this.array.add(i, x);
            } else {
                this.array.add(x);
            }
            this.size++;
        }
    }

    public float get(int index) {
        return this.array.get(index);
    }

    //Method valeur absolue
    public float abs(float x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }
    public MySortedSet union(MySortedSet E) {
        MySortedSet E1=new MySortedSet();
        for (int i = 0; i < this.size; i++) {
            E1.add(this.get(i));
        }
        for(int i=0; i<E.size; i++){
            E1.add(E.get(i));
        }
        return E1;
    }

    public MySortedSet intersection(MySortedSet E) {
        MySortedSet E1=new MySortedSet();
        for (int i = 0; i < E.size; i++) {
            if (this.contains(E.get(i))) {
                E1.add(E.get(i));
            }
        }
        return E1;
    }

    public MySortedSet difference(MySortedSet E) {
        MySortedSet E1=new MySortedSet();
        for (int i = 0; i < this.size; i++) {
            if (!E.contains(this.get(i))) {
                E1.add(this.get(i));
            }
        }
        return E1;
    }

    public boolean subset(MySortedSet sub) {
        return this.intersection(sub) == sub;
    }

    public float nearest(float x) {
        int moitie = (int) (this.size / 2);
        int a = 0;
        int b = this.size - 1;
        if (super.contains(x)){
            return x;
        }
        else{
            while (abs((float)b - (float)a) != 1) {
                if (this.get(moitie)>x) {
                    b = moitie;
                    moitie = (int) ((a + moitie) / 2);
                } 
                else {
                    a = moitie;
                    moitie = (int) ((b + moitie) / 2);
                }
            }
    
            if (abs(this.get(a) - x) < abs(this.get(b) - x)) {
                    b = a;
            }
            return this.get(b);
        }
        }
        

    public static void main(String args[]) {
        MySortedSet a1, a2;
        a1 = new MySortedSet();
        for (float i = 0; i < 10; i += 2) {
            a1.add(i + 01);
        }
        a2 = new MySortedSet();
        for (float i = 0; i < 10; i ++) {
            a2.add(i + 04);
        }
        System.out.println("starting...");
        System.out.println("");
        System.out.println("a1 = "+a1);
        System.out.println("a1 is empty ? --> "+a1.isEmpty());
        System.out.println("removing 9 to a1");
        a1.remove(9);
        System.out.println("a1 become  "+a1);
        System.out.println("adding 6 on a1");
        a1.add(6);
        System.out.println("a1 become  "+a1);
        System.out.println("now we have ");
        System.out.println("a1 = "+a1);
        System.out.println("a2 = "+a2);
        System.out.println("a1=a2 ? --> "+a1.equals(a2));
        System.out.println("a1-union-a2 = " + a1.union(a2));
        System.out.println("a1-inter-a2 = " + a1.intersection(a2));
        System.out.println("a1\\a2 = " + a1.difference(a2)+"  this is the resulte of the deference between a1 and a2");
        System.out.println("a1 is a subset of a2 ? --> " + a1.subset(a2));
        float x=5.9f;
        System.out.println("the nearest element of a1 to "+x+" is "+a1.nearest(x));
        System.out.println("...");
        System.out.println("test ends ^^");
    }
}
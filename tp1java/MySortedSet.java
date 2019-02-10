import java.util.*;

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

    public MySortedSet union(MySortedSet E) {
        for (int i = 0; i < this.size; i++) {
            E.add(this.get(i));
        }
        return E;
    }

    public MySortedSet intersection(MySortedSet E) {
        for (int i = 0; i < this.size; i++) {
            if (!E.contains(this.get(i))) {
                E.remove(this.get(i));
            }
        }
        return E;
    }

    public MySortedSet difference(MySortedSet E) {
        for (int i = 0; i < this.size; i++) {
            if (E.contains(this.get(i))) {
                this.add(this.get(i));
            }
        }
        return this;
    }

    public boolean subset(MySortedSet sub) {
        return this.intersection(sub) == sub;
    }

    //Method valeur absolue
    public float abs(float x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    public float nearest(float x) {
        int moitie = (int) (this.size / 2);
        int a = 0;
        int b = this.size - 1;
        while (abs(b - a) != 1) {
            if (abs(this.get(a) - x) <= abs(this.get(b) - x)) {
                b = moitie;
                moitie = (int) ((a + moitie) / 2);
            } else {
                a = moitie;
                moitie = (int) ((b + moitie) / 2);
            }
            if (abs(this.get(a) - x) <= abs(this.get(b) - x)) {
                b = a;
            }
        }
        return b;
    }

    public static void main(String args[]) {
        MySortedSet a1, a2;
        a1 = new MySortedSet();
        for (float i = 0; i < 10; i += 2) {
            a1.add(i + 01);
        }
        a2 = new MySortedSet();
        for (float i = 0; i < 10; i += 2) {
            a2.add(i + 01);
        }
        //test d'egalité
        System.out.println(a1.equals(a2));
        System.out.println(a1);
        a1.remove(9);
        System.out.println(a1);
        a1.add(6);
        System.out.println(a1.union(a2));
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1.isEmpty());
        System.out.println(a1.equals(a2));
        a1.add(6);
    }
}
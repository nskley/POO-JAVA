public class FileChainee<E> implements IFileNonBornee<E>{
    private class Cell {
		protected E valeur;
		protected Cell suivant;
		public Cell(E e) {
			this.valeur = e;
			this.suivant = null;
		}
    }
    protected Cell prem_cellule;
	protected Cell der_cellule;
	protected int size;
    //construteur
	public FileChainee(E cell) {
		this.prem_cellule = null;
		this.der_cellule = null;
		this.size = 0;
    }
    
    //methodes
	public boolean isEmpty() {
		return this.size == 0;
	}
	public int size() {
		return this.size;
	}
	public E get() throws Exception {
		if (this.isEmpty()) {
			return null;//throw new Exception("Empty linked queue");
        }
        else{
            return this.prem_cellule.valeur;
        }
	}
	public void remove() throws Exception {
		if (this.isEmpty()) {
			return;//throw new Exception("Empty linked queue");
		}
		System.out.println("Removed item is : " + this.get());
		if(this.size == 1) {
			this.prem_cellule = null;
			this.der_cellule = null;
		} else {
			this.prem_cellule = this.prem_cellule.suivant;
		}
		this.size--;
	}
	public void add(E e) {
		Cell c = new Cell(e);
		System.out.println("Added item is : " + e);
		if (this.isEmpty()) {
			this.prem_cellule = c;
			this.der_cellule = c;
		} else {
			this.der_cellule.suivant = c;
			this.der_cellule = c;
		}
		this.size++;
	}
	
	public String toString() {
		Cell c;
		String s = " [";

		if (this.isEmpty()) {
			s += "]";
			return s;
		}
		c = this.prem_cellule;
		for (int i = 0; i < this.size(); i++) {
			s += c.valeur + " ,";
			c = c.suivant;
		}
		s = s.substring(0, s.length() - 2) + "]";
		return s;
	}
	
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		if (!(obj instanceof FileChainee)) {
			return false;
		}
		
		FileChainee<E> q = (FileChainee<E>) obj;
		Cell c1 = this.prem_cellule;
		Cell c2 = q.prem_cellule;
		if (this.size != q.size) {
			return false;
		}
		
		while(c1.suivant != null) {
			if (c1.valeur != c2.valeur) {
				return false;
			}
			c1 = c1.suivant;
			c2 = c2.suivant;
		}
		
		return true;
	}
	
	public static void main(String args[]) throws Exception {
		FileChainee<Integer> q1 = new FileChainee<Integer>(2);
		FileChainee<Integer> q2 = new FileChainee<Integer>(3);
		
		System.out.println(q1.isEmpty());
		System.out.println(q1);
		System.out.println(q1.get());
		q1.add(8);
		q1.add(13);
		q1.add(56);
		System.out.println(q1);
		System.out.println(q1.isEmpty());
		System.out.println(q1.size());
		System.out.println(q1.get());
		q1.remove();
		System.out.println(q1);
		System.out.println(q1.isEmpty());
		System.out.println(q1.size());
		System.out.println(q1.get());	
		System.out.println(q2.isEmpty());
		System.out.println(q2.size());
		System.out.println(q2);
		q2.add(3);
		System.out.println(q1);
		System.out.println(q2);
		System.out.println(q1.equals(q2));
		q2.remove();
		q2.add(13);
		q2.add(5);
		System.out.println(q1);
		System.out.println(q2);
		System.out.println(q1.equals(q2));
	}
}

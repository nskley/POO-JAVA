public class MaPileEntiers {
	protected int pile[];
	protected int size;
	protected int capacity;
	// Constructor
	public  MaPileEntiers(int tailleMax) {
		this.pile=new int [tailleMax];
		this.size=0;
		this.capacity=tailleMax;
	}
	public MaPileEntiers( MaPileEntiers p) {
		this.pile=new int[p.capacity];
		this.capacity=p.capacity;			
	}
	//Methods
	public boolean isEmpty() {
		return this.size==0;
	}
	
	public int getSize() {
		return size;
	}
	public int getCapacity() {
		return capacity;
	}
	
	//recopier les val de p dans this
	public String toString() {
		String s="[";
		if (this.isEmpty()) {
			return s+"]";
		}
		for(int i=0; i<this.size; i++) {
			s=s+this.pile[i]+",";
		}
        s=s.substring(0,s.length()-1)+"]";
        return s;
	}
	//ajout d'un element
	public void add(int x){
		this.pile[this.size]=x;
		this.size++;
	}
	//suppression d'un element
	public void remove(int x){
		for(int i=0; i<this.size; i++){
			if(this.pile[i]==x){
				for(int j=i; j<this.size-1; j++){
					this.pile[j]=this.pile[j+1];
				}
				this.size--;
			}
		}
	}

	//test égalité de deux piles
	public boolean equals(Object o) {
		MaPileEntiers p=(MaPileEntiers)o;
		if(this.size!=p.size) {
			return false;
		}
	int index=0;
	boolean equals=true;
	while(index<this.size && equals){
		if(this.pile[index]==p.pile[index]) {
			index++;
		}
		else {
			equals=false;
		}
	}
	return equals;
	}
	
	//fonction main pour executer
	public static void main(String args[]) {
		MaPileEntiers p1;
		p1=new MaPileEntiers(10);
		for(int i=0; i<10; i++){
			p1.add(i);
		}
		System.out.println(p1);
		
	}
}
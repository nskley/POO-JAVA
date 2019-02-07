
public class FileCirculaire<E> implements IFileBornee<E>{
    protected E file[];
    protected int size;
    protected int capacity;
    protected int prem;
    protected int der;
    public FileCirculaire(int tmax){
        this.file=(E[])(new Object[tmax]);
        this.size=0;
        this.capacity=tmax;
        this.prem=0;
        this.der=0;
    }

    public FileCirculaire( FileCirculaire<E> f) {
		this.file=(E[])(new Object[f.capacity]);
		this.capacity=f.capacity;
        //boucle
	}

	//ajout d'un element
	public void add(E x){
		if(!this.IsFull()) {
			this.file[this.der]=x;
			this.size++;
			this.der=(this.der+1)%this.capacity;
		}
		else{
			System.out.println("file pleine");
		}
	}
	//suppression d'un element
	public void remove(){
		if(!this.IsEmpty()){
			this.prem=(prem+1)%this.capacity;
			this.size--;
		}
		else{
			System.out.println("file vide");
		}
	}

    public boolean IsEmpty(){
        return this.size==0;
    }

    public boolean IsFull(){
        return this.size==this.capacity;
    }

    public int getSize() {
		return this.size;
	}
	public int getCapacity() {
		return this.capacity;
	}
	
	public int getPrem(){
		return this.prem;
	}

	public int getDer(){
		return this.der;
	}
    
	//recopier les val de p dans this
	public String toString() {
		String s="[";
		if (this.IsEmpty()) {
			return s+"]";
		}
		for(int i=0; i<this.size; i++){
			s=s+this.file[(i+this.prem)%this.capacity]+",";
		}
        s=s.substring(0,s.length()-1)+"]";
        return s;
	}


	//test égalité de deux piles
	public boolean equals(Object o) {
		FileCirculaire<E> f=(FileCirculaire<E>)o;
		if(this.size!=f.size) {
			return false;
		}		
		int index=0;
		boolean egal=true;
		while(index<this.size && egal){
			egal=(this.file[(index+this.prem)%this.capacity]==f.file[(index+f.prem)%f.capacity]);
			index++;
		}
		return egal;
	}
	//fonction main pour executer
	public static void main(String args[]) {
		FileCirculaire<Integer> f1,f2;
		f1=new FileCirculaire(10);
		f2=new FileCirculaire(10);
		for(int i=0; i<6; i++){
			f1.add(i);
		}
		for(int i=0; i<5; i++){
			f2.add(i);
		}
		f1.remove();
		f1.add(0);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f1.equals(f2));
	}
}
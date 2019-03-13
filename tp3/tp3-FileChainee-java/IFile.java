public interface IFile<E> {
	
	public boolean isEmpty();
	public int size();
	public void add(E e);
	public E get() throws Exception;
	public void remove() throws Exception; 
	
}

public interface IFile<E> {
    public abstract void add(E e);
    public abstract void remove();
    public abstract boolean IsEmpty();
    public abstract int getSize();
    public abstract int getPrem();
    public abstract int getDer();
}
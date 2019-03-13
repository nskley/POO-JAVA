import java.util.*;
public interface Trieur<T>{
    public int sort();
    public ArrayList<T> getData();
    public void setData(ArrayList<T> list);
}
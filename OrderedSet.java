import java.util.Collection;

interface OrderedSet<T>
{
	public boolean add(T obj);

	public void add(int i, T obj);

	public T set(int i, T obj);

	public boolean addAll(Collection collection);

	public boolean addAll(int i, Collection collection);
}
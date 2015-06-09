import java.util.Collection;
import java.util.Set;
import java.util.List;


interface OrderedSet<T> extends List<T>, Set<T>
{
	// Appends the specified element t to this set if this set does not contain an element other corresponding to other.equals(t).
	public boolean add(T obj);

	// Inserts the specified element t at the specified position in this set.
	public void add(int i, T obj);

	// Replaces the element at the specified position in this set with the specified element t 
	// 		if the set does not contain an element other corresponding to other.equals(t).
	public T set(int i, T obj);

	// Throws an UnsupportedOperationException upon invocation because this method is not supported.
	public boolean addAll(Collection<? extends T> collection);

	// Throws an UnsupportedOperationException upon invocation because this method is not supported.
	public boolean addAll(int i, Collection<? extends T> collection);
}
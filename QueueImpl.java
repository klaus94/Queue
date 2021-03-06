import java.util.*;

public class QueueImpl<T> implements Queue<T>
{
	private List<T> myObjects;

	public QueueImpl (boolean withDublicates) {
		if (withDublicates) {
			myObjects = new LinkedList<T>();
		} else {
			myObjects = new OrderedSetImpl<T>();
		}
	}

	public boolean add(T o)
	{
		if (o == null) {
			throw new NullPointerException("Obj darf nicht null sein.");
		} else {
			return myObjects.add(o);
		}
	}

	public T remove()
	{
		if (isEmpty()) {
			return null;
		} else {
			return myObjects.remove(0);
		}
	}

	public T first()
	{
		if (isEmpty()) {
			return null;
		} else {
			return myObjects.get(0);
		}
	}

	public boolean isEmpty()
	{
		return myObjects.isEmpty();
	}

	public int size()
	{
		return myObjects.size();
	}
	
}
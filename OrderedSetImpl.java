import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
//import java.util.Set;

public class OrderedSetImpl<T> extends ArrayList<T> implements OrderedSet<T>
{
	private List<T> orderedSet; 

	// returns true if set contains obj
	private boolean setContains(T obj)
	{
		for (T elem: orderedSet)
		{
			if (elem.equals(obj))
				return true;
		}

		return false;
	}

	// IMPLEMENTATION OF ORDEREDSET:
	public boolean add(T obj)
	{

		if (obj == null)
		{
			throw new NullPointerException("Object should not be null!");
		}

		if (!setContains(obj))
		{
			orderedSet.add(obj);
			return true;
		}
		else 
		{
			return false;	
		}

	}

	public void add(int i, T obj)
	{

		if (obj == null)
		{
			throw new NullPointerException("Object should not be null!");
		}


		if (!setContains(obj))
		{
			orderedSet.add(i, obj);
		}

	}

	// replaces the object at the index i with obj
	public T set(int i, T obj)
	{
		if (obj == null)
		{
			throw new NullPointerException("Object should not be null!");
		}

		if (i >= orderedSet.size())
		{
			throw new IndexOutOfBoundsException("index was too big");
		}

		if (!setContains(obj))
		{
			T oldElem = orderedSet.get(i);
			orderedSet.set(i, obj);

			return oldElem;
		}
		else
			return null;			// set contains obj already

	}

	public boolean addAll(Collection<? extends T> collection)
	{
		throw new UnsupportedOperationException("not supported operation");
	}

	public boolean addAll(int i, Collection<? extends T> collection)
	{
		throw new UnsupportedOperationException("not supported operation");
	}


	// OWN METHODS:
	public OrderedSetImpl()
	{
		orderedSet = new ArrayList<T>();
	}

	public OrderedSetImpl(int initialCapacity)
	{
		// TODO:
		// how to fill orderedSet just with a given initialCapacity???
		// adding this amount of null-objects cannot be right...
	}


}
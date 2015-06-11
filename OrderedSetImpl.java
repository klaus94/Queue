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


	// CONSTRUCTORS:
	public OrderedSetImpl()
	{
		orderedSet = new ArrayList<T>();
	}

	public OrderedSetImpl(int initialCapacity)
	{
		if (initialCapacity < 0)
		{
			throw new IllegalArgumentException("initial capacity should be non-negative");
		}
		orderedSet = new ArrayList<T>(initialCapacity);
	}


	// IMPLEMENTATION OF ORDEREDSET:
	public boolean add(T obj) throws NullPointerException
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

	public void add(int i, T obj) throws NullPointerException
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
	public T set(int i, T obj) throws NullPointerException, IndexOutOfBoundsException
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
			T oldElem = get(i);
			orderedSet.set(i, obj);

			return oldElem;
		}
		else
			return null;			// set contains obj already

	}

	public boolean addAll(Collection<? extends T> collection) throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException("not supported operation");
	}

	public boolean addAll(int i, Collection<? extends T> collection) throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException("not supported operation");
	}


	// dont know, why necessary. but works
	public int size()
	{
		return orderedSet.size();
	}

	public T get(int i)
	{
		if (i >= size())
		{
			throw new IndexOutOfBoundsException("not possible");
		}
		return orderedSet.get(i);
	}

	public boolean contains(Object obj)
	{
		for (T elem: orderedSet)
		{
			if (elem.equals(obj))
			{
				return true;
			}
		}
		return false;
	}

}
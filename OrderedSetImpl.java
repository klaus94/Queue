import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
//import java.util.Set;

public class OrderedSetImpl<T> extends ArrayList<T> implements OrderedSet<T>
{

	// CONSTRUCTORS:
	public OrderedSetImpl()
	{
		super();
	}

	public OrderedSetImpl(int initialCapacity)
	{
		super(initialCapacity);
		if (initialCapacity < 0)
		{
			throw new IllegalArgumentException("initial capacity should be non-negative");
		}
		
	}


	// IMPLEMENTATION OF ORDEREDSET:
	public boolean add(T obj) throws NullPointerException
	{

		if (obj == null)
		{
			throw new NullPointerException("Object should not be null!");
		}

		if (!super.contains(obj))
		{
			super.add(obj);
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


		if (!super.contains(obj))
		{
			super.add(i, obj);
		}

	}

	// replaces the object at the index i with obj
	public T set(int i, T obj) throws NullPointerException, IndexOutOfBoundsException
	{
		if (obj == null)
		{
			throw new NullPointerException("Object should not be null!");
		}

		if (i >= super.size())
		{
			throw new IndexOutOfBoundsException("index was too big");
		}

		if (!super.contains(obj))
		{
			T oldElem = super.get(i);
			super.set(i, obj);

			return oldElem;
		}
		else
			return null;			// set already contains obj 

	}

	public boolean addAll(Collection<? extends T> collection) throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException("not supported operation");
	}

	public boolean addAll(int i, Collection<? extends T> collection) throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException("not supported operation");
	}

}
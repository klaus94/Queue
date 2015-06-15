interface Queue<T>
{
	public boolean add(T o);

	public T remove();

	public T first();

	public boolean isEmpty();

	public int size();
}
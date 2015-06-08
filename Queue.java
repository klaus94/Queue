interface Queue<T>
{
	public boolean add(T o);

	public T remove();

	public T front();

	public boolean isEmpty();

	public int size();
}
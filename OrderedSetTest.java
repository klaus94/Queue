public class OrderedSetTest
{
	public static void main(String[] args)
	{
		OrderedSet<String> myOrderedSet = new OrderedSetImpl<String>(2);
		String el0 = "ele0";
		String el1 = "ele1";


		System.out.println("add erfolgreich: " + myOrderedSet.add(el0));
		System.out.println("add erfolgreich: " + myOrderedSet.add(el1));

		System.out.println("size(): " + myOrderedSet.size());

		System.out.println("get(0): " + myOrderedSet.get(0));

		System.out.println("set(0, el1): " + myOrderedSet.set(0, el1));			// already in set --> should return null

		System.out.println("contains(el0): " + myOrderedSet.contains(el0));

	}
}
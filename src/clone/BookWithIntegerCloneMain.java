package clone;

public class BookWithIntegerCloneMain {
	public static void main(String[]args) throws CloneNotSupportedException{
		String[] authors = {"gimmy", "ridimmi"};
		BookWithInteger book = new BookWithInteger();
		book.authors =authors;
		book.costo=2;
		BookWithInteger clone=(BookWithInteger)book.clone();
		System.out.println("stampo il clone");
		System.out.println(clone.costo);
		for (String auth:clone.authors)
			System.out.println(auth);

		System.out.println("stampo l'originale");
		System.out.println(book.costo);
		for (String auth:book.authors)
			System.out.println(auth);
		
		book.costo=4;
		book.authors[0]="drake";
		
		System.out.println("stampo il clone");
		System.out.println(clone.costo);
		for (String auth:clone.authors)
			System.out.println(auth);

		System.out.println("stampo l'originale");
		System.out.println(book.costo);
		for (String auth:book.authors)
			System.out.println(auth);
	}
}

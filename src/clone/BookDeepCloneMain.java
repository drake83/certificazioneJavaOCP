package clone;

public class BookDeepCloneMain {
	public static void main(String[]args) throws CloneNotSupportedException{
		String[] authors = {"gimmy", "ridimmi"};
		BookDeepClone book = new BookDeepClone();
		book.authors =authors;
		book.title="OCP";
		BookDeepClone clone=(BookDeepClone)book.clone();
		System.out.println("stampo il clone");
		System.out.println(clone.title);
		for (String auth:clone.authors)
			System.out.println(auth);

		System.out.println("stampo l'originale");
		System.out.println(book.title);
		for (String auth:book.authors)
			System.out.println(auth);
		
		book.title="no ci ho ripensato";
		book.authors[0]="drake";
		System.out.println("DOPO MODIFICA");
		System.out.println("stampo il clone");
		System.out.println(clone.title);
		for (String auth:clone.authors)
			System.out.println(auth);

		System.out.println("stampo l'originale");
		System.out.println(book.title);
		for (String auth:book.authors)
			System.out.println(auth);
	}
}

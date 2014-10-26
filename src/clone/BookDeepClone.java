package clone;

public class BookDeepClone implements Cloneable {

	String title;
	String[] authors;
	@Override
	public Object clone() throws CloneNotSupportedException{
		BookDeepClone b = (BookDeepClone) super.clone();
		b.authors = (String[]) authors.clone();
		return b;
	}
}

package clone;

public class Book implements Cloneable {

	String title;
	String[] authors;
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();		
	}
}

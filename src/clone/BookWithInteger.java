package clone;

public class BookWithInteger implements Cloneable {

	Integer costo;
	String[] authors;
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();		
	}
}

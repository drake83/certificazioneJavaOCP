package clone;

public class BookClone {
	public static void main(String[]args) throws CloneNotSupportedException{
		Book book = new Book();
		book.title ="zica";
		Book clone=(Book)book.clone();
		System.out.println(clone);
	}
}

package enumeration;

public enum Enumeration {

	VANILLA("white"),
	CHOCOLATE("brown"),
	BLACK("black"){
		public String toString(){
			return "il suo cazzo di colore � black!";
		}
	};
	
	String color;
	
	Enumeration(String color){
		this.color=color;
	}
	
	public String toString(){
		return this.color;
	}
	
	public static void main(String... args){
		/*
		 * Di base una ENUM stamper� VANILLA E CHOCOLATE perch� la classe ENUM ha come toString il name della enum quindi rispettivamente VANILLA e CHOCOLATE.
		 * Se, come ho fato io, overrido il metodo toString() facendogli stampare this.color allora ovviamente stamper� il valore della variaible color!
		 * Inoltre � possibile overridare il metodo i metodo NON final direttamente sulla costante che si vuole customizzare.
		 * 
		 * 
		 */
		
		System.out.println(Enumeration.VANILLA);
		System.out.println(Enumeration.CHOCOLATE);
		System.out.println(Enumeration.BLACK);
	}
	
}

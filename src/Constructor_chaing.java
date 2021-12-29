
 class A{
	public A(){
		System.out.println("I am constructor of class A");
	}
}
 
 class B extends A{
		public B(){
			this("Arvind");
			System.out.println("I am constructor of class B");
		}
		
		public B(String st){
			System.out.println("I am overloaded constructor of class B"+" :"+st);
		}
	}
public class Constructor_chaing {

	public static void main(String[] args) {

        B b = new B();

	}

}

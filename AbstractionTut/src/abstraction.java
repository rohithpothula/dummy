abstract class dog{
	public abstract void poop();
	public abstract void bark();
}
class tom extends dog{

	@Override
	public void poop() {
		System.out.println("POOP");
		
	}

//	@Override
	public void bark() {
		System.out.println("BARK");
		
	}
//	public abstract void bark();
	
}
class pup extends dog{

//	@Override
	public void poop() {
		System.out.println("POOP");
		
	}
//	public abstract void poop();

	@Override
	public void bark() {
		System.out.println("BARK");
		
	}
	
}
public class abstraction {

	public static void main(String[] args) {
		
		pup p = new pup();
		p.bark();
		p.poop();
		
		
		tom t = new tom();
		t.bark();
		t.poop();

	}

}

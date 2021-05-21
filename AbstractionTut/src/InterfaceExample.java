interface waterbottle
{
	String color = "BLUE";
	public abstract void filleup();
	public abstract void pourout();
	}
abstract class tupperware implements waterbottle{
//	this can happen but an interface cannot implements another interface
}
class topperware implements waterbottle
{

	@Override
	public void filleup() {
		System.out.println("FILLUP");
	}
	@Override
	public void pourout() {
		System.out.println("POUROUT");
	}
}
interface xyz extends waterbottle
{
	}
public class InterfaceExample {

	public static void main(String[] args) {
		System.out.println(waterbottle.color);
		topperware t = new topperware();
		t.filleup();
		t.pourout();
	}

}

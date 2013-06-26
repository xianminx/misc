public class ChangeThis{
	public int a;
	public ChangeThis(int _i){
		a = _i;
	}
	public void change(){
		this = new ChangeThis(10);
	}

	public int get(){
		return a;
	}
	public static void main(String[] args){
		ChangeThis instance = new ChangeThis(1);
		System.out.println("before change: " +instance.get());
		instance.change();

		System.out.println("after change: " +instance.get());
	}
}

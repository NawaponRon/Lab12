
public class Inheritance {

	public static void main(String[] args) {
	
		Ant ant = new Ant();
		Cat cat = new Cat();
		ant.walk();
		cat.walk();
		cat.eat();
		ant.eat();

	}

}
abstract class Activity{
	abstract void walk();
	abstract void run();
	abstract void eat(); 
	
}

class Ant extends Activity {
	@Override
	void walk(){
		System.out.println("Ant walks on the floor");
	}
	
	@Override
	void run(){
		System.out.println("Ant runs .......");
	}
	
	@Override
	void eat(){
		System.out.println("Ant eat sugar");
	}
	
}
class Cat extends Activity{
	@Override
	void walk(){
		System.out.println("Cat walks on the floor");
	}
	
	@Override
	void run(){
		System.out.println("Cat runs .......");
	}
	
	@Override
	void eat(){
		System.out.println("Cat eat fish");
	}
	
}
	


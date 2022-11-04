package ivanbasic;

public class java_11_08_110_InstanceInitialization implements Lesson {

	public void main() {
		System.out.println("Creating new InstanceC extends InstanceB extends InstanceA" );
		InstanceC ic= new InstanceC();
		
	}

}
class InstanceA   {
	public InstanceA() {
		System.out.println("Lesson InstanceInitialization, Constructor, InstanceA" );
	}
}
class InstanceB extends InstanceA   {
	public InstanceB() {
		System.out.println("Lesson InstanceInitialization, Constructor, InstanceB" );
	}
}
class InstanceC extends InstanceB   {
	public InstanceC() {
		System.out.println("Lesson InstanceInitialization, Constructor, InstanceC" );
	}
}
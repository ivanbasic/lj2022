package ivanbasic;

public class java_11_08_026_NoDefaultConstructor implements Lesson {

 
	public void main() {
 

	}

}
class ClassA1 {}
class ClassB1 extends ClassA1 {}

class ClassA {
	ClassA(String string) {}
}

//There is no default constructor available in 'ivanbasic.ClassA'
//class ClassB extends ClassA {}
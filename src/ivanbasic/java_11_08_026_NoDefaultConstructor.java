package ivanbasic;

public class java_11_08_026_NoDefaultConstructor implements Lesson {

 
	public void main() {
 

	}

}


//example 1: Ok
class ClassA1 {}
class ClassB1 extends ClassA1 {}

//example 2: Error
class ClassA2 {
	ClassA2(String string) {}
}
//There is no default constructor available in 'ivanbasic.ClassA2'
//class ClassB2 extends ClassA2 {}

//example 3: Ok
class ClassA3 {
	ClassA3() {};
}
class ClassB3 extends ClassA3 {}
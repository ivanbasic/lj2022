package ivanbasic;

public class java_11_08_035_SuperCons implements Lesson {

    public void main() {

        Second sec = new Second();

        System.out.println("");
        Second sec2 = new Second(1);
    }


}

class First {
    First() {
        System.out.println("Lesson SuperCons, first()");
    }

    First(int i) {
        System.out.println("first(int)");
    }
}

class Second extends First {
    public Second() {
        //super();  //commented or not, it's the same.
        System.out.println("Lesson SuperCons, second()");
    }

    public Second(int i) {
        System.out.println("second(int) calls super()=first() without arguments! ");
    }

}
package ivanbasic;

public class java_11_08_120_ReviewingConstructorRules implements Lesson {
    public void main() {

        new ReviewingSecond(); System.out.println();
        new ReviewingSecond(1); System.out.println();
        new ReviewingSecond("X"); System.out.println();
        new ReviewingSecond(true); System.out.println();

    }
}
class ReviewingFirst {
    ReviewingFirst() {
        System.out.println("ReviewingFirst()");
    }
    ReviewingFirst(Integer integer) {
        System.out.println("ReviewingFirst(Integer)");
    }

}

class ReviewingSecond extends ReviewingFirst  {
    ReviewingSecond() {
        System.out.println("ReviewingSecond()");
    }


    ReviewingSecond(Integer integer) {
        System.out.println("ReviewingSecond(Integer)");
    }

    ReviewingSecond(String string) {
        this();
        System.out.println("ReviewingSecond(String)");
    }

    ReviewingSecond(Boolean bollean) {
        super(1);
        System.out.println("ReviewingSecond(bollean)");
    }

}


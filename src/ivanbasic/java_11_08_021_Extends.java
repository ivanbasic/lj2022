package ivanbasic;

public class java_11_08_021_Extends implements Lesson {
    public void main() {
        Chicken chicken = new Chicken();
        chicken.test();
    }
}

class Egg {
    String field1 = "Egg field1";
    String field2 = "Egg field2";
    String field3 = "Egg field3";

    String method1() { return "Egg method1";    }
    String method2() { return "Egg method2";    }
}

class Chicken extends Egg {
    // FIELDS: everything is allowed:
    // same name and type
    String field1 = "Chicken field1";
    String field2 = "Chicken field2";
    // same name and different type.
    int field3 = 3;

    // METHODS: not everything:
    //'method1()' in 'ivanbasic.Chicken' clashes with 'method1()' in 'ivanbasic.Egg';
    // attempting to use incompatible return type
    // boolean method1() { return true;}

    String method1() { return "Chicken method1";    }
    String method2() { return "Chicken method2";    }

    void test() {
        System.out.println("this:");
        System.out.println(this.field1);
        System.out.println(this.field2);
        System.out.println(this.field3);
        System.out.println(this.method1());
        System.out.println(this.method2());

        System.out.println("");
        System.out.println("super:");

        System.out.println(super.field1);
        System.out.println(super.field2);
        System.out.println(super.field3);
        System.out.println(super.method1());
        System.out.println(super.method2());
    }


}

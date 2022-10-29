package ivanbasic;

public class java_11_02_030_Defaults implements Lesson {
    static String classString;
    static int classInt;

    String instanceString;
    int instanceInt;

    boolean instanceBoolean;
    float instanceFloat;
    double instanceDouble;

    public void main() {
        System.out.println("classString=" + classString);
        System.out.println("classInt=" + classInt);

        System.out.println("instanceString=" + instanceString);
        System.out.println("instanceInt=" + instanceInt);
        System.out.println("instanceBoolean=" + instanceBoolean);
        System.out.println("instanceFloat=" + instanceFloat);
        System.out.println("instanceDouble=" + instanceDouble);


        String localString;
        int localInt;
        // Variable 'localString' might not have been initialized
        //System.out.println( localString);
        //System.out.println( localInt);

    }
}

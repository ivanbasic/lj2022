package ivanbasic;

import java.util.List;

public class aMain {
    final static int CHOOSE_LESSON_ORDINAL = 0; // Zero for all

    public static void main(final String[] args) {
        callAllUsingReflection(CHOOSE_LESSON_ORDINAL);
    }

    public static void callAllUsingReflection(final int demoOrdinal) {
        System.out.println("JAVA LESSONS");
        final List<String> classes = new AccessingAllClassesInPackage().getClassNamesSorted("ivanbasic");
        int lessonCounter = 1;

        for (final String className : classes) {
            try {
                Object objLesson = Class.forName(className).getConstructor().newInstance();
                Lesson lesson = (Lesson) objLesson;
                if (demoOrdinal == 0 || demoOrdinal == lessonCounter) {
                    lesson.HeaderAndMain(lessonCounter);
                }
                lessonCounter++;
            } catch (final Exception e) {
                // the current class is not the instance of demo interface
            }
        }
    }

}

interface Lesson {
    void main();

    default void HeaderAndMain(int lessonCounter) {
        String className = this.getClass().getName().replace("ivanbasic.dp_", "").replace("_", ".");

        System.out.println("");
        System.out.println("===============================================================");
        System.out.println("Lesson#" + lessonCounter + " " + className);
        System.out.println("===============================================================");

        this.main();
    }

}

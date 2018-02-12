package core_labels;


@FInterface.ClassPreamble(
        author = "Me",
        date = "Today",
        currentRevision = 1,
        lastModified = "N/A",
        lastModifiedBy = "Me",
        reviewers = {"none"}
)

@FunctionalInterface
public interface FInterface {

    void anyCalc();

    default void doSomeOtherWork() {
        System.out.println("Result of 2*2 is: " + 2 * 2);
    }

    @interface ClassPreamble {
        String author();
        String date();
        int currentRevision() default 1;
        String lastModified() default "N/A";
        String lastModifiedBy() default "N/A";
        // Note use of array
        String[] reviewers();
    }


}

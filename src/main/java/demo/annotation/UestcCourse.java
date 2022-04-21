package demo.annotation;

/**
 * @author yzz
 * @create 2022-04-21 11:25
 */
@CourseInfoAnnotation(name="Java", tag="Computer Language", profile="Write Once, Run Anywhere")
public class UestcCourse {
    @PersonInfoAnnotation(name="Oracle", language={"C/C++", "Java"})
    private String author;

    @CourseInfoAnnotation(name="C++", tag="Computer Language", profile="None of the most difficult programming languages to learn",
    index = 421)
    public void getCourseInfo() {

    }
}

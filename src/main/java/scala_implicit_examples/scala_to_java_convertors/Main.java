package scala_implicit_examples.scala_to_java_convertors;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("scala_implicit_examples.scala_to_java_convertors");
    }
}

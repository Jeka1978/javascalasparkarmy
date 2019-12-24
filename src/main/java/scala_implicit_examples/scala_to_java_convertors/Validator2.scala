package scala_implicit_examples.scala_to_java_convertors

import org.springframework.stereotype.Component

/**
  * @author Evgeny Borisov
  */
@Component
class Validator2 extends Validator {
  override def validate(): Unit = println(2222)
}

package scala_implicit_examples.method_implicit_example

/**
  * @author Evgeny Borisov
  */
object MyImplicitConversionMethods {
  implicit def convertStringToPerson(name: String):Person=Person(name)
}

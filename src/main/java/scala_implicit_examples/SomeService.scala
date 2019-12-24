package scala_implicit_examples

/**
  * @author Evgeny Borisov
  */
object SomeService {

  def printName(implicit name:String): Unit =println(name)

}

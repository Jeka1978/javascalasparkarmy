package scala_demo

/**
  * @author Evgeny Borisov
  */
case class Cow(var hp:Int=12) extends Animal with Serializable with Comparable[Animal]{

  println("I love my antricot")


  override def makeVoice(): Unit = println("muuuuuuu")

  override def compareTo(o: Animal): Int = 2
}

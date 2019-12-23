package scala_demo

/**
  * @author Evgeny Borisov
  */
trait Animal {

  AnimalDirector.amount += 1
  println(123)

  var hp: Int

  def makeVoice(): Unit

  def isAlive: Boolean = hp > 0


}

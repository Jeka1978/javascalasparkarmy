package scala_demo

/**
  * @author Evgeny Borisov
  */
class Wolf(var hp:Int) extends Animal {


  override def makeVoice(): Unit = println("woooooooo")
}

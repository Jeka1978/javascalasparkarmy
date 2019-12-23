package scala_demo

/**
  * @author Evgeny Borisov
  */
object Stam {


  def main(args: Array[String]): Unit = {

    val wolf = new Wolf(hp = 10)
    val cow = Cow()
    wolf.makeVoice()
    cow.makeVoice()
    println(AnimalDirector.amount)
  }

}

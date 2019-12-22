package scala_demo

import com.github.javafaker.Faker

/**
  * @author Evgeny Borisov
  */
object Stam {

  def main(args: Array[String]): Unit = {
    val faker = new Faker()
    val fact = faker.chuckNorris().fact()
    println(fact)
    println("hello scala, winter is coming")
  }

}

package scala_list_games

import scala_demo.Wolf

/**
  * @author Evgeny Borisov
  */
object Main extends App {

  private var list: List[Any] = List(1,2,new Wolf(21))

  println(list)
  private val newList: List[Any] = 2::list
  println(newList)



}

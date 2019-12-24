package scala_quoters

/**
  * @author Evgeny Borisov
  */
class ShakespeareQuoter(val message:String="2 B || ! 2 B") extends Quoter {
  override def sayQuote(): Unit = println(message)
}

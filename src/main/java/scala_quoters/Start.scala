package scala_quoters

/**
  * @author Evgeny Borisov
  */
object Start {
  def main(args: Array[String]): Unit = {
    val quoters = List(RandomQuoter, new ShakespeareQuoter(), MessageQuoter("I love scala, maybe"))
    val aggregator = new QuoterAggregator(quoters)
    aggregator.sayAllQuotes()
  }
}

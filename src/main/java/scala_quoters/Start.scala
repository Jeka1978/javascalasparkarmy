package scala_quoters

/**
  * @author Evgeny Borisov
  */
object Start {
  def main(args: Array[String]): Unit = {
    MessageQuoter("I love scala, maybe")
    new ShakespeareQuoter()
    RandomQuoter
    QuoterAggregator.sayAllQuotes()
  }
}

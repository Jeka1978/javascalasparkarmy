package scala_quoters

import com.github.javafaker.Faker

/**
  * @author Evgeny Borisov
  */
object RandomQuoter extends Quoter {

  private val faker: Faker = new Faker()


  override def sayQuote(): Unit = println(faker.chuckNorris().fact())
}

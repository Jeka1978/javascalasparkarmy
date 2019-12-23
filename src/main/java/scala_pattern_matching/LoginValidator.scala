package scala_pattern_matching



/**
  * @author Evgeny Borisov
  */
object LoginValidator {


  def printViolations(newLogin: Login): Unit = {
    newLogin match {
      case Login("admin", _, _) => println("name can't be admin")
      case Login(_, pass, _) if pass.startsWith("z") => println(s"pass can't start with z and your password is $pass")
      case Login(username, pass, _) if pass == username => println(s"same pass and name: $pass")
      case Login(_, pass, conf) if pass != conf => println(s"pass != conf. $conf $pass")
      case Login(_, pass, _) if pass.forall(_.isDigit) => println(s"your password is only digits $pass")
      case Login(_, _, _) => println("accepted")
      case _ => println("I love you")
    }
  }
}

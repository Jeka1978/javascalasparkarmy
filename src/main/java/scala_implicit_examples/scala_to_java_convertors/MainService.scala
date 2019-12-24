package scala_implicit_examples.scala_to_java_convertors

import javax.annotation.PostConstruct
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

import collection.JavaConverters._
/**
  * @author Evgeny Borisov
  */
@Component
class MainService {

  @Autowired
  var validators:java.util.List[Validator]=null


  @PostConstruct
  def printAllValidations():Unit={
    validators.asScala.foreach(_.validate())


  }

}

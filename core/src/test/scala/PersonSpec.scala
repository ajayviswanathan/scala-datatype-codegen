import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import org.scalatest.FlatSpec

/**
  * Created by ajay on 16/02/17
  */
class PersonSpec extends FlatSpec {

  val mapper = new ObjectMapper().registerModule(DefaultScalaModule)

  "PersonSpec" should "parse sample json input" in {
    val inputStream = getClass.getResourceAsStream("/person.json")
    val person = mapper.readValue(inputStream, classOf[io.github.ajatix.Person])
    assert(person.name == "Barney Stinson")
    assert(person.age == 40)
  }

}

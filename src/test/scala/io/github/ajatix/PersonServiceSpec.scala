package io.github.ajatix

import org.scalamock.scalatest.MockFactory
import org.scalatest.FlatSpec

/**
  * Created by ajay on 16/02/17
  */
class PersonServiceSpec extends FlatSpec with MockFactory {

  val person = Person(1, "Ted Mosby", 36)

  "PersonServiceSpec" should "add new person to database" in {
    val personDatabaseMock = mock[PersonDatabase]
    val personDatabaseStub = stub[PersonDatabase]

    // expectation
    personDatabaseMock.addPerson _ expects person

    // configure stubs
    personDatabaseStub.getPersonById _ when 1 returns person

    // test system
    personDatabaseMock.addPerson(person)
    assert(personDatabaseStub.getPersonById(1) == person)
  }

}

/**
 * This code is generated using sbt-datatype.
 */

// DO NOT EDIT MANUALLY
package io.github.ajatix
final class Person(
  val id: io.github.ajatix.Globals.PersonId,
  val name: String,
  val age: Int) extends Serializable {
  
  
  
  override def equals(o: Any): Boolean = o match {
    case x: Person => (this.id == x.id) && (this.name == x.name) && (this.age == x.age)
    case _ => false
  }
  override def hashCode: Int = {
    37 * (37 * (37 * (17 + id.##) + name.##) + age.##)
  }
  override def toString: String = {
    "Person(" + id + ", " + name + ", " + age + ")"
  }
  private[this] def copy(id: io.github.ajatix.Globals.PersonId = id, name: String = name, age: Int = age): Person = {
    new Person(id, name, age)
  }
  def withId(id: io.github.ajatix.Globals.PersonId): Person = {
    copy(id = id)
  }
  def withName(name: String): Person = {
    copy(name = name)
  }
  def withAge(age: Int): Person = {
    copy(age = age)
  }
}
object Person {
  def apply(id: io.github.ajatix.Globals.PersonId, name: String, age: Int): Person = new Person(id, name, age)
}

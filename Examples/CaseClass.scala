package Examples

trait Something
case class Person(name: String) extends Something
case class Car(car_number: String) extends Something
case class Home(address: String, phone: String) extends Something

object CaseClass extends App {
  val result:Option[Something] = Some(Person("foo"))
  result.map { x => println(x) }
  
  val res = result.map {
    case Person(n) => n
    case _ =>
  }
}
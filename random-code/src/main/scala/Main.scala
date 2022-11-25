@main def hello: Unit = 
  // creates a list
  val nums = List(1, 2, 3, 4, 5)
  // concise syntax to double every value in a list
  val doubledNums = nums.map(_ * 2)
  // filter the list
  val filteredNums = nums.filter(_ % 2 == 0)
  // print every list
  println(nums)
  println(doubledNums)
  println(filteredNums)

  // instantiate a dog
  val dog = Dog()
  // use dog methods
  dog.speak()
  dog.wagTail()


trait Animal:
  def speak(): Unit

trait HasTail:
  def wagTail(): Unit

class Dog extends Animal, HasTail:
  def speak(): Unit = println("Woof!")
  def wagTail(): Unit = println("⎞⎜⎛  ⎞⎜⎛")

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

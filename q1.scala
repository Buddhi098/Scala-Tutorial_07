object Q1{
  def filterEvenNumbers(numberList: List[Int]): List[Int] = {
    numberList.filter(num => num % 2 == 0)
  }
  def main(args: Array[String]): Unit={
  val inputList = List(12,23,34,23,23)
  val evenNumbers = filterEvenNumbers(inputList)
  println(evenNumbers)
  }
}

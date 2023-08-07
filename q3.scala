object q3 {
   def main(args: Array[String]): Unit = {
    val inputList: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val outputList: List[Int] = filterPrime(inputList)
    println(outputList)
    }

    def isPrime(num: Int): Boolean = {
      var i: Int = 2 
      val isDivide = (n: Int, j: Int) => n % j == 0
      while (i < num) {
        if (isDivide(num, i)) {
          return false
        }
        i += 1
      }
      return true
    }

    def filterPrime(numbers: List[Int]): List[Int] = {
      numbers.filter(isPrime)
    }
}

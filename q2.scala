object Q2{
    def squareGenerator(list: List[Int]): List[Int] = {
        list.map(n => n * n)
    }
    def main(args: Array[String]): Unit={
        val inputList: List[Int] = List(23,2,3,4)
        val outputList: List[Int] = squareGenerator(inputList)
        println(outputList)
    }
}
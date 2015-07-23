package tony.zhou.typical.sort

object QuickSortFunctional {
  def sort(ints: Array[Int]): Array[Int] = {
    if (ints.length <= 1) ints
    else {
      val pivot = ints(ints.length / 2)
      Array.concat(sort(ints filter (pivot >)), ints filter (pivot ==), sort(ints filter (pivot <)))
    }
  }

  def main(args: Array[String]) {
    println(sort(Array(3, 97, 74, 29, 1, 9, 98, 4, 2, 7, 43, 9, 10, 101, 97, 192)).deep.mkString(", "))
  }
}
